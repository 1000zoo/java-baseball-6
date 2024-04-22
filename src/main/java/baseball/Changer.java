package org.example.baseballgame;

import java.util.Arrays;

public class Changer {
    public static int[] changer(String number){
        int[] yourArray = new int[3];
        char num1 = number.charAt(0);
        char num2 = number.charAt(1);
        char num3 = number.charAt(2);
        int number1 = num1-48;
        int number2 = num2-48;
        int number3 = num3-48;
        yourArray[0] = number1 ;
        yourArray[1] = number2 ;
        yourArray[2] = number3 ;
        return yourArray;
    }
}
