package Week3;
import java.util.*;

public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n  = input.nextInt();
        float[][] matrix1 = new float[n][n];
        float[][] matrix2 = new float[n][n];
        System.out.println("Enter matrix1: ");
        for(int i = 0; i<n;i++){
            for(int j = 0 ; j<n ;j++){
                matrix1[i][j] = input.nextFloat();
            }
        }  

        System.out.println();
        
        System.out.println("Enter matrix2: ");
        for(int i = 0; i<n;i++){
            for(int j = 0 ; j<n ;j++){
                matrix2[i][j] = input.nextFloat();
            }
        }
        System.out.println();
        

        for(int i = 0; i<n;i++){
            for(int j = 0 ; j<n ;j++){
                System.out.print(matrix1[i][j]+ " ");
            }
        System.out.println();
        }

        System.out.println("+");

        for(int i = 0; i<n;i++){
            for(int j = 0 ; j<n ;j++){
                System.out.print(matrix2[i][j]+ " ");
            }
        System.out.println();
        }


        float[][] a = new float[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.print("The matrices are added as follow: ");
        System.out.println();

        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+ " ");
            }
        System.out.println();
        }        
        

    input.close(); 
    }

}
