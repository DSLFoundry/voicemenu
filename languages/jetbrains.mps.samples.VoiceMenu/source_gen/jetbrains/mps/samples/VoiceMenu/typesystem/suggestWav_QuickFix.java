package jetbrains.mps.samples.VoiceMenu.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;

public class suggestWav_QuickFix extends QuickFix_Runtime {
  public suggestWav_QuickFix() {
    super(new SNodePointer("r:a3d91a5b-5d89-4c37-bb4a-da96d8c37ef1(jetbrains.mps.samples.VoiceMenu.typesystem)", "3333261045548888742"));
  }
  public String getDescription(SNode node) {
    return "Replace extension with .wav";
  }
  public void execute(SNode node) {
    int indexOfDot = SPropertyOperations.getString(SNodeOperations.cast(node, CONCEPTS.Activity$oQ), PROPS.playback$y04k).lastIndexOf(".");
    String substring = SPropertyOperations.getString(SNodeOperations.cast(node, CONCEPTS.Activity$oQ), PROPS.playback$y04k).substring(0, indexOfDot);

    SPropertyOperations.assign(SNodeOperations.cast(node, CONCEPTS.Activity$oQ), PROPS.playback$y04k, substring + ".wav");
    SPropertyOperations.assign(SNodeOperations.cast(node, CONCEPTS.Activity$oQ), PROPS.PBisFile$hBw1, true);
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Activity$oQ = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, "jetbrains.mps.samples.VoiceMenu.structure.Activity");
  }

  private static final class PROPS {
    /*package*/ static final SProperty playback$y04k = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x25806c66fbe600f7L, "playback");
    /*package*/ static final SProperty PBisFile$hBw1 = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x2e421f42b33aaf7fL, "PBisFile");
  }
}
