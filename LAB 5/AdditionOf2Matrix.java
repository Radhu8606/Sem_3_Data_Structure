.import java.util.Scanner;
public class AdditionOf2Matrix {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and cloumn of the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] m1 = new int[r][c];
        int [][] m2 = new int[r][c];
        int [][] m = new int[r][c];
        if(r != c){
            System.out.println("Plz enter row and column same");
        }
        else{
            System.out.println("enter element in first matrix");
           for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m1[i][j] = sc.nextInt();
            }
           }
           System.out.println("enter element in second matrix");
           for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m2[i][j] = sc.nextInt();
            }
           }

           for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                m[i][j] = m1[i][j] + m2[i][j];
              }
           }
           System.out.println("new matrix");
           for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              System.out.println(m[i][j]);
            }
         }
     }
   }
}