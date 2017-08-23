package jetbrains.mps.samples.VoiceMenu.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class tmpActivity_QuickFix extends QuickFix_Runtime {
  public tmpActivity_QuickFix() {
    super(new SNodePointer("r:a3d91a5b-5d89-4c37-bb4a-da96d8c37ef1(jetbrains.mps.samples.VoiceMenu.typesystem)", "8529367682053882342"));
  }
  public String getDescription(SNode node) {
    return "make declaration and initiliazation";
  }
  public void execute(SNode node) {
    SNode myEvent = SNodeFactoryOperations.addNewChild(((SNode) tmpActivity_QuickFix.this.getField("srcMenu")[0]), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, "jetbrains.mps.samples.VoiceMenu.structure.Event")));
    SPropertyOperations.set(myEvent, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, "jetbrains.mps.samples.VoiceMenu.structure.tmpActivity")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
    SPropertyOperations.set(myEvent, MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, 0x5b6b060cf3fde310L, "trigger"), SPropertyOperations.getString(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, "jetbrains.mps.samples.VoiceMenu.structure.tmpActivity")), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, 0x765e66b75f7f00c3L, "trigger")));
    ListSequence.fromList(SLinkOperations.getChildren(((SNode) tmpActivity_QuickFix.this.getField("srcMenu")[0]), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"))).addElement(myEvent);

    SNode myActivity = SLinkOperations.addNewChild(((SNode) tmpActivity_QuickFix.this.getField("srcMenu")[0]), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities"), MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, "jetbrains.mps.samples.VoiceMenu.structure.Activity"));
    SLinkOperations.setTarget(myActivity, MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08d2L, "commands"), SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, "jetbrains.mps.samples.VoiceMenu.structure.tmpActivity")), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, 0x765e66b75f8c490eL, "commands")));
    SLinkOperations.setTarget(myActivity, MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "event"), myEvent);
    if (isNotEmptyString(SPropertyOperations.getString(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, "jetbrains.mps.samples.VoiceMenu.structure.tmpActivity")), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, 0x25806c66fbe600f7L, "greeting")))) {
      SPropertyOperations.set(myActivity, MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x25806c66fbe600f7L, "greeting"), SPropertyOperations.getString(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, "jetbrains.mps.samples.VoiceMenu.structure.tmpActivity")), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x765e66b75f7f00b8L, 0x25806c66fbe600f7L, "greeting")));
    }


    SNodeOperations.deleteNode(node);

  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
