class moveAllnegitveToright{
    public static void main(String[] args) {
        int arr []  ={5, 7, -3, -4, -9, -10, -1, -11};
        int allpos = 0 , allnev = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                allpos++;
            }
            else{
                allnev++;
            }
        }
        // System.out.println(allpos);
        int positive[] = new int[allpos]; 
        int negative[] = new int[allnev];
        int j = 0;
        int k = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                 positive[j] = arr[i];
                 j++;
            }
           
            
            else{
                negative[k] = arr[i];
                k++;
            }

        }

        

        for(int i = 0 ; i < allpos ; i++){
            arr[i] = positive[i];
            
            // arr[allpos+i-1] = negative[i];
        }
        
        // for(int i = allpos-1; i<allnev+allpos ; i++){
        //     arr[i] = negative[];
        // }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
}
}