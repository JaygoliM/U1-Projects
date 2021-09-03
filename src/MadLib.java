import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String age;
        String time;
        String Firstname;
        String Lastname;

        System.out.println("What is your Name?");
        Firstname = read.nextLine();
        System.out.println("What is your last name?");
        Lastname= read.nextLine();
        System.out.println("What is your age?");
        age = read.nextLine();
        System.out.println("What is your current time");
        time = read.nextLine();


        System.out.println("Your name is " + Firstname + " " + Lastname + " and your current time is close to " + time + " and I know your age is " + age);
        System.exit(0);


    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    }
}