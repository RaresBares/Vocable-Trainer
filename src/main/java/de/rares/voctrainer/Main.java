package de.rares.voctrainer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
      public static   ArrayList<Vocable> vocables = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Do you want to register new Vocables (1) or to learn them (2)");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("Syntax: VOC --- TRANSLATION");
            while (true){

                String s = sc.nextLine();
                if(s.contains("---")){
                    vocables.add(new Vocable(s.split("---")[0],s.split("---")[1]));
                } if(s.equalsIgnoreCase("finish")){
                    break;
                }else{
                    return;
                }
            }
        } else if (i == 2) {
            Random r = new Random(vocables.size());
            while (true) {
                Vocable voc = vocables.get(r.nextInt());
                System.out.println(voc.trans);
                String input = sc.nextLine();

                if (input.equalsIgnoreCase(voc.voc)) {
                    System.out.println("nice");
                }
                System.out.println(voc.voc + " <---> " + voc.trans);
            }
        } else {
            return;
        }
    }

}
