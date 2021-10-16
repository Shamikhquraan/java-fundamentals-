package linter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testLinter() {

        String re = App.linter("src/main/resources/noErrors.js");
        System.out.println(re);
        assertEquals( "", re);

        String result2 = App.linter("src/main/resources/oneError.js");
//        System.out.println(result2);
        String re2 = "Line5: Missing semicolon.\n";
        assertEquals(re2 , result2);


        String result3 = App.linter("src/main/resources/few.js");
//        System.out.println(result3);
        String re3 = "Line3: Missing semicolon.\n" +
                "Line5: Missing semicolon.\n";
        assertEquals(re3 , result3);

        String re4 = App.linter("src/main/resources/empty.js");
        System.out.println(re);
        assertEquals( "", re4);

    }

}