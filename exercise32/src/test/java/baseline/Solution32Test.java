package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void testResultOneGuess() {
        Solution32 app = new Solution32();
        assertEquals("You got it in 1 guess!", app.createResultString(1));
    }

    @Test
    void testResultMultipleGuesses() {
        Solution32 app = new Solution32();
        assertEquals("You got it in 5 guesses!",app.createResultString(5));
    }
}