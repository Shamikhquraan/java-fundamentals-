package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class MapsTest {


    @Test
    public void testData() {

        int[][] arr = {
                {1,2,4,4},
                {5,4,8,6},
                {10,8,9,6},
                {2,8,9,7}
        };



        ArrayList<Integer> passedValue = Maps.checkForData(arr);
        System.out.println(passedValue);
        assertEquals( 1, passedValue.size());

    }





    @Test
    public void testTally() {

        String[] arr = {"emam", "emam", "emam", "someone"};

        String passedValue = Maps.tally(arr);
        assertEquals( "emam", passedValue);

    }



}