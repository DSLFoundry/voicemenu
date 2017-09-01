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

public class Main_ implements ActionListener {


  public static Main_ instance;

  public static void initHashMap() {

    Event Home = new Event("Jet-Mobile", "0");
    Home.setAction("", true);
    Home.setGreeting("Hello, welcome in Jet-Mobile");
    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "Jet-Mobile";
    Variables.myHashMap.put("0", Home);


    Event var_m25aj_a0 = new Event("Internet", "1");
    var_m25aj_a0.isFinal = false;
    var_m25aj_a0.setAction("", false);
    var_m25aj_a0.setGreeting("");
    var_m25aj_a0.setGreeting("Did you know that our internet is faster than ever?");
    var_m25aj_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", var_m25aj_a0);
    Event var_m25aj_a0a0 = new Event("Discount", "1");
    var_m25aj_a0a0.isFinal = false;
    var_m25aj_a0a0.setAction("", false);
    var_m25aj_a0a0.setGreeting("");
    var_m25aj_a0a0.setGreeting("Welcome in section of discounts, here is everything cheaper.");
    var_m25aj_a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011", var_m25aj_a0a0);
    Event var_m25aj_a0a0a0 = new Event("Summer discount", "1");
    var_m25aj_a0a0a0.isFinal = false;
    var_m25aj_a0a0a0.setAction("", false);
    var_m25aj_a0a0a0.setGreeting("");
    var_m25aj_a0a0a0.setGreeting("Don't worry, while waiting you will listen your calm music.");
    var_m25aj_a0a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0111", var_m25aj_a0a0a0);
    var_m25aj_a0a0a0.setAction("call", false);
    var_m25aj_a0a0a0.childs = new ArrayList<Event>();
    Event var_m25aj_b0a0a0 = new Event("Hidden discounts", "2");
    var_m25aj_b0a0a0.isFinal = false;
    var_m25aj_b0a0a0.setAction("", false);
    var_m25aj_b0a0a0.setGreeting("");
    var_m25aj_b0a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0112", var_m25aj_b0a0a0);
    var_m25aj_b0a0a0.setAction("getInfo", false);
    var_m25aj_b0a0a0.childs = new ArrayList<Event>();
    Event var_m25aj_c0a0a0 = new Event("Step back", "*");
    var_m25aj_c0a0a0.isFinal = false;
    var_m25aj_c0a0a0.setAction("", false);
    var_m25aj_c0a0a0.setGreeting("");
    var_m25aj_c0a0a0.setGreeting("Going back to the previous menu.");
    var_m25aj_c0a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011*", var_m25aj_c0a0a0);
    var_m25aj_c0a0a0.setAction("back", false);
    var_m25aj_c0a0a0.childs = new ArrayList<Event>();
    var_m25aj_a0a0.childs = new ArrayList<Event>();
    var_m25aj_a0a0.childs.add(var_m25aj_a0a0a0);
    var_m25aj_a0a0.childs.add(var_m25aj_b0a0a0);
    var_m25aj_a0a0.childs.add(var_m25aj_c0a0a0);
    Event var_m25aj_b0a0 = new Event("Data limit", "2");
    var_m25aj_b0a0.isFinal = false;
    var_m25aj_b0a0.setAction("", false);
    var_m25aj_b0a0.setGreeting("");
    var_m25aj_b0a0.setGreeting("Take care this call will be monitored.");
    var_m25aj_b0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("012", var_m25aj_b0a0);
    var_m25aj_b0a0.setAction("call", false);
    var_m25aj_b0a0.childs = new ArrayList<Event>();
    Event var_m25aj_c0a0 = new Event("Return to main menu", "*");
    var_m25aj_c0a0.isFinal = false;
    var_m25aj_c0a0.setAction("", false);
    var_m25aj_c0a0.setGreeting("");
    var_m25aj_c0a0.setGreeting("Going back to the previous menu.");
    var_m25aj_c0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01*", var_m25aj_c0a0);
    var_m25aj_c0a0.setAction("back", false);
    var_m25aj_c0a0.childs = new ArrayList<Event>();
    Event var_m25aj_d0a0 = new Event("Exit", "3");
    var_m25aj_d0a0.isFinal = false;
    var_m25aj_d0a0.setAction("", false);
    var_m25aj_d0a0.setGreeting("");
    var_m25aj_d0a0.setGreeting("We are sorry, that you are leaving this menu. Looking forward to hear you again. Goodbye.");
    var_m25aj_d0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("013", var_m25aj_d0a0);
    var_m25aj_d0a0.setAction("hangUp", true);
    var_m25aj_d0a0.childs = new ArrayList<Event>();
    var_m25aj_a0.childs = new ArrayList<Event>();
    var_m25aj_a0.childs.add(var_m25aj_a0a0);
    var_m25aj_a0.childs.add(var_m25aj_b0a0);
    var_m25aj_a0.childs.add(var_m25aj_c0a0);
    var_m25aj_a0.childs.add(var_m25aj_d0a0);
    Event var_m25aj_b0 = new Event("Payment", "2");
    var_m25aj_b0.isFinal = false;
    var_m25aj_b0.setAction("", false);
    var_m25aj_b0.setGreeting("");
    var_m25aj_b0.setGreeting("Since now we offer you easiest way of payment.");
    var_m25aj_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", var_m25aj_b0);
    Event var_m25aj_a0b0 = new Event("Billing", "1");
    var_m25aj_a0b0.isFinal = false;
    var_m25aj_a0b0.setAction("", false);
    var_m25aj_a0b0.setGreeting("");
    var_m25aj_a0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("021", var_m25aj_a0b0);
    var_m25aj_a0b0.setAction("other", false);
    var_m25aj_a0b0.childs = new ArrayList<Event>();
    Event var_m25aj_b0b0 = new Event("Recharging", "2");
    var_m25aj_b0b0.isFinal = false;
    var_m25aj_b0b0.setAction("", false);
    var_m25aj_b0b0.setGreeting("");
    var_m25aj_b0b0.setGreeting("Now we are sending you super secret informations.");
    var_m25aj_b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("022", var_m25aj_b0b0);
    var_m25aj_b0b0.setAction("getInfo", false);
    var_m25aj_b0b0.childs = new ArrayList<Event>();
    Event var_m25aj_c0b0 = new Event("Payments", "3");
    var_m25aj_c0b0.isFinal = false;
    var_m25aj_c0b0.setAction("", false);
    var_m25aj_c0b0.setGreeting("");
    var_m25aj_c0b0.setGreeting("Connecting you with a human.");
    var_m25aj_c0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("023", var_m25aj_c0b0);
    var_m25aj_c0b0.setAction("call", false);
    var_m25aj_c0b0.childs = new ArrayList<Event>();
    Event var_m25aj_d0b0 = new Event("Step back", "*");
    var_m25aj_d0b0.isFinal = false;
    var_m25aj_d0b0.setAction("", false);
    var_m25aj_d0b0.setGreeting("");
    var_m25aj_d0b0.setGreeting("Going back to the previous menu.");
    var_m25aj_d0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02*", var_m25aj_d0b0);
    var_m25aj_d0b0.setAction("back", false);
    var_m25aj_d0b0.childs = new ArrayList<Event>();
    var_m25aj_b0.childs = new ArrayList<Event>();
    var_m25aj_b0.childs.add(var_m25aj_a0b0);
    var_m25aj_b0.childs.add(var_m25aj_b0b0);
    var_m25aj_b0.childs.add(var_m25aj_c0b0);
    var_m25aj_b0.childs.add(var_m25aj_d0b0);
    Event var_m25aj_c0 = new Event("Roaming", "3");
    var_m25aj_c0.isFinal = false;
    var_m25aj_c0.setAction("", false);
    var_m25aj_c0.setGreeting("");
    var_m25aj_c0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("03", var_m25aj_c0);
    var_m25aj_c0.setAction("getInfo", true);
    var_m25aj_c0.childs = new ArrayList<Event>();
    Event var_m25aj_d0 = new Event("News", "4");
    var_m25aj_d0.isFinal = false;
    var_m25aj_d0.setAction("", false);
    var_m25aj_d0.setGreeting("");
    var_m25aj_d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("04", var_m25aj_d0);
    Event var_m25aj_a0d0 = new Event("Summer News", "1");
    var_m25aj_a0d0.isFinal = false;
    var_m25aj_a0d0.setAction("", false);
    var_m25aj_a0d0.setGreeting("");
    var_m25aj_a0d0.setGreeting("Direct call has begun");
    var_m25aj_a0d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("041", var_m25aj_a0d0);
    var_m25aj_a0d0.setAction("call", false);
    var_m25aj_a0d0.childs = new ArrayList<Event>();
    Event var_m25aj_b0d0 = new Event("Cold News", "2");
    var_m25aj_b0d0.isFinal = false;
    var_m25aj_b0d0.setAction("", false);
    var_m25aj_b0d0.setGreeting("");
    var_m25aj_b0d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("042", var_m25aj_b0d0);
    var_m25aj_b0d0.setAction("getInfo", false);
    var_m25aj_b0d0.childs = new ArrayList<Event>();
    Event var_m25aj_c0d0 = new Event("Step Back", "3");
    var_m25aj_c0d0.isFinal = false;
    var_m25aj_c0d0.setAction("", false);
    var_m25aj_c0d0.setGreeting("");
    var_m25aj_c0d0.setGreeting("Going back to the previous menu.");
    var_m25aj_c0d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("043", var_m25aj_c0d0);
    var_m25aj_c0d0.setAction("back", false);
    var_m25aj_c0d0.childs = new ArrayList<Event>();
    var_m25aj_d0.childs = new ArrayList<Event>();
    var_m25aj_d0.childs.add(var_m25aj_a0d0);
    var_m25aj_d0.childs.add(var_m25aj_b0d0);
    var_m25aj_d0.childs.add(var_m25aj_c0d0);
    Event var_m25aj_e0 = new Event("Other requirements", "5");
    var_m25aj_e0.isFinal = false;
    var_m25aj_e0.setAction("", false);
    var_m25aj_e0.setGreeting("");
    var_m25aj_e0.setGreeting("You just entered section of special services. Good Luck");
    var_m25aj_e0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("05", var_m25aj_e0);
    var_m25aj_e0.setAction("other", true);
    var_m25aj_e0.childs = new ArrayList<Event>();
    Event var_m25aj_f0 = new Event("Record", "6");
    var_m25aj_f0.isFinal = false;
    var_m25aj_f0.setAction("", false);
    var_m25aj_f0.setGreeting("");
    var_m25aj_f0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("06", var_m25aj_f0);
    var_m25aj_f0.setAction("record", true);
    var_m25aj_f0.childs = new ArrayList<Event>();

    Home.childs.add(var_m25aj_a0);
    Home.childs.add(var_m25aj_b0);
    Home.childs.add(var_m25aj_c0);
    Home.childs.add(var_m25aj_d0);
    Home.childs.add(var_m25aj_e0);
    Home.childs.add(var_m25aj_f0);
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Main_();
    Main_.initHashMap();
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
        Behaviour.runLogic(event, false);

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
