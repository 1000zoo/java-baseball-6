package org.example.baseballgame;

import java.util.Scanner;

public class Start {

    public static void start (int[] answerArray) {
        Scanner sc = new Scanner(System.in);
        Changer changer = new Changer();
        boolean flag = true;
        int answer = 0;
        while (flag) {
            int strike = 0;
            int ball = 0;
            System.out.println("숫자를 입력해주세요 : ");
            String number = sc.nextLine();
            int[] youArray = changer.changer(number);

            for (int i = 0; i < youArray.length; i++) {
                if (youArray[i] == answerArray[i]) {
                    strike++;
                }
            }
            if (youArray[0] == answerArray[1] || youArray[0] == answerArray[2]) {
                ball++;
            }
            if (youArray[1] == answerArray[0] || youArray[1] == answerArray[2]) {
                ball++;
            }
            if (youArray[2] == answerArray[0] || youArray[2] == answerArray[1]) {
                ball++;
            }

            if (strike == 3) {
                System.out.println(strike + " 스트라이크");
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                flag = false;
            } else if (strike == 1 || strike == 2) {
                System.out.println(strike + " 스트라이크");
            } else if (strike == 0) {
                System.out.println(ball + " 볼");
            }

        }
    }
}
