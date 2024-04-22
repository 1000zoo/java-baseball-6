package org.example.baseballgame;

import java.util.Arrays;
import java.util.Random;

public class GameStarter {

    public static int[] gameStarter(){
        Random random = new Random();
        Random random1 = new Random();
        Random random2 = new Random();
        int[] computer = new int[3];
        boolean ran = true;
        while(ran) {
            computer[0] = random.nextInt(8)+1;
            computer[1] = random1.nextInt(8)+1;
            computer[2] = random1.nextInt(8)+1;
            if (computer[0]!=computer[1] && computer[1]!=computer[2] && computer[2]!=computer[0]){
                ran = false;
            } else {
                ran = true;
            }
        }
//        System.out.println(Arrays.toString(computer));
        return computer;
    }

}
