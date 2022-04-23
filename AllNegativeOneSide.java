public class AllNegativeOneSide {
    public static void main(String[] args) {
        int arr[] = {-5, 7, -3, -4, 9, 10, -1, 11};
        int k =0 ;
        int a[] = new int[arr.length]; 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0 ){
                a[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                a[k] = arr[i];
                k++;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
