import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        System.out.println("Enter the first number");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter the second number");
        b = Integer.parseInt(br.readLine());
        
        System.out.println("The sum is : " + solveMeFirst(a,b));
    }
}