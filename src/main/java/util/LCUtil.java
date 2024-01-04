package util;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
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
        String input = "2062. Count Vowel Substrings of a String";
        // generate names
        String folderName = generateFolderName(input);
        String solutionName = generateSolutionName(input);
        String testName = generateTestName(input);

        // Absolute paths for folder and files
        String baseDir = "E:\\LeetCodeGrind\\src\\main\\java\\";
        String testDir = "E:\\LeetCodeGrind\\src\\test\\java\\";
        Path folderPath = Paths.get(baseDir + folderName);
        Path solutionPath = Paths.get(baseDir + folderName + "\\" + solutionName + ".java");
        Path testFolderPath = Paths.get(testDir + folderName);
        Path testFilePath = Paths.get(testDir + folderName + "\\" + testName + ".java");


        try {
            // create folder on path: src/main/java/folderName
            Files.createDirectories(folderPath);

            // create file on path: src/main/java/folderName/solutionName.java and write initial code
            Files.createFile(solutionPath);
            String solutionContent = "package " + folderName + ";" + "\n" + "\n" +
                    "/**" + "\n" +
                    " * "+ input + "\n" +
                    " *"+ "\n" +
                    " * @author Kai"+ "\n" +
                    " * @since " +   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date())  + "\n" +
                    " */" + "\n" +
                    "public class " + solutionName + " { \n    // Write your solution code here\n}";
            Files.write(solutionPath, Collections.singletonList(solutionContent));

            // create folder on path: src/test/java/folderName
            Files.createDirectories(testFolderPath);

            // create test file and write initial code
            Files.createFile(testFilePath);
            String testContent = "package " + folderName + ";\n\n" +
                    "import org.junit.Test;"+ "\n" + "\n" +
                    "/**" + "\n" +
                    " * "+ input + "\n" +
                    " *"+ "\n" +
                    " * @author Kai"+ "\n" +
                    " * @since " +   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date())  + "\n" +
                    " */" + "\n" +
                    "public class " + testName + " {\n\n" +
                    "    @Test\n" +
                    "    public void test1() {\n" +
                    "        " + solutionName + " solutionLC = new " + solutionName + "();\n" +
                    "        // Write your test code here\n" +
                    "    }\n" +
                    "}";
            Files.write(testFilePath, Collections.singletonList(testContent));

            System.out.println("Folders and files created successfully.");
        } catch (FileAlreadyExistsException e) {
            System.err.println("Folder or file already exists: ");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
