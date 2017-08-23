package jetbrains.mps.samples.VoiceMenuTabularEditor.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.ArrowsStyleClass;
import jetbrains.mps.samples.VoiceMenu.editor.RemoveEventAndActivity;

/*package*/ class Name_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Name_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_5glmts_a();
  }

  private EditorCell createCollection_5glmts_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_5glmts_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    new BracketsStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_5glmts_a0());
    editorCell.addEditorCell(createConstant_5glmts_b0());
    editorCell.addEditorCell(createConstant_5glmts_c0());
    editorCell.addEditorCell(createConstant_5glmts_d0());
    editorCell.addEditorCell(createConstant_5glmts_e0());
    return editorCell;
  }
  private EditorCell createConstant_5glmts_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "  ");
    editorCell.setCellId("Constant_5glmts_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5glmts_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "BUTTON");
    editorCell.setCellId("Constant_5glmts_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.black));
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5glmts_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " ");
    editorCell.setCellId("Constant_5glmts_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5glmts_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "  ");
    editorCell.setCellId("Constant_5glmts_d0");
    Style style = new StyleImpl();
    new ArrowsStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    RemoveEventAndActivity.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5glmts_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " ACTIVITY");
    editorCell.setCellId("Constant_5glmts_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.black));
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
