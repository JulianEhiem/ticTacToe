package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    @DisplayName("The response should be one of the acceptable responses")
    void validateResponse(){
        assertAll(
                () -> assertTrue(TicTacToe.isResponseValid(new int[]{2, 3, 4}, 4)),
                () -> assertFalse(TicTacToe.isResponseValid(new int[]{2, 3, 4}, 5))
        );
    }

    @Test
    @DisplayName("Computer chooses a position from the given available positions")
    void computerChooses(){
        int choice = TicTacToe.computerChooses(new int[]{1,2,3,4,5});
        assertTrue(choice >= 1 && choice <= 9);
    }

}