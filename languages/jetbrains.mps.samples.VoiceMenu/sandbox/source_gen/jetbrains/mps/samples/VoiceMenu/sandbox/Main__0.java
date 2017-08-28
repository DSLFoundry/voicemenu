package jetbrains.mps.samples.VoiceMenu.sandbox;

/*Generated by MPS */

import java.awt.event.ActionListener;
import JavaVoiceMenu.runtime.Event;
import java.util.ArrayList;
import JavaVoiceMenu.runtime.Variables;
import JavaVoiceMenu.runtime.Behaviour;
import JavaVoiceMenu.runtime.Style;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import JavaVoiceMenu.runtime.Data;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main__0 implements ActionListener {


  public static Main__0 instance;

  public static void initHashMap() {

    Event Home = new Event("myVoiceMenu3", "0");
    Home.setAction("");
    Home.setGreeting("");
    Home.childs = new ArrayList<Event>();
    Variables.main_Text = "myVoiceMenu3";
    Variables.myHashMap.put("0", Home);


    Event _Five_qy4hiv_c0 = new Event("Five", "5");
    _Five_qy4hiv_c0.setAction("");
    _Five_qy4hiv_c0.setGreeting("");
    _Five_qy4hiv_c0.childs = new ArrayList<Event>();
    Variables.path = Variables.path + _Five_qy4hiv_c0.trigger;
    Variables.myHashMap.put(Variables.path, _Five_qy4hiv_c0);
    _Five_qy4hiv_c0.setAction("other");
    Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
    _Five_qy4hiv_c0.childs = new ArrayList<Event>();
    Event _Nine_qy4hiv_a0 = new Event("Nine", "9");
    _Nine_qy4hiv_a0.setAction("");
    _Nine_qy4hiv_a0.setGreeting("");
    _Nine_qy4hiv_a0.childs = new ArrayList<Event>();
    Variables.path = Variables.path + _Nine_qy4hiv_a0.trigger;
    Variables.myHashMap.put(Variables.path, _Nine_qy4hiv_a0);
    _Nine_qy4hiv_a0.setAction("other");
    Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
    _Nine_qy4hiv_a0.childs = new ArrayList<Event>();
    Event _Action_263_qy4hiv_b0 = new Event("Action_263", "6");
    _Action_263_qy4hiv_b0.setAction("");
    _Action_263_qy4hiv_b0.setGreeting("");
    _Action_263_qy4hiv_b0.childs = new ArrayList<Event>();
    Variables.path = Variables.path + _Action_263_qy4hiv_b0.trigger;
    Variables.myHashMap.put(Variables.path, _Action_263_qy4hiv_b0);
    Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
    _Action_263_qy4hiv_b0.childs = new ArrayList<Event>();

    Home.childs.add(_Nine_qy4hiv_a0);
    Home.childs.add(_Action_263_qy4hiv_b0);
    Home.childs.add(_Five_qy4hiv_c0);
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Main__0();
    Main__0.initHashMap();
    initView();
    Behaviour.runInitSetup();
  }

  public static void initView() {
    Style.setContent();
    addButtons(Style.myPanelOfButtons);
    Style.myPhone.add(Style.myPanelOfButtons, BorderLayout.SOUTH);
    Style.setFrame();
  }

  public static void addButtons(JPanel myPanelOfButtons) {
    for (Data.Status item : Data.Status.values()) {
      JButton button = new JButton(item.getCode());
      button.setActionCommand(item.getCode());
      button.addActionListener(instance);
      button.setPreferredSize(new Dimension(78, 76));
      Border border = new LineBorder(Color.white, 13);
      button.setBorder(border);
      myPanelOfButtons.add(button);
    }
  }
  @Override
  public void actionPerformed(ActionEvent event) {
    if (!(((Variables.path == null || Variables.path.length() == 0) || Variables.finished == true || Variables.started == false))) {
      try {
        Behaviour.runLogic(event);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
