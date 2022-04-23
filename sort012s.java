import java.util.Arrays;

public class sort012s {
    public static void main(String[] args) {
        int arr[]  = {0,1,0,2,1,0,2,1};
        sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        int zero =0 ;
        int one  = 0 ;
        int two = 0 ;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] == 0){
            zero++;
        
        }
        else if(arr[i] == 1){
            one++;
        }
        else{
            two++;
        }
       }
       for (int i = 0; i < zero; i++) {
        arr[i]  = 0;
     }
     
     for (int i = zero; i < one+zero; i++) {
      arr[i]  = 1;
  }
  for (int i = one+zero; i < two+zero+one; i++) {
      arr[i]  = 2;
  }

  for (int aa : arr) {
      System.out.print(aa  + " ");
      
  }
    }
    }

    

