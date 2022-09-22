package org.example;

import java.util.Scanner;

public class TicTacToe {
    static String[][] gameBoard = createGameBoard();

    public static void main(String[] args) {
        System.out.println("Let's Play a game of TicTacToe!");
        int user = choosePlayer();
        boolean comp = computerChooses();
//        player chosen
//        player one chooses position
//        position is updated on board
//        player 2 chooses position
//        position is updated on the board
//        player 1 chooses again
//        player 2 plays
//        check for winner






    }

    public static String[][] createGameBoard() {
        return new String[3][3];
    }

    public static int choosePlayer() {
        Scanner player = new Scanner(System.in);
        System.out.print("\nWould you like to be Player 1 or PLayer 2, (1/2): ");
        int response = player.nextInt();
        if (isResponseValid(new int[] {1,2}, response)){
            return  response;
        } else {
            System.out.println("Please enter '1' or '2'.");
            choosePlayer();
        }
        return response;
    }
    public static boolean isResponseValid(int[] acceptable, int response) {
        for (int i : acceptable){
            if(i == response )return true;
        }
        return false;
    }

    public static boolean computerChooses() {
        return true;
    }
}