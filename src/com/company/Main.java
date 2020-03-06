package com.company;

import java.sql.Time;
import java.util.Scanner;

public class Main {





    public static void main(String[] args){
        System.out.println("MadLib");


        // phase 1

        String place;
        String pluralNoun;
        String verb ;
        String deity;
        String number;
        String person;
        String noun;
        String partOfBody;
        String himHer;
        String emotion;
        String feeling;
        String reaction;
        String signOfLove;
        String bodyPart;
        String touch;
        String action ;
        String time ;
        String pain;
        String adjective;
        String painful;


        // phase 2
        Scanner keyboard ;

     keyboard = new Scanner(System.in);

     System.out.println("insert a place you like");
     place = keyboard.nextLine();

     System.out.println("insert plural noun");
     pluralNoun = keyboard.nextLine();

     System.out.println("place a verb ");
     verb = keyboard.nextLine();

     System.out.println("put any deity");
     deity =keyboard.nextLine();

     System.out.println("choose number you like ");
     number = keyboard.nextLine();

     System.out.println("add a character name ");
     person = keyboard.nextLine();

     System.out.println(" add a noun ");
     noun = keyboard.nextLine();

     System.out.println("insert part of a body ");
     partOfBody = keyboard.nextLine();

     System.out.println("put gender");
     himHer = keyboard.nextLine();

     System.out.println("insert any type of emotion  ");
     emotion = keyboard.nextLine();

     System.out.println("build  a feeling ");
     feeling = keyboard.nextLine();

     System.out.println("show some kind of reaction ");
     reaction = keyboard.nextLine();

     System.out.println("view some love sign ");
     signOfLove = keyboard.nextLine();

     System.out.println("place any part of a body ");
     bodyPart = keyboard.nextLine();

     System.out.println("make some moves ");
     touch = keyboard.next();

     System.out.println("show fewer than many actions ");
     action = keyboard.nextLine();

     System.out.println("insert time ");
     time = keyboard.nextLine();

     System.out.println("describe a pain  ");
     pain = keyboard.nextLine();

     System.out.println("insert an adjective ");
     adjective = keyboard.nextLine();

     System.out.println("replace any kind of painful ");
     painful = keyboard.nextLine();


     // phase 3
     String name = "poem";
   System.out.println( place + " in ");

   System.out.println(pluralNoun+"grown ");

   System.out.println(deity+ "lord pick +  ");

   System.out.println(noun + "for me ");

   System.out.println(person+"place them in my" + noun);

   System.out.println(verb + number + "and tell  they are from me ");

   System.out.println(feeling+"tell her i love her a" + emotion );

   System.out.println("and when she turn" + reaction);

   System.out.println(action + "place" + signOfLove);

   System.out.println("upon her" + partOfBody);

   System.out.println(touch + "for a while" + adjective);

   System.out.println("because remembering" + himHer);

   System.out.println("i do it" + time );

   System.out.println("but there an" + pain);

   System.out.println("within my" + bodyPart);

   System.out.println("that will" + painful);



    }
}
