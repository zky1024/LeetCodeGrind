package util;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Collections;

public class LCUtil {

    private static String generateFolderName(String s) {
        return "lc" + s.toLowerCase().replace(" ", "_").replace(".", "");
    }

    private static String generateSolutionName(String s) {
        return "SolutionLC" + s.replaceAll("[^0-9]", "");
    }

    private static String generateTestName(String s) {
        return "TestLC" + s.replaceAll("[^0-9]", "");
    }

    public static void main(String[] args) {
        String input = "217. Contains Duplicate";
        // generate folders and files
        gen(input);
    }

    private static void gen(String input) {
        String nm = "";

        String folderName = generateFolderName(input);
        String solutionName = generateSolutionName(input);
        String testName = generateTestName(input);

        // Absolute paths for folder and files
        // check operating system and change path accordingly
        String baseDir = "";
        String testDir = "";

        if (System.getProperty("os.name").startsWith("Mac")) {
            // for mac
            baseDir = "/Users/" + nm +"/IdeaProjects/LeetCodeGrind/src/main/java/"; // for mac
            testDir = "/Users/" + nm +"/IdeaProjects/LeetCodeGrind/src/test/java/"; // for mac
        } else {
            // for windows
            baseDir = "E:\\LeetCodeGrind\\src\\main\\java\\"; // for windows
            testDir = "E:\\LeetCodeGrind\\src\\test\\java\\"; // for windows
        }


        String solutionFolderPathString = baseDir + folderName;
        String testFolderPathString = testDir + folderName;
        System.out.println("solutionFolderPathString: " + solutionFolderPathString);
        System.out.println("testFolderPathString: " + testFolderPathString);
        Path solutionFolderPath = Paths.get(solutionFolderPathString);
        Path testFolderPath = Paths.get(testFolderPathString);

        String solutionFilePathString ="";
        String testFilePathString = "";
        Path solutionFilePath;
        Path testFilePath;
        if (System.getProperty("os.name").startsWith("Mac")) {
            // for mac
            solutionFilePathString = solutionFolderPathString + "/" + solutionName + ".java";
            testFilePathString = testFolderPathString + "/" + testName + ".java";
        } else {
            // for windows
            solutionFilePathString = solutionFolderPathString + "\\" + solutionName + ".java";
            testFilePathString = testFolderPathString + "\\" + testName + ".java";
        }
        System.out.println("solutionFilePathString: " + solutionFilePathString);
        System.out.println("testFilePathString: " + testFilePathString);

        solutionFilePath = Paths.get(solutionFilePathString);
        testFilePath = Paths.get(testFilePathString);


        try {
            // create folder on path: src/main/java/folderName
            System.out.printf("Creating folder: %s%n", solutionFolderPath);
            Files.createDirectories(solutionFolderPath);

            // create file on path: src/main/java/folderName/solutionName.java and write initial code
            Files.createFile(solutionFilePath);
            String solutionContent = "package " + folderName + ";" + "\n" + "\n" +
                    "/**" + "\n" +
                    " * " + input + "\n" +
                    " *" + "\n" +
                    " * @since " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()) + "\n" +
                    " */" + "\n" +
                    "public class " + solutionName + " { \n    // Write your solution code here\n}";
            Files.write(solutionFilePath, Collections.singletonList(solutionContent));



            // create folder on path: src/test/java/folderName
            Files.createDirectories(testFolderPath);

            // create test file and write initial code
            Files.createFile(testFilePath);
            String testContent = "package " + folderName + ";\n\n" +
                    "import org.junit.Test;" + "\n" + "\n" +
                    "/**" + "\n" +
                    " * " + input + "\n" +
                    " *" + "\n" +
                    " * @since " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()) + "\n" +
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
