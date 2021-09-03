import javax.swing.*;
import java.sql.SQLOutput;

public class RPGCharacter {

    public static void main(String[] args) {


        String charName;
        double strength;
        double dexterity;
        double spirit;

        charName = JOptionPane.showInputDialog("What's your character's name?");
       strength = Double.parseDouble(JOptionPane.showInputDialog("Strength points"));
       dexterity = Double.parseDouble(JOptionPane.showInputDialog("Dexterity points"));
       spirit = Double.parseDouble(JOptionPane.showInputDialog("Spirit points"));

       double physicalDamage = strength/3;
       double Initiative = dexterity/5 + spirit/10;
       double Constitution = strength * 2 + spirit/8;
       double magicDamage = spirit/2;
       JOptionPane.showMessageDialog(null,"Your character's name is: " + charName + "has the base physical damage  of: " + physicalDamage + " with an Initiative of: " + Initiative + "  a constitution of: " + Constitution + " and a base magic damage stat of: " + magicDamage);
        System.exit(0);
    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
  */
    }
}
