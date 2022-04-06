package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Etap4 {

        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        Dice dice1 = new Dice();
        EnemyComp enemyComp = new EnemyComp();
        EnemyComp enemyComp1 = new EnemyComp();
        Random random = new Random();

        List<Integer> listPerPred= new ArrayList<>();
        List<Integer>listPerDice= new ArrayList<>();
        List<Integer>listCompPred= new ArrayList<>();
        List<Integer>listCompDice= new ArrayList<>();
        List<Integer>listPerRes= new ArrayList<>();
        List<Integer>listCompRes= new ArrayList<>();

    int par = 0;
    int par1 = 0;

        void methood(){
            System.out.println("------ START GAME ------");
            int counter = 0;
            int comCounter = 0;
            int sum1=0;
            int compSum1=0;


            for (int round = 0; round < 3; round++) {

                System.out.print("2den-12ge cheyin san beriniz:");
                int san = scanner.nextInt();
                    System.out.println("Cheat koldonuunu kaalsan 1di bas chestnyi oynogun kelse 0du bas:");
                    int sk = scanner.nextInt();
                    if (sk == 1) { /// биринчи раунд
                        if (round == 0) {
                            int ran = random.nextInt(2);
                            if (ran == 0) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran == 1) {
                                System.out.println("Chit iygiliktuu koldonuldu");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    udachnyi(san);
                                    int x = dice.getChance(par) + dice1.getChance(par1);
                                    System.out.println(x + " upay tushtu.");
                                    int sum = san;
                                    System.out.println("Sizdin upayiniz: " + sum + " upay");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            }
                        } else if (round == 1) {
                            int ran1 = random.nextInt(4);
                            if (ran1 == 0) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran1 == 1) {
                                System.out.println("Chit iygiliktuu koldonuldu");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    udachnyi(san);
                                    int x = dice.getChance(par) + dice1.getChance(par1);
                                    System.out.println(x + " upay tushtu.");
                                    int sum = san;
                                    System.out.println("Sizdin upayiniz: " + sum + " upay");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran1 == 2) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            }
                        } else if (round == 2) {
                            int ran2 = random.nextInt(6);
                            if (ran2 == 0) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran2 == 1) {
                                System.out.println("Chit iygiliktuu koldonuldu");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    udachnyi(san);
                                    int x = dice.getChance(par) + dice1.getChance(par1);
                                    System.out.println(x + " upay tushtu.");
                                    int sum = san;
                                    System.out.println("Sizdin upayiniz: " + sum + " upay");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran2 == 2) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran2 == 3) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else if (ran2 == 4) {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            } else {
                                System.out.println("Siz chit koldono albay kaldynyz");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Kubikter yrgytyldy...");
                                    int x = dice.method() + dice1.method();
                                    System.out.println(x + " upay tushtu.");
                                    int sum = (x - Math.abs(x - san) * 2) - 10;
                                    System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay, sebebi chit koldonuunuz " +
                                            "iygiliktuu bolbogonu uchun -10 upay alyndy");
                                    System.out.println("-------------------------------------------------");
                                    listPerPred.add(san);
                                    listPerDice.add(x);
                                    listPerRes.add(sum);
                                    sum1 = sum;
                                }
                            }
                        }
                    } else if (sk == 0) {
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Kubikter yrgytyldy...");
                            int x = dice.method() + dice1.method();
                            System.out.println(x + " upay tushtu.");
                            int sum = x - Math.abs(x - san) * 2;
                            System.out.println("Sizdin upayiniz:" + x + "-abs(" + x + "-" + san + ")" + "*2: " + sum + " upay");
                            System.out.println("-------------------------------------------------");
                            listPerPred.add(san);
                            listPerDice.add(x);
                            listPerRes.add(sum);
                            sum1 = sum;
                        }
                    }
                    if (round == 0) {
                        int ranComp = random.nextInt((5 - 1) + 1) + 1;
                        if (ranComp == 1) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                int compSan = random.nextInt((12 - 2) + 1) + 2;
                                System.out.println("Sopernik " + compSan + " sanyn tandady");
                                System.out.println("Computer iygiliktuu cheat koldondu");
                                System.out.println("Kubikter yrgytyldy");
                                udachnyi(compSan);
                                int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                System.out.println(compUpay + " upay tushtu");
                                int compSum = compSan;
                                System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                listCompPred.add(compSan);
                                listCompDice.add(compUpay);
                                listCompRes.add(compSum);
                                compSum1 = compSum;
                            }
                        } else if (ranComp == 2) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                int compSan = random.nextInt((12 - 2) + 1) + 2;
                                System.out.println("Sopernik " + compSan + " sanyn tandady");
                                System.out.println("Computer cheat koldonbodu");
                                System.out.println("Kubikter yrgytyldy");
                                int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                System.out.println(compUpay + " upay tushtu");
                                int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                listCompPred.add(compSan);
                                listCompDice.add(compUpay);
                                listCompRes.add(compSum);
                                compSum1 = compSum;
                            }
                        } else if (ranComp == 3) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                int compSan = random.nextInt((12 - 2) + 1) + 2;
                                System.out.println("Sopernik " + compSan + " sanyn tandady");
                                System.out.println("Computer cheat koldonbodu");
                                System.out.println("Kubikter yrgytyldy");
                                int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                System.out.println(compUpay + " upay tushtu");
                                int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                listCompPred.add(compSan);
                                listCompDice.add(compUpay);
                                listCompRes.add(compSum);
                                compSum1 = compSum;
                            }
                        } else if (ranComp == 4) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                int compSan = random.nextInt((12 - 2) + 1) + 2;
                                System.out.println("Sopernik " + compSan + " sanyn tandady");
                                System.out.println("Computer cheat koldonbodu");
                                System.out.println("Kubikter yrgytyldy");
                                int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                System.out.println(compUpay + " upay tushtu");
                                int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                listCompPred.add(compSan);
                                listCompDice.add(compUpay);
                                listCompRes.add(compSum);
                                compSum1 = compSum;
                            }
                        } else if (ranComp == 5) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                int compSan = random.nextInt((12 - 2) + 1) + 2;
                                System.out.println("Sopernik " + compSan + " sanyn tandady");
                                System.out.println("Computer cheat koldonbodu");
                                System.out.println("Kubikter yrgytyldy");
                                int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                System.out.println(compUpay + " upay tushtu");
                                int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                listCompPred.add(compSan);
                                listCompDice.add(compUpay);
                                listCompRes.add(compSum);
                                compSum1 = compSum;
                            }
                        }
                    }
                    if (round == 1) {
                        if ((sum1 - compSum1) > 5) {
                            if ((sum1 - compSum1) > 15) {
                                int ranComp = random.nextInt((5 - 1) + 1) + 1;
                                if (ranComp == 1) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 2) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 3) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 4) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 5) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                }
                            } else {
                                int ranComp = random.nextInt((5 - 1) + 1) + 1;
                                if (ranComp == 1) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 2) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 3) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 4) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 5) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                }
                            }
                        } else {
                            int ranComp = random.nextInt((5 - 1) + 1) + 1;
                            if (ranComp == 1) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer iygiliktuu cheat koldondu");
                                    System.out.println("Kubikter yrgytyldy");
                                    udachnyi(compSan);
                                    int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compSan;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 2) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 3) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 4) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 5) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            }
                        }
                    }
                    System.out.println();
                    if (round == 2) {
                        if ((sum1 - compSum1) > 5) {
                            if ((sum1 - compSum1) > 15) {
                                int ranComp = random.nextInt((5 - 1) + 1) + 1;
                                if (ranComp == 1) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 2) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 3) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 4) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 5) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                }
                            } else {
                                int ranComp = random.nextInt((5 - 1) + 1) + 1;
                                if (ranComp == 1) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 2) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer iygiliktuu cheat koldondu");
                                        System.out.println("Kubikter yrgytyldy");
                                        udachnyi(compSan);
                                        int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compSan;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 3) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 4) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                } else if (ranComp == 5) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                        int compSan = random.nextInt((12 - 2) + 1) + 2;
                                        System.out.println("Sopernik " + compSan + " sanyn tandady");
                                        System.out.println("Computer cheat koldonbodu");
                                        System.out.println("Kubikter yrgytyldy");
                                        int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                        System.out.println(compUpay + " upay tushtu");
                                        int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                        System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                        listCompPred.add(compSan);
                                        listCompDice.add(compUpay);
                                        listCompRes.add(compSum);
                                        compSum1 = compSum;
                                    }
                                }
                            }
                        } else {
                            int ranComp = random.nextInt((5 - 1) + 1) + 1;
                            if (ranComp == 1) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer iygiliktuu cheat koldondu");
                                    System.out.println("Kubikter yrgytyldy");
                                    udachnyi(compSan);
                                    int compUpay = enemyComp.getChance(par) + enemyComp1.getChance(par1);
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compSan;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 2) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 3) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 4) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            } else if (ranComp == 5) {
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Sopernik 2den 12ge cheyin san beret:");
                                    int compSan = random.nextInt((12 - 2) + 1) + 2;
                                    System.out.println("Sopernik " + compSan + " sanyn tandady");
                                    System.out.println("Computer cheat koldonbodu");
                                    System.out.println("Kubikter yrgytyldy");
                                    int compUpay = enemyComp.compMethod() + enemyComp1.compMethod();
                                    System.out.println(compUpay + " upay tushtu");
                                    int compSum = compUpay - Math.abs(compUpay - compSan) * 2;
                                    System.out.println("Soperniktin upayi:" + compUpay + "-abs(" + compUpay + "-" + compSan + ")" + "*2: " + compSum + " upay");
                                    listCompPred.add(compSan);
                                    listCompDice.add(compUpay);
                                    listCompRes.add(compSum);
                                    compSum1 = compSum;
                                }
                            }
                        }
                    }

                    System.out.println("");
                    System.out.println("------------  CURRENT SCORE   ------------");
                    System.out.println("siz:" + sum1);
                    System.out.println("sopernik:" + compSum1);

                    counter = counter + sum1;
                    comCounter += compSum1;

                    if (sum1 > compSum1) {
                        int point = sum1 - compSum1;
                        System.out.println("Siz sopernikten " + point + " sanyna aldydasyz");
                    } else if (sum1 == compSum1) {
                        System.out.println("Ekoonordun upayinar birdey");
                    } else {
                        int point1 = compSum1 - sum1;
                        System.out.println("Sopernik sizden " + point1 + " sanyna aldyda");
                    }
                    System.out.println("==================================================");
                }
                int PP0 = listPerPred.get(0);
                int PP1 = listPerPred.get(1);
                int PP2 = listPerPred.get(2);
                int PD0 = listPerDice.get(0);
                int PD1 = listPerDice.get(1);
                int PD2 = listPerDice.get(2);
                int PR0 = listPerRes.get(0);
                int PR1 = listPerRes.get(1);
                int PR2 = listPerRes.get(2);
                int CP0 = listCompPred.get(0);
                int CP1 = listCompPred.get(1);
                int CP2 = listCompPred.get(2);
                int CD0 = listCompDice.get(0);
                int CD1 = listCompDice.get(1);
                int CD2 = listCompDice.get(2);
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
                                |Dice:          %d |Dice:                %d
                                |Result:         %d |Result:             %d
                        --------+--------------------+------------------------
                         Total:  | Points:       %d | Points:           %d 
                        """, PP0, CP0, PD0, CD0, PR0, CR0, PP1, CP1, PD1, CD1, PR1, CR1, PP2, CP2, PD2, CD2, PR2, CR2, counter, comCounter);
            System.out.println("");
                if (counter > comCounter) {
                    int point = counter - comCounter;
                    System.out.println("Azamatsyz siz jendiniz jana " + point + " upayga aldydasyz");
                } else if (counter == comCounter) {
                    System.out.println("Ekoonordun upayinar birdey");
                } else {
                    int point1 = comCounter - counter;
                    System.out.println("Tilekke karwy siz " + point1 + " upayga utuldunuz");
                }
            System.out.println("");
            kayraOynoo();
            }

            public void kayraOynoo(){
                System.out.println("Kayra oynoonu kaalasanyz 1di basynyz bolboso 0du basynyz");
            int a =scanner.nextInt();
            if(a == 1){
                methood();
            }else{
                System.out.println("Rahmat, oyun buttu");
            }
            }


    public void udachnyi(int san){
        par=0;
        par1=0;
        if(san%2==0){
            par =san/2;
            par1 =san/2;
        }else{
            switch(san){
                case 11: par=5; par1=6;
                    break;
                case  9: par=5; par1=4;
                    break;
                case 7: par=4; par1=3;
                    break;
                case 5: par=3; par1=2;
                    break;
                case 3: par=2; par1=1;
            }
        }
    }
}
