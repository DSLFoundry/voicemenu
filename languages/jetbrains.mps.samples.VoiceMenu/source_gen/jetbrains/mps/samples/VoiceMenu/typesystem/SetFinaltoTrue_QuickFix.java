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

public class SetFinaltoTrue_QuickFix extends QuickFix_Runtime {
  public SetFinaltoTrue_QuickFix() {
    super(new SNodePointer("r:a3d91a5b-5d89-4c37-bb4a-da96d8c37ef1(jetbrains.mps.samples.VoiceMenu.typesystem)", "5461963470562242047"));
  }
  public String getDescription(SNode node) {
    return "Set as Final";
  }
  public void execute(SNode node) {
    try {
      SPropertyOperations.assign(SNodeOperations.cast(node, CONCEPTS.DirectCall$7C), PROPS.isFinal$sgnO, true);

    } catch (Exception e) {
    }
    try {
      SPropertyOperations.assign(SNodeOperations.cast(node, CONCEPTS.Record$69), PROPS.isFinal$DiZZ, true);

    } catch (Exception e) {
    }
    try {
      SPropertyOperations.assign(SNodeOperations.cast(node, CONCEPTS.GetInfo$95), PROPS.isFinal$sihs, true);

    } catch (Exception e) {
    }
    try {
      SPropertyOperations.assign(SNodeOperations.cast(node, CONCEPTS.Other$87), PROPS.isFinal$swjV, true);

    } catch (Exception e) {
    }
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept DirectCall$7C = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac8L, "jetbrains.mps.samples.VoiceMenu.structure.DirectCall");
    /*package*/ static final SConcept Record$69 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x420d89797f0d16f6L, "jetbrains.mps.samples.VoiceMenu.structure.Record");
    /*package*/ static final SConcept GetInfo$95 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980acbL, "jetbrains.mps.samples.VoiceMenu.structure.GetInfo");
    /*package*/ static final SConcept Other$87 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac9L, "jetbrains.mps.samples.VoiceMenu.structure.Other");
  }

  private static final class PROPS {
    /*package*/ static final SProperty isFinal$sgnO = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac8L, 0x420d89797f56bce4L, "isFinal");
    /*package*/ static final SProperty isFinal$DiZZ = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x420d89797f0d16f6L, 0x420d89797f56bd93L, "isFinal");
    /*package*/ static final SProperty isFinal$sihs = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980acbL, 0x420d89797f56bd37L, "isFinal");
    /*package*/ static final SProperty isFinal$swjV = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac9L, 0x420d89797f56bde6L, "isFinal");
  }
}
