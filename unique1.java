public class unique1 {

    private static int ans(int[] arr) {
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }

     public static void main(String[] args) {
         int[] arr = {2,2,4,3,3,3,4,6,4,2};
         System.out.println(ans(arr));
     }
    }