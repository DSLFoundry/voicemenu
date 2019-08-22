package jetbrains.mps.samples.Text.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class Extend_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("exten => ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.target$W399));
    tgs.append(",");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.priority$W3a7));
    tgs.append(",");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.action$W3b$));
    if ((SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.argument$W3nF) != null)) {
      tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.argument$W3nF));
    }
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty target$W399 = MetaAdapterFactory.getProperty(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9db2L, "target");
    /*package*/ static final SProperty priority$W3a7 = MetaAdapterFactory.getProperty(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9db4L, "priority");
    /*package*/ static final SProperty action$W3b$ = MetaAdapterFactory.getProperty(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9db7L, "action");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink argument$W3nF = MetaAdapterFactory.getContainmentLink(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9dbbL, "argument");
  }
}
