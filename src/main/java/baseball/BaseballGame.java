package org.example.baseballgame;

import java.util.Scanner;

import static org.example.baseballgame.Changer.changer;
import static org.example.baseballgame.GameStarter.gameStarter;
import static org.example.baseballgame.Start.start;

public class BaseballGame {

    public static void main(String[] args) {
            int[] array = {};
            array = gameStarter();
            Scanner scanner = new Scanner(System.in);
            System.out.println("숫자 야구 게임을 시작합니다.");
            start(array);
            boolean answer = true;
            while (answer) {
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    int[] array2 = {};
                    array2 = gameStarter();
                    start(array2);
                } else if (choice == 2) {
                    answer = false;
                }
            }

        }

    }




