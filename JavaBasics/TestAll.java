package JavaBasics;
import java.util.Arrays;

public class TestAll {

    public static  void isCute(String name) {
        System.out.println(name + " is very cute");
    }

    public static int multiplyNum(int a, int b) {
        return a * b;
    }


    public void readMe(){
        System.out.println("Everyone is interested in learning wha's readMe mean. Can you tell us what's going on");
    }

    public static void main(String[] args){

        isCute("Mary");
        System.out.println("This is our product:" + multiplyNum(3,40));

        TestAll x = new TestAll();
        x.readMe();

    }
}
