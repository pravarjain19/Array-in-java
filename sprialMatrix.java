import java.util.Scanner;

class sprialMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int arr[][] = new int[r][c];
             for (int i = 0; i < r; i++) {
                 for (int j = 0; j < c; j++) {
                     arr[i] [j] = sc.nextInt();
                 }
    
             }
             for (int j = 0; j < arr[0].length; j++) {
                 if(j%2==0){
                     for (int i = 0; i < arr.length; i++) {
                         System.out.print(arr[i][j]  + " ");
                     }
                 }
                 else{
                     for (int i = r-1; i >= 0; i--) {
                         System.out.print(arr[i][j] + " ");
                     }
                 }
                 System.out.println();
                 
             }
        }
    }
}