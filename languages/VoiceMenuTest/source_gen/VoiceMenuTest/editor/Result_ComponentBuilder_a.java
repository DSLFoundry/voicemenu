package VoiceMenuTest.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.core.editor.BaseStyleSheet_StyleSheet.CommentStyleClass;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.openapi.editor.menus.transformation.SPropertyInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.core.behavior.PropertyAttribute__BehaviorDescriptor;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;

/*package*/ class Result_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Result_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
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
    editorCell.setCellId("Collection_k7o2la_a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    if (nodeCondition_k7o2la_a0a()) {
      editorCell.addEditorCell(createConstant_0());
    }
    if (nodeCondition_k7o2la_a1a()) {
      editorCell.addEditorCell(createConstant_1());
    }
    if (nodeCondition_k7o2la_a2a()) {
      editorCell.addEditorCell(createCollection_1());
    }
    return editorCell;
  }
  private boolean nodeCondition_k7o2la_a0a() {
    return SEnumOperations.isMember(SPropertyOperations.getEnum(SLinkOperations.getTarget(myNode, LINKS.evaluation$kokw), PROPS.result$7die), 0x72ec05e3886dfc13L);
  }
  private boolean nodeCondition_k7o2la_a1a() {
    return SEnumOperations.isMember(SPropertyOperations.getEnum(SLinkOperations.getTarget(myNode, LINKS.evaluation$kokw), PROPS.result$7die), 0x72ec05e3886dfc17L);
  }
  private boolean nodeCondition_k7o2la_a2a() {
    return SEnumOperations.isMember(SPropertyOperations.getEnum(SLinkOperations.getTarget(myNode, LINKS.evaluation$kokw), PROPS.result$7die), 0x72ec05e3886dfc14L);
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Success");
    editorCell.setCellId("Constant_k7o2la_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Unknown");
    editorCell.setCellId("Constant_k7o2la_b0");
    Style style = new StyleImpl();
    new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_1() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_k7o2la_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_2());
    editorCell.addEditorCell(createRefCell_0());
    return editorCell;
  }
  private EditorCell createConstant_2() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Failure");
    editorCell.setCellId("Constant_k7o2la_a2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.red));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, LINKS.evaluation$kokw, CONCEPTS.StepEvaluation$6G, "evaluation", getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, SNode effectiveNode, SNode node) {
        EditorCell cell = new Inline_Builder0(getEditorContext(), myNode, effectiveNode).createCell();
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setNoTargetText("<no evaluation>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getSRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setSRole(LINKS.evaluation$kokw);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_0() {
      getCellFactory().pushCellContext();
      try {
        final SProperty property = PROPS.message$7dKg;
        getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
        EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, true, false), myNode);
        editorCell.setDefaultText("<no message>");
        editorCell.setCellId("R_property_message");
        Style style = new StyleImpl();
        new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
        editorCell.getStyle().putAll(style);
        editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
        setCellContext(editorCell);
        Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
        Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property);
          }
        });
        if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
          EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
          return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
        } else
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink evaluation$kokw = MetaAdapterFactory.getContainmentLink(0x25057fc953374f2eL, 0x9703a17097079193L, 0x72ec05e3886dfc0fL, 0x72ec05e3886dfc64L, "evaluation");
  }

  private static final class PROPS {
    /*package*/ static final SProperty result$7die = MetaAdapterFactory.getProperty(0x25057fc953374f2eL, 0x9703a17097079193L, 0x72ec05e3886dfc10L, 0x72ec05e3886dfc1bL, "result");
    /*package*/ static final SProperty message$7dKg = MetaAdapterFactory.getProperty(0x25057fc953374f2eL, 0x9703a17097079193L, 0x72ec05e3886dfc10L, 0x72ec05e3886dfc1dL, "message");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept StepEvaluation$6G = MetaAdapterFactory.getConcept(0x25057fc953374f2eL, 0x9703a17097079193L, 0x72ec05e3886dfc10L, "VoiceMenuTest.structure.StepEvaluation");
    /*package*/ static final SConcept PropertyAttribute$Gb = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute");
  }
}