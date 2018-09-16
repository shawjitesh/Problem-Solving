import java.util.Scanner;

public class SimpleArraySum {

    static int arraySum(int[] array) {

        int sum = 0, len = array.length;

        for(int i = 0; i < len; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        in.close();

        System.out.println("The sum of the array elements is : " + arraySum(array));
    }
}