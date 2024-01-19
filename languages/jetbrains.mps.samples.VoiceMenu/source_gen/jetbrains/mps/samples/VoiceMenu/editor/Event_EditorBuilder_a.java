package jetbrains.mps.samples.VoiceMenu.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.BracketsStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Objects;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.HardCodedTextStyleClass;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.openapi.editor.menus.transformation.SPropertyInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.core.behavior.PropertyAttribute__BehaviorDescriptor;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.ArrowsStyleClass;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.DeclarationsStyleClass;
import jetbrains.mps.nodeEditor.cells.EditorCell_ContextAssistantComponent;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

/*package*/ class Event_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Event_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ymj9mh_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createCollection_1());
    return editorCell;
  }
  private EditorCell createCollection_1() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ymj9mh_a0");
    Style style = new StyleImpl();
    new BracketsStyleClass(this).apply(style, editorCell);
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_ymj9mh_a0a0());
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createProperty_0());
    editorCell.addEditorCell(createConstant_1());
    editorCell.addEditorCell(createProperty_1());
    if (nodeCondition_ymj9mh_a4a0()) {
      editorCell.addEditorCell(createContextAssistant_0());
    }
    return editorCell;
  }
  private boolean nodeCondition_ymj9mh_a4a0() {

    if (isEmptyString(SPropertyOperations.getString(myNode, PROPS.trigger$DqFK))) {
      return true;
    }
    if (isNotEmptyString(SPropertyOperations.getString(myNode, PROPS.trigger$DqFK)) && isEmptyString(SPropertyOperations.getString(myNode, PROPS.name$MnvL))) {
      return false;
    }
    boolean b = Sequence.fromIterable(SNodeOperations.ofConcept(SNodeOperations.getChildren(SNodeOperations.getParent(myNode)), CONCEPTS.Activity$Oz)).any((it) -> SPropertyOperations.getString(SLinkOperations.getTarget(it, LINKS.event$pmgi), PROPS.trigger$DqFK) == SPropertyOperations.getString(myNode, PROPS.trigger$DqFK));
    if (!(b)) {
      return true;
    }
    return false;
  }
  private SNode _StyleParameter_QueryFunction_ymj9mh_a0a0() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), CONCEPTS.Menu$By), LINKS.activities$gAHC)).findFirst((it) -> Objects.equals(SLinkOperations.getTarget(it, LINKS.event$pmgi), getNode()));
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "On button:");
    editorCell.setCellId("Constant_ymj9mh_a0a");
    Style style = new StyleImpl();
    new HardCodedTextStyleClass(this).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_ymj9mh_a1a0a());
    editorCell.getStyle().putAll(style);
    RemoveEventAndActivity.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private SNode _StyleParameter_QueryFunction_ymj9mh_a1a0a() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), CONCEPTS.Menu$By), LINKS.activities$gAHC)).findFirst((it) -> Objects.equals(SLinkOperations.getTarget(it, LINKS.event$pmgi), getNode()));
  }
  private EditorCell createProperty_0() {
    getCellFactory().pushCellContext();
    try {
      final SProperty property = PROPS.trigger$DqFK;
      getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
      editorCell.setDefaultText("Number of button");
      editorCell.setCellId("property_trigger");
      Style style = new StyleImpl();
      style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_ymj9mh_a0b0a());
      editorCell.getStyle().putAll(style);
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      setCellContext(editorCell);
      Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
      Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where((it) -> Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property));
      if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    } finally {
      getCellFactory().popCellContext();
    }
  }
  private SNode _StyleParameter_QueryFunction_ymj9mh_a0b0a() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), CONCEPTS.Menu$By), LINKS.activities$gAHC)).findFirst((it) -> Objects.equals(SLinkOperations.getTarget(it, LINKS.event$pmgi), getNode()));
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " --> ");
    editorCell.setCellId("Constant_ymj9mh_c0a");
    Style style = new StyleImpl();
    new ArrowsStyleClass(this).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    RemoveEventAndActivity.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_1() {
    getCellFactory().pushCellContext();
    try {
      final SProperty property = PROPS.name$MnvL;
      getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
      editorCell.setDefaultText("Name of activity");
      editorCell.setCellId("property_name");
      Style style = new StyleImpl();
      new DeclarationsStyleClass(this).apply(style, editorCell);
      style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_ymj9mh_a0d0a());
      editorCell.getStyle().putAll(style);
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      setCellContext(editorCell);
      Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
      Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where((it) -> Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property));
      if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    } finally {
      getCellFactory().popCellContext();
    }
  }
  private SNode _StyleParameter_QueryFunction_ymj9mh_a0d0a() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), CONCEPTS.Menu$By), LINKS.activities$gAHC)).findFirst((it) -> Objects.equals(SLinkOperations.getTarget(it, LINKS.event$pmgi), getNode()));
  }
  private EditorCell createContextAssistant_0() {
    EditorCell editorCell = new EditorCell_ContextAssistantComponent(getEditorContext(), myNode);
    editorCell.setCellId("ContextAssistant_ymj9mh_e0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.isEmpty();
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }

  private static final class PROPS {
    /*package*/ static final SProperty trigger$DqFK = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, 0x5b6b060cf3fde310L, "trigger");
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Activity$Oz = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, "jetbrains.mps.samples.VoiceMenu.structure.Activity");
    /*package*/ static final SConcept Menu$By = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, "jetbrains.mps.samples.VoiceMenu.structure.Menu");
    /*package*/ static final SConcept PropertyAttribute$Gb = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink event$pmgi = MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "event");
    /*package*/ static final SContainmentLink activities$gAHC = MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities");
  }
}
