public class findTheDuplicateNumber {

    public static void main(String[] args) {
        int arr[] = {1,3,4,2,4,2};

    int count = 0 ;
    int i = 0;
    int num = 0 ;
    //  int j = 0;
     
     while(i<arr.length){
            int temp = arr[i] ; 
          for (int j = i+1; j < arr.length; j++) {
              if(temp == arr[j]){
                count++;
              } 
              else if (count > 1){
                num = arr[i];
              }
              
          }
          i++;
          count =0 ;
         
     }
     System.out.println(num);
    }
    
    
}
