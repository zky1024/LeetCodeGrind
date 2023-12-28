package util;

public class LCUtil {

    public static void generateNewNames(String s) {
        // transform a string to a suitable java directory name
        // 2558. Take Gifts From the Richest Pile => lc2558_take_gifts_from_the_richest_pile
        System.out.println("lc" + s.toLowerCase().replace(" ", "_").replace(".", ""));
        System.out.println();
        // extract the number from a string
        // 2558. Take Gifts From the Richest Pile => 2558
        System.out.println("SolutionLC" + s.replaceAll("[^0-9]", ""));

        System.out.println();
        System.out.println("TestLC" + s.replaceAll("[^0-9]", ""));
    }

    public static void main(String[] args) {
        generateNewNames("2558. Take Gifts From the Richest Pile");
    }
}
