package com.company;

import java.util.Random;

public class EnemyComp {
    Random random = new Random();
    int compKub=0;

    public int compMethod (){
        for (int i = 0; i < 1; i++) {
            compKub= random.nextInt((6-1)+1)+1;
            switch (compKub){
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
        return compKub;
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
