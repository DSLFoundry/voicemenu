<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:58bf119a-d092-45c2-92e9-e3033a50db5d(voicemenu.plugin)">
  <persistence version="9" />
  <languages>
    <use id="28f9e497-3b42-4291-aeba-0a1039153ab1" name="jetbrains.mps.lang.plugin" version="2" />
    <use id="ef7bf5ac-d06c-4342-b11d-e42104eb9343" name="jetbrains.mps.lang.plugin.standalone" version="0" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="8" />
    <use id="63650c59-16c8-498a-99c8-005c7ee9515d" name="jetbrains.mps.lang.access" version="0" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="5" />
  </languages>
  <imports>
    <import index="fpme" ref="86441d7a-e194-42da-81a5-2161ec62a379/java:jetbrains.mps.workbench.dialogs.project.newproject(MPS.Workbench/)" />
    <import index="9ti4" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.extensions(MPS.IDEA/)" />
    <import index="prb" ref="r:7e76c46c-6d36-4eff-a91f-bdb01cc6d244(voicemenu.plugin.project.wizard)" />
    <import index="bd8o" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.application(MPS.IDEA/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="ef7bf5ac-d06c-4342-b11d-e42104eb9343" name="jetbrains.mps.lang.plugin.standalone">
      <concept id="481983775135178851" name="jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginInitBlock" flags="in" index="2uRRBj" />
      <concept id="481983775135178840" name="jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDeclaration" flags="ng" index="2uRRBC">
        <child id="481983775135178842" name="initBlock" index="2uRRBE" />
        <child id="481983775135178843" name="disposeBlock" index="2uRRBF" />
        <child id="481983775135178844" name="fieldDeclaration" index="2uRRBG" />
      </concept>
      <concept id="481983775135178846" name="jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDisposeBlock" flags="in" index="2uRRBI" />
      <concept id="7520713872864775836" name="jetbrains.mps.lang.plugin.standalone.structure.StandalonePluginDescriptor" flags="ng" index="2DaZZR" />
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1144226303539" name="jetbrains.mps.baseLanguage.structure.ForeachStatement" flags="nn" index="1DcWWT">
        <child id="1144226360166" name="iterable" index="1DdaDG" />
      </concept>
      <concept id="1144230876926" name="jetbrains.mps.baseLanguage.structure.AbstractForStatement" flags="nn" index="1DupvO">
        <child id="1144230900587" name="variable" index="1Duv9x" />
      </concept>
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
    </language>
    <language id="443f4c36-fcf5-4eb6-9500-8d06ed259e3e" name="jetbrains.mps.baseLanguage.classifiers">
      <concept id="1213999088275" name="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration" flags="ig" index="2BZ0e9" />
      <concept id="1213999117680" name="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" flags="nn" index="2BZ7hE" />
      <concept id="1205752633985" name="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression" flags="nn" index="2WthIp" />
      <concept id="1205756064662" name="jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation" flags="ng" index="2WEnae">
        <reference id="1205756909548" name="member" index="2WH_rO" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2DaZZR" id="3iKYqaSkh35" />
  <node concept="2uRRBC" id="3iKYqaSkvKP">
    <property role="TrG5h" value="VoiceMenu" />
    <node concept="2BZ0e9" id="3iKYqaSkw5A" role="2uRRBG">
      <property role="TrG5h" value="voiceMenuProjectGroup" />
      <node concept="3Tm6S6" id="3iKYqaSkw5B" role="1B3o_S" />
      <node concept="3uibUv" id="3iKYqaSkwiT" role="1tU5fm">
        <ref role="3uigEE" to="prb:3iKYqaSkh3l" resolve="VoiceMenuProjectGroup" />
      </node>
      <node concept="2ShNRf" id="3iKYqaSkwj2" role="33vP2m">
        <node concept="HV5vD" id="3iKYqaSkwnx" role="2ShVmc">
          <ref role="HV5vE" to="prb:3iKYqaSkh3l" resolve="VoiceMenuProjectGroup" />
        </node>
      </node>
    </node>
    <node concept="2uRRBj" id="3iKYqaSkvQ$" role="2uRRBE">
      <node concept="3clFbS" id="3iKYqaSkvQ_" role="2VODD2">
        <node concept="3SKdUt" id="6a_4K7zDokz" role="3cqZAp">
          <node concept="3SKdUq" id="6a_4K7zDok_" role="3SKWNk">
            <property role="3SKdUp" value="Hack for remove Development and Other groups from New Project Wizard" />
          </node>
        </node>
        <node concept="3clFbJ" id="1e3aG$RNp$g" role="3cqZAp">
          <node concept="3clFbS" id="1e3aG$RNp$i" role="3clFbx">
            <node concept="1DcWWT" id="6a_4K7zDm_I" role="3cqZAp">
              <node concept="3clFbS" id="6a_4K7zDm_K" role="2LFqv$">
                <node concept="3clFbF" id="6a_4K7zDnrb" role="3cqZAp">
                  <node concept="2OqwBi" id="6a_4K7zDn__" role="3clFbG">
                    <node concept="2OqwBi" id="6a_4K7zDnrd" role="2Oq$k0">
                      <node concept="2YIFZM" id="6a_4K7zDnre" role="2Oq$k0">
                        <ref role="1Pybhc" to="9ti4:~Extensions" resolve="Extensions" />
                        <ref role="37wK5l" to="9ti4:~Extensions.getRootArea():com.intellij.openapi.extensions.ExtensionsArea" resolve="getRootArea" />
                      </node>
                      <node concept="liA8E" id="6a_4K7zDnrf" role="2OqNvi">
                        <ref role="37wK5l" to="9ti4:~ExtensionsArea.getExtensionPoint(com.intellij.openapi.extensions.ExtensionPointName):com.intellij.openapi.extensions.ExtensionPoint" resolve="getExtensionPoint" />
                        <node concept="10M0yZ" id="6a_4K7zDnrg" role="37wK5m">
                          <ref role="3cqZAo" to="fpme:~ProjectTemplatesGroup.EP_NAME" resolve="EP_NAME" />
                          <ref role="1PxDUh" to="fpme:~ProjectTemplatesGroup" resolve="ProjectTemplatesGroup" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="6a_4K7zDnR5" role="2OqNvi">
                      <ref role="37wK5l" to="9ti4:~ExtensionPoint.unregisterExtension(java.lang.Object):void" resolve="unregisterExtension" />
                      <node concept="37vLTw" id="6a_4K7zDnYv" role="37wK5m">
                        <ref role="3cqZAo" node="6a_4K7zDm_L" resolve="group" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWsn" id="6a_4K7zDm_L" role="1Duv9x">
                <property role="TrG5h" value="group" />
                <node concept="3uibUv" id="6a_4K7zDneK" role="1tU5fm">
                  <ref role="3uigEE" to="fpme:~ProjectTemplatesGroup" resolve="ProjectTemplatesGroup" />
                </node>
              </node>
              <node concept="2OqwBi" id="6a_4K7zDljf" role="1DdaDG">
                <node concept="2OqwBi" id="6a_4K7zDkRZ" role="2Oq$k0">
                  <node concept="2YIFZM" id="6a_4K7zDkS0" role="2Oq$k0">
                    <ref role="37wK5l" to="9ti4:~Extensions.getRootArea():com.intellij.openapi.extensions.ExtensionsArea" resolve="getRootArea" />
                    <ref role="1Pybhc" to="9ti4:~Extensions" resolve="Extensions" />
                  </node>
                  <node concept="liA8E" id="6a_4K7zDkS1" role="2OqNvi">
                    <ref role="37wK5l" to="9ti4:~ExtensionsArea.getExtensionPoint(com.intellij.openapi.extensions.ExtensionPointName):com.intellij.openapi.extensions.ExtensionPoint" resolve="getExtensionPoint" />
                    <node concept="10M0yZ" id="6a_4K7zDkS2" role="37wK5m">
                      <ref role="3cqZAo" to="fpme:~ProjectTemplatesGroup.EP_NAME" resolve="EP_NAME" />
                      <ref role="1PxDUh" to="fpme:~ProjectTemplatesGroup" resolve="ProjectTemplatesGroup" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="6a_4K7zDlB$" role="2OqNvi">
                  <ref role="37wK5l" to="9ti4:~ExtensionPoint.getExtensions():java.lang.Object[]" resolve="getExtensions" />
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="1e3aG$RND1g" role="3clFbw">
            <node concept="Xl_RD" id="1e3aG$RNCzG" role="2Oq$k0">
              <property role="Xl_RC" value="Voice Menu" />
            </node>
            <node concept="liA8E" id="1e3aG$RNDVT" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
              <node concept="2OqwBi" id="1e3aG$RNvoP" role="37wK5m">
                <node concept="2YIFZM" id="1e3aG$RNwNN" role="2Oq$k0">
                  <ref role="37wK5l" to="bd8o:~ApplicationNamesInfo.getInstance():com.intellij.openapi.application.ApplicationNamesInfo" resolve="getInstance" />
                  <ref role="1Pybhc" to="bd8o:~ApplicationNamesInfo" resolve="ApplicationNamesInfo" />
                </node>
                <node concept="liA8E" id="1e3aG$RNx0E" role="2OqNvi">
                  <ref role="37wK5l" to="bd8o:~ApplicationNamesInfo.getFullProductName():java.lang.String" resolve="getFullProductName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="6a_4K7zDm1z" role="3cqZAp" />
        <node concept="3clFbF" id="2EBkEvJJt8P" role="3cqZAp">
          <node concept="2OqwBi" id="2EBkEvJJtjC" role="3clFbG">
            <node concept="2OqwBi" id="2EBkEvJJta9" role="2Oq$k0">
              <node concept="2YIFZM" id="2EBkEvJJt9z" role="2Oq$k0">
                <ref role="37wK5l" to="9ti4:~Extensions.getRootArea():com.intellij.openapi.extensions.ExtensionsArea" resolve="getRootArea" />
                <ref role="1Pybhc" to="9ti4:~Extensions" resolve="Extensions" />
              </node>
              <node concept="liA8E" id="2EBkEvJJtbI" role="2OqNvi">
                <ref role="37wK5l" to="9ti4:~ExtensionsArea.getExtensionPoint(com.intellij.openapi.extensions.ExtensionPointName):com.intellij.openapi.extensions.ExtensionPoint" resolve="getExtensionPoint" />
                <node concept="10M0yZ" id="2EBkEvJJsbL" role="37wK5m">
                  <ref role="1PxDUh" to="fpme:~ProjectTemplatesGroup" resolve="ProjectTemplatesGroup" />
                  <ref role="3cqZAo" to="fpme:~ProjectTemplatesGroup.EP_NAME" resolve="EP_NAME" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="2EBkEvJJtsp" role="2OqNvi">
              <ref role="37wK5l" to="9ti4:~ExtensionPoint.registerExtension(java.lang.Object):void" resolve="registerExtension" />
              <node concept="2OqwBi" id="2EBkEvJJvhH" role="37wK5m">
                <node concept="2WthIp" id="2EBkEvJJvhK" role="2Oq$k0" />
                <node concept="2BZ7hE" id="3iKYqaSkwxZ" role="2OqNvi">
                  <ref role="2WH_rO" node="3iKYqaSkw5A" resolve="voiceMenuProjectGroup" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="6a_4K7zDkLj" role="3cqZAp" />
      </node>
    </node>
    <node concept="2uRRBI" id="3iKYqaSkw3l" role="2uRRBF">
      <node concept="3clFbS" id="3iKYqaSkw3m" role="2VODD2">
        <node concept="3clFbF" id="3iKYqaSkw3x" role="3cqZAp">
          <node concept="2OqwBi" id="2EBkEvJJvrr" role="3clFbG">
            <node concept="2OqwBi" id="2EBkEvJJvrs" role="2Oq$k0">
              <node concept="2YIFZM" id="2EBkEvJJvrt" role="2Oq$k0">
                <ref role="1Pybhc" to="9ti4:~Extensions" resolve="Extensions" />
                <ref role="37wK5l" to="9ti4:~Extensions.getRootArea():com.intellij.openapi.extensions.ExtensionsArea" resolve="getRootArea" />
              </node>
              <node concept="liA8E" id="2EBkEvJJvru" role="2OqNvi">
                <ref role="37wK5l" to="9ti4:~ExtensionsArea.getExtensionPoint(com.intellij.openapi.extensions.ExtensionPointName):com.intellij.openapi.extensions.ExtensionPoint" resolve="getExtensionPoint" />
                <node concept="10M0yZ" id="2EBkEvJJvrv" role="37wK5m">
                  <ref role="3cqZAo" to="fpme:~ProjectTemplatesGroup.EP_NAME" resolve="EP_NAME" />
                  <ref role="1PxDUh" to="fpme:~ProjectTemplatesGroup" resolve="ProjectTemplatesGroup" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="2EBkEvJJvrw" role="2OqNvi">
              <ref role="37wK5l" to="9ti4:~ExtensionPoint.unregisterExtension(java.lang.Object):void" resolve="unregisterExtension" />
              <node concept="2OqwBi" id="2EBkEvJJvrx" role="37wK5m">
                <node concept="2WthIp" id="2EBkEvJJvry" role="2Oq$k0" />
                <node concept="2BZ7hE" id="3iKYqaSkwGh" role="2OqNvi">
                  <ref role="2WH_rO" node="3iKYqaSkw5A" resolve="voiceMenuProjectGroup" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>
