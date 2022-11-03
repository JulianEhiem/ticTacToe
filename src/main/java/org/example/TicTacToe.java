package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    static String[][] gameBoard = createGameBoard();

// TODO: update the computerchooses function to recieve an array and choose randomly from that array

    public static void main(String[] args) {
        System.out.println("Let's Play a game of TicTacToe!");
        int user = choosePlayer();
//        user == 1 ? playerChooses() : computerChooses()
//        boolean comp = computerChooses();
//        displayTestBoard();
//     STEPS TO  PLAYING TIC TAC TOE
//        choose player
//        draw board
//        provide instructions
//        player 1
//        update GB
//        player 2
//        update GB
//        player 1
//        update GB
//        player 2
//        update GB
//        player 1
//        update and check







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

    public static int computerChooses() {
        int choice = (int) (Math.ceil(Math.random() * 9) + 1);
        return choice;
    }

    public static void displayTestBoard() {
        String [][] board = new String[3][3];
        String border = "---------";

        board[0][0] = " ";
        board[0][1] = " ";
        board[0][2] = " ";
        board[1][0] = " ";
        board[1][1] = " ";
        board[1][2] = " ";
        board[2][0] = " ";
        board[2][1] = " ";
        board[2][2] = " ";


//        TODO: figure out why it prints 3 tables and solve it

        for (int i = 0; i < 3; i++) {
            System.out.print(board[i][0] + " | " + board[i][1] + " | " + board[i][2] + "\n" + (i == 2 ? "" : border) + "\n");
        }



//        System.out.print(Arrays.deepToString(board));
    }
}