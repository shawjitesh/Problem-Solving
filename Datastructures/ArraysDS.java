import java.util.Scanner;

public class ArraysDS {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        in.close();

        System.out.println("The array elements in reverse order are");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
