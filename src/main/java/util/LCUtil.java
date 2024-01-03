package util;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class LCUtil {

    public static String generateFolderName(String s) {
        return "lc" + s.toLowerCase().replace(" ", "_").replace(".", "");
    }


    public static String generateSolutionName(String s) {
        return "SolutionLC" + s.replaceAll("[^0-9]", "");
    }


    public static String generateTestName(String s) {
        return "TestLC" + s.replaceAll("[^0-9]", "");
    }

    public static void main(String[] args) {
        generateNewNames("2558. Take Gifts From the Richest Pile");
    }
}
