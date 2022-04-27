public class SwapAlternative {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,3,2,32,23,2,22};
        for (int i = 0; i < arr.length; i+=2) {
            if(i+1 < arr.length){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for (int a : arr) {
            System.out.print(a +  " ");
        }
    }
    
}
