public class MinMaxmethod2 {

    static class Pair{
        int max ; 
        int min;
    }

    ///learn seacrh

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr,  arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }

    public static Pair getMinMax(int[] arr, int n) {
        Pair maxmin = new Pair();
        int i =0 ;

        if(n==1){
            maxmin.max = arr[i];
            maxmin.min = arr[i];
        
        return maxmin;
        }
        //more than 1 element tho intilaxe
        
        if(arr[0] > arr[1]){
            maxmin.max =arr[0];
            maxmin.min =arr[1];

        }
        else{
            maxmin.max = arr[1];
            maxmin.min = arr[0];

        }
        for(i = 2 ; i<n ; i++){
            if(arr[i] > maxmin.max){
                maxmin.max = arr[i];
            }
            else if (arr[i] < maxmin.min){
                maxmin.min =arr[i];
            }

            }
            return maxmin;
        }
    }
    

