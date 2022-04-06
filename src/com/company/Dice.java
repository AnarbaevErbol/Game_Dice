package com.company;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int kub=0;

    public int method (){
        for (int i = 0; i < 1; i++) {
            kub= random.nextInt((6-1)+1)+1;
            switch (kub){
                case 1:
                    System.out.println("""
                            +------+
                            |      |
                            |   #  |
                            |      |
                            +------+""");
                    break;
                case 2:
                    System.out.println("""
                            +------+
                            |#     |
                            |      |
                            |     #|
                            +------+""");
                    break;
                case 3:
                    System.out.println("""
                            +------+
                            |#     |
                            |   #  |
                            |     #|
                            +------+""");
                    break;
                case 4:
                    System.out.println("""
                            +------+
                            |#    #|
                            |      |
                            |#    #|
                            +------+""");
                    break;
                case 5:
                    System.out.println("""
                            +------+
                            |#    #|
                            |   #  |
                            |#    #|
                            +------+""");
                    break;
                case 6:
                    System.out.println("""
                            +------+
                            |#    #|
                            |#    #|
                            |#    #|
                            +------+""");
                    break;
            }
        }
        return kub;
    }


    public int getChance(int a){
            switch (a){
                case 1:
                    System.out.println("""
                            +------+
                            |      |
                            |   #  |
                            |      |
                            +------+""");
                    break;
                case 2:
                    System.out.println("""
                            +------+
                            |#     |
                            |      |
                            |     #|
                            +------+""");
                    break;
                case 3:
                    System.out.println("""
                            +------+
                            |#     |
                            |   #  |
                            |     #|
                            +------+""");
                    break;
                case 4:
                    System.out.println("""
                            +------+
                            |#    #|
                            |      |
                            |#    #|
                            +------+""");
                    break;
                case 5:
                    System.out.println("""
                            +------+
                            |#    #|
                            |   #  |
                            |#    #|
                            +------+""");
                    break;
                case 6:
                    System.out.println("""
                            +------+
                            |#    #|
                            |#    #|
                            |#    #|
                            +------+""");
                    break;
            }
        return a;
    }
}
