package linter;

import java.io.BufferedReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class App {




    public static void main(String[] args) {

        System.out.println(linter("src/main/resources/gates.js"));


    }

    public static String linter(String path) {
        String result = "";
        Path thePath = Paths.get(path);



        try {
            BufferedReader reader = Files.newBufferedReader(thePath);
            String line = reader.readLine();
            int NumberOfLine = 1;
            while (line != null) {
                if (!(line.matches("(?s).*(?:;|\\bTHEN|\\bBEGIN)$")) &&
                        !(line.matches("(?s).*(?:}|\\bTHEN|\\bBEGIN)$")) &&
                        !line.contains("{") &&
                        !line.isEmpty() &&
                        !line.contains("if") &&
                        !line.contains("else")) {

                    result = result + "Line" + NumberOfLine + ": Missing semicolon.\n";;

                }

                line = reader.readLine();
                NumberOfLine++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }

}