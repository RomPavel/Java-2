import java.util.Scanner;

public class Morty {

    public static void Cout(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter n: ");
        n=in.nextInt();
        int[][]arr = new int[n][n];
        for(int i=0 ; i<n; i++)
            for(int j=0; j<n; j++)
                arr[i][j]=in.nextInt();
                //arr[i][j]=(int)(Math.random()*10);

        Cout(arr);

        int max=1;
        int num=0;
        int length=1;
        int pos=0;
        for(int i=0; i<n; i++) {
            length=1;
            num=arr[i][0];

            for (int j = 1; j < n; j++) {

                if(arr[i][j]==num) length++;
                else {
                    num=arr[i][j];
                    if(length>max)
                    {
                        max=length;
                        pos=i;
                    }
                    length =1;
                }

            }
            if(length>max) {max=length; pos=i;}
        }

        System.out.println("Row #"+(pos+1));



    }
}



