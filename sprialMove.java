import java.util.Scanner;

class sprialMove{
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
         int minrow = 0;
         int maxrow = arr.length-1;
         int mincol = 0; 
         int maxcol = arr[0].length-1;
         int totalEle = r*c;
         int count = 0;

         System.out.println();
             
   while(count<=totalEle){
            //  left wall
        for (int i = minrow ,  j = mincol; i < maxrow; i++) {
            System.out.println(arr[i][j]);
            count++;
        }

        for (int i = mincol,  j = maxrow; i < maxcol; i++) {
            System.out.println(arr[j][i]);
            count++;
        }

        for (int i = maxrow ,  j = maxcol; i >= minrow; i--) {
            System.out.println(arr[i][j]);
            count++;
        }

        for (int i = maxcol ,  j = minrow; i > mincol; i--) {
            System.out.println(arr[j][i]);
            count++;
        }
   }
    }
}

}