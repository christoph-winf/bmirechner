package de.ovgu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String message = "Hello World";
        Scanner sc = new Scanner(System.in);
        float gewicht;
        float groesse;
        float bmi;
        String name;
        int alter;

        System.out.println("Wie viel wiegst du (in kg)?");
        gewicht = sc.nextFloat();

        System.out.println("Wie groß bist du (in Metern)?");
        groesse = sc.nextFloat();

        System.out.println("Gibt bitte deinen Namen an:");
        name = sc.next();
        System.out.println("Wie alt bist du (in Jahren)?");
        alter = sc.nextInt();
       // System.out.println("Test: "+ name);

        bmi = gewicht / (groesse * groesse);

        System.out.println("Dein BMI beträgt: " + bmi);

        if (bmi < 20 && alter >18)

        {
            System.out.println("Du bist untergewichtig");
        } else if (bmi >20 && bmi < 25)

        {
            System.out.println("Du bist normalgewichtig");
        } else if (bmi > 25 && bmi < 30)
        {
            System.out.println("Du bist übergewichtig");
        }
        else if (bmi >30 && bmi < 40)
        {
            System.out.println("Du bist fettleibig!");
        }
        else {
            System.out.println("Du bist extrem Fettleibig!");
        }


        if (name.equals("Ossi") | name.equals("Tom"))

        {
            System.out.println(name + " hör auf zu Fressen du dickes Schwein!");
        } else if (name.equals("Tophy")| name.equals("Christopher"))

        {
            System.out.println("Du solltest wirklich mehr Sport machen " + name + "!");
        } else if (name.equals("Stego") | name.equals("Jan"))

        {
            System.out.println("Trink weniger Red Bull!");
        } else if (name.equals("lynche") | name.equals( "Christoph"))

        {
            System.out.println(name + " an dir sollten sich die anderen mal ein Beispiel nehmen!");
        } else

        {
            System.out.println("Mehr Sport kann nicht schaden!");
        }
    }
}
