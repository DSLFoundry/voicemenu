package jetbrains.mps.samples.VoiceMenu.sandbox;

/*Generated by MPS */

import java.awt.event.ActionListener;
import JavaVoiceMenu.runtime.Event;
import java.util.ArrayList;
import JavaVoiceMenu.runtime.Style;
import JavaVoiceMenu.runtime.Behaviour;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import JavaVoiceMenu.runtime.Data;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import JavaVoiceMenu.runtime.Variables;

public class map_WorkSpace implements ActionListener {


  public static map_WorkSpace instance;

  public static void initHashMap() {
    // Workspace -> Menu 

    {
      Event Interent_a0 = new Event("Interent", "3");


      Interent_a0.setAction("back");


      Interent_a0.childs = new ArrayList<Event>();


      // test <!TextGen not found for 'jetbrains.mps.samples.VoiceMenu.structure.Back'!>


    }
    {
      Event Free_call_b0 = new Event("Free call", "2");

      Free_call_b0.setGreeting("Sample toast");



      Free_call_b0.childs = new ArrayList<Event>();

      System.out.println("menu");

      // test 


    }
  }

  public static void main(String[] args) {
    initHashMap();
    Style.main_Greeting = "";
    map_WorkSpace.initHashMap();
    Behaviour.runInitSetup();
  }

  public static void initView() {
    Style.setContent();
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
    if (!((Variables.path != null && Variables.path.length() > 0))) {
      Behaviour.runLogic(event);
    }
  }

}
