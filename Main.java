import java.util.Scanner;

public class Main {

    public static void Cout(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }

    public static int Min(int[]arr) {

        int pos=0;
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<=min){
                min=arr[i];
                pos=i;
            }
        }

        return pos;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter n: ");
        n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = in.nextInt();
        //arr[i][j]=(int)(Math.random()*10);

        //Cout(arr);

        int min=Min(arr[0]);
        boolean flag=false;

        for(int i=1; i<n; i++) {
        if(min>Min(arr[i])) {
            flag = true;
            break;
            }
            min=Min(arr[i]);
        }

        if(flag==true) System.out.println("Sorry, but no(((");
        else System.out.println("Yea, its good!");

    }
}