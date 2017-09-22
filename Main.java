import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=0;
        int m=0;

        System.out.print("Please, Enter the n & m: ");

        n=in.nextInt();
        m=in.nextInt();

        Matrix A = new Matrix(n, m);

        System.out.println("Please, Enter your Matrix");
        A.Cin(in);

       // A.Cout();

        System.out.println("Max_Length_Egual_Sequence in row: "+A.rowIneed());

        System.out.println("Col_Local_Minimum: "+A.local_min());

        A.change_matrix();
        A.Cout();

    }
}
