package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Game {
    /**
    *
    * BUL KODDOR JON GANA KOCHURMO ELE, BARDYK ISHTETILUUCHU KODDOR "ETAP4" KLASSTA
    * */
    Scanner scanner = new Scanner(System.in);
    Dice dice = new Dice();
    Dice dice1 = new Dice();
    EnemyComp enemyComp = new EnemyComp();
    EnemyComp enemyComp1 = new EnemyComp();
    Random random = new Random();

    List<Integer>listPerPred= new ArrayList<>();
    List<Integer>listPerDice= new ArrayList<>();
    List<Integer>listCompPred= new ArrayList<>();
    List<Integer>listCompDice= new ArrayList<>();
    List<Integer>listPerRes= new ArrayList<>();
    List<Integer>listCompRes= new ArrayList<>();


    void method(){
        System.out.println("------ START GAME ------");
        int counter = 0;
        int counter2=0;
        int counter3=0;
        int comCounter = 0;

        for (int i = 0; i < 3; i++) {

            System.out.print("2den-12ge cheyin san beriniz:");
            int san= scanner.nextInt();
            System.out.println("Kubikter yrgytyldy...");
            int x = dice.method()+dice1.method();
            System.out.println(x+" upay tushtu.");
            int sum = x-Math.abs(x-san)*2;
            System.out.println("Sizdin upayiniz:"+x+"-abs("+x+"-"+san+")"+"*2: "+sum+" upay");
            System.out.println("-------------------------------------------------");
            listPerPred.add(san);
            listPerDice.add(x);
            listPerRes.add(sum);

            System.out.println("Sopernik 2den 12ge cheyin san beret:");
            int compSan = random.nextInt((12-2)+1)+2;
            System.out.println("Sopernik "+ compSan+" sanyn tandady");
            int compUpay = enemyComp.compMethod()+ enemyComp1.compMethod();
            System.out.println("Kubikter yrgytyldy");
            System.out.println(compUpay+" upay tushtu");
            int compSum = compUpay-Math.abs(compUpay-compSan)*2;
            System.out.println("Soperniktin upayi:"+compUpay+"-abs("+compUpay+"-"+compSan+")"+"*2: "+compSum+" upay");
            listCompPred.add(compSan);
            listCompDice.add(compUpay);
            listCompRes.add(compSum);
            System.out.println("");
            System.out.println("------------  CURRENT SCORE   ------------");
            System.out.println("siz:" +sum);
            System.out.println("sopernik:"+compSum);

            counter+=sum;
            comCounter+=compSum;


            if(sum>compSum){
                int point= sum-compSum;
                System.out.println("Siz sopernikten "+point+" sanyna aldydasyz");
            }else if(sum==compSum){
                System.out.println("Ekoonordun upayinar birdey");
            }else {
                int point1 = compSum-sum;
                System.out.println("Sopernik sizden "+point1+ " sanyna aldyda");
            }
            System.out.println("==================================================");
        }
        int PP0=listPerPred.get(0);
        int PP1=listPerPred.get(1);
        int PP2=listPerPred.get(2);
        int PD0=listPerDice.get(0);
        int PD1=listPerDice.get(1);
        int PD2=listPerDice.get(2);
        int PR0=listPerRes.get(0);
        int PR1=listPerRes.get(1);
        int PR2=listPerRes.get(2);
        int CP0=listCompPred.get(0);
        int CP1=listCompPred.get(1);
        int CP2=listCompPred.get(2);
        int CD0 =listCompDice.get(0);
        int CD1 =listCompDice.get(1);
        int CD2 =listCompDice.get(2);
        int CR0 = listCompRes.get(0);
        int CR1 = listCompRes.get(1);
        int CR2 = listCompRes.get(2);

        System.out.printf("""
                --------------------  Finish game ---------------------
                Round  |               User|                 Computer
                -------+-------------------+---------------------------
                        |Predicted:      %d |Predicted:          %d
                        |Dice:           %d |Dice:               %d
                        |Result:         %d |Result:             %d
                --------+--------------------+-------------------------
                        |Predicted:      %d |Predicted:          %d
                        |Dice:           %d |Dice:               %d
                        |Result:        %d |Result:            %d
                --------+--------------------+-------------------------
                        |Predicted:      %d |Predicted:          %d
                        |Dice:           %d |Dice:                %d
                        |Result:         %d |Result:             %d
                --------+--------------------+------------------------
                 Total:  | Points:       %d | Points:           %d 
                """,PP0,CP0,PD0,CD0,PR0,CR0,PP1,CP1,PD1,CD1,PR1,CR1,PP2,CP2,PD2,CD2,PR2,CR2,counter,comCounter);

        if(counter>comCounter){
            int point= counter-comCounter;
            System.out.println("Azamatsyz siz jendiniz jana "+point+" upayga aldydasyz");
        }else if(counter==comCounter){
            System.out.println("Ekoonordun upayinar birdey");
        }else {
            int point1 = comCounter-counter;
            System.out.println("Tilekke karwy siz "+point1+ " upayga utuldunuz");
        }

    }
}
