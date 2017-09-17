import java.util.Scanner;

public class Task3 {

    public static void Cout(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }

    public static int Max(int[]arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
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

        Cout(arr);

     for(int i=0; i<n; i++)
         for(int j=i+1; j<n; j++)
         {
             if(Max(arr[i])>Max(arr[j]))
             {
                 int[] tmp = arr[i];
                 arr[i]=arr[j];
                 arr[j]=tmp;
             }

         }
        Cout(arr);
    }

}