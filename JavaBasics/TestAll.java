package JavaBasics;
import java.util.Arrays;
public class TestAll {
    public static void main(String[] args) {


        int lengthOfService = 42;

        switch(lengthOfService) {
            case 1:
                System.out.println("Cadet");
                break;

            case 3:
                System.out.println("Officer");
                break;

            case 4:
                System.out.println("Lieutenant");
                break;

            default:
                System.out.println("Rank not found. Please try again");
                break;
        }

    }
}
