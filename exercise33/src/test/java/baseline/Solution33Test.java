package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void testGet8BallResponseYes() {
        Solution33 app = new Solution33();
        assertEquals("Yes.", app.get8BallResponse(0));
    }

    @Test
    void testGet8BallResponseNo() {
        Solution33 app = new Solution33();
        assertEquals("No.", app.get8BallResponse(1));
    }

    @Test
    void testGet8BallResponseMaybe() {
        Solution33 app = new Solution33();
        assertEquals("Maybe.", app.get8BallResponse(2));
    }

    @Test
    void testGet8BallResponseAsk() {
        Solution33 app = new Solution33();
        assertEquals("Ask again later.", app.get8BallResponse(3));
    }

    @Test
    void testGenerateRandomNumFrom0to3(){
        Solution33 app = new Solution33();
        boolean actualResult = true;
        int randomNum;
        for (int i = 0; i < 50; i++){
            randomNum = app.generateRandomNum();
            if(randomNum > 3 || randomNum < 0){
                actualResult = false;
            }
        }
        assertEquals(true,actualResult);
    }
}