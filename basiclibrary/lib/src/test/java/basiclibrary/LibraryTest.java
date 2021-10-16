package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test public void testRoll() {
        int [] rollResult = Library.roll(5);
        assertEquals( 5, rollResult.length);

    }

    @Test public void testContainsDuplicates() {
        int [] array ={1,2,5,4,5,9,8,2,10};
        assertTrue(Library.containsDuplicates(array));
    }

    @Test public void testCalcAverage() {
        int [] array ={65, 56, 55, 52, 55, 62, 57};
        assertEquals(57.42857142857143, Library.calculatingAverages(array));
    }

    @Test public void testCalculatingAveragesOfMultipleArrays() {
        int[][] array = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(63.0, 63.0);
    }
}