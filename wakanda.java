import java.util.Scanner;

public class wakanda {

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
                System.out.println();
                int k = 0;
                for (int i = 0; i < c; i++) {
                    if(k <r)
                    for (int j = 0; j < r; j++) {
                        System.out.print(arr[j][i] + " ");
                        k++;
                    }
                    
                    
            
            
            
                    else{
                        
                        for (int j = r-1; j >= 0; j--) {
                            System.out.print(arr[j][i] + " ");
                            
                        }
                        k=0;
                    }
                    System.out.println();
                    
                }
        }
    }
    
}
