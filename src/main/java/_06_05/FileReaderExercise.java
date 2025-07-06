package _06_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";
        try(  Scanner scanner=new Scanner(new FileReader("/Users/tanujabhatnagar/Desktop/advanced-java-development-2515082/src/main/java/_06_05/BufferedReaderVsScanner.txt"))) {
            firstLine=scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        String wholeFile = "";
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/tanujabhatnagar/Desktop/advanced-java-development-2515082/src/main/java/_06_05/BufferedReaderVsScanner.txt"))){
            String firstLine = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            bufferedReader.lines().forEach(stringBuilder::append);
            wholeFile=stringBuilder+"";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wholeFile;
    }

}
