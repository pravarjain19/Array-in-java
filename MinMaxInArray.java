class MinMaxInArray{

    static class Pair{
        int max;
        int min;
    }
// by divide and concer method and more effective method to use this...

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, 0, arr_size - 1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }


    public static Pair getMinMax(int[] arr, int i, int j) {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        if(i==j){
            minmax.max = arr[i];
            minmax.min = arr[j];
            return minmax;
        }
        if(j == i+1){
            if(arr[i] > arr[j]){
                minmax.max = arr[i];
                minmax.min = arr[j];
            }
            else{
                minmax.max = arr[j];
                minmax.min = arr[i];
            }

            return minmax;

        }
        ///if two or more elements are there then

        int mid = (i+j)/2;
        mml = getMinMax(arr, 0, mid);
        mmr = getMinMax(arr, mid+1, j);

        if(mml.min<mmr.min){
            minmax.min = mml.min;
        }
        else{
            minmax.min = mmr.min;
        }

        if(mml.max>mmr.max){
            minmax.max = mml.max;
        }
        else{
            minmax.max = mmr.max;
        }
        return minmax;
    }
}