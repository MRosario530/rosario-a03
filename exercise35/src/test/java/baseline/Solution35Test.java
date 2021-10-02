package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void testFindWinnerWithoutGoingOutOfBounds() {
        Solution35 app = new Solution35();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("one");
        testList.add("two");
        testList.add("three");
        boolean withinBounds = true;
        String testOutput;
        for(int i = 0; i < 20; i++){
            testOutput = app.findWinner(testList);
            if(!testOutput.equals("The winner is... one.") && !testOutput.equals("The winner is... two.") &&
                    !testOutput.equals("The winner is... three.")){
                withinBounds = false;
            }
        }
        assertEquals(true,withinBounds);
    }

    @Test
    void testFindWinnerWithNoEntries(){
        Solution35 app = new Solution35();
        ArrayList<String> testList = new ArrayList<>();
        assertEquals("There were no contestants!",app.findWinner(testList));
    }

}