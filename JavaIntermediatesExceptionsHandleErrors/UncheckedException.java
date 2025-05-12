package JavaIntermediatesExceptionsHandleErrors;

public class UncheckedException {
    public static void main(String[] args) {

        int[] arr = {1,2,4};

        //System.out.println(arr[5]);     //This will raise error called "ArrayIndexOutOfBoundsException" at run time
        //To fix it is to access something that is not out of bounds
        System.out.println(arr[0]);
    }
}
