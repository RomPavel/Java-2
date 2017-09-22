import java.util.Scanner;
public class Matrix {
    int[][] matrix;
    int n = 0, m = 0;

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[n][m];
    }

    void Cin(Scanner in) {
        for (int i = 0; i < this.n; i++)
            for (int j = 0; j < this.m; j++)
                this.matrix[i][j] = in.nextInt();

    }

    void Cout() {
        for (int i = 0; i < this.n; i++) {

            for (int j = 0; j < this.m; j++) {
                System.out.print(this.matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    int rowIneed() {
        int pos=0;
        int max_length = 1;
        int length=1;
        int num=0;

        for (int i = 0; i < this.n; i++) {

            num = this.matrix[i][0];

            for (int j = 1; j < this.m; j++) {

                if(this.matrix[i][j]!=num) {

                    num=this.matrix[i][j];

                    if(length>max_length) {
                        max_length = length;
                        length=1;
                        pos=i;
                    }
                }
                else
                    length++;
            }

            if(length>max_length) {
                max_length = length;
                length=1;
                pos=i;
            }
        }

        return pos;
    }


    int local_min() {
    int sum=0;
    int col=0;
    int neighboors=0;

    for(int i=0; i<this.n; i++)
       for(int j=0; j<this.m; j++) {
           sum = 0;
           neighboors=-1;
           for (int k = Math.max(0, i - 1); k <= Math.min(i + 1, this.n-1); k++) {
               for (int l = Math.max(0, j - 1); l <= Math.min(j + 1, this.m-1); l++) {

                   neighboors++;

                   if (this.matrix[i][j] < this.matrix[k][l])
                       sum++;
                   else
                       break;
               }

           }
           if(sum==neighboors) col++;
       }
        return col;
    }



    int[] MaxElement() {

        int max=this.matrix[0][0];
        int[] pos = new int [2];
        pos[0]=0;
        pos[1]=0;
        for(int i=0; i<this.n; i++)
            for(int j=0; j<this.m; j++)
                if(this.matrix[i][j]>max)
                {
                    max=this.matrix[i][j];
                    pos[0]=i;
                    pos[1]=j;
                }
                return pos;
    }
    void change_matrix() {
        int[] pos = new int[2];
        pos=this.MaxElement();

        if (pos[0] != 0) {
            int[] tmp = this.matrix[pos[0]];
            this.matrix[pos[0]] = this.matrix[0];
            this.matrix[0] = tmp;
        }

        if (pos[1] != 0) {

            for(int i=0; i<this.m; i++) {
            int tmp=this.matrix[i][0];
            this.matrix[i][0]=this.matrix[i][pos[1]];
            this.matrix[i][pos[1]]=tmp;
            }
        }

    }
}





