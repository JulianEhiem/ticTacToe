package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    @DisplayName("An Object representing the game board should be created")
    void createGameBoard(){
        assertTrue(TicTacToe.createGameBoard().length == 3);
    }

    @Test
    @DisplayName("The response should be one of the acceptable responses")
    void validateResponse(){
        assertAll(
                () -> assertTrue(TicTacToe.isResponseValid(new int[]{2, 3, 4}, 4)),
                () -> assertFalse(TicTacToe.isResponseValid(new int[]{2, 3, 4}, 5))
        );
    }

    @Test
    @DisplayName("Computer chooses a position between 1 - 9")
    void computerChooses(){
        assertTrue(TicTacToe.computerChooses() <= 9);
    }

}