class implementationBinary{
    public static void main(String[] args) {
        int arr[] = { 2,3,4,66,77,84};
        int size  = arr.length;
        int target  = 6;
       int targetIndex =  binarySearch(arr , size , target);
       System.out.println(targetIndex);
    }

     static int binarySearch(int[] arr, int size, int target) {
        int s = 0 ;
        int e = size-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                s = mid +1;
            }
            else{
                e = mid-1;
            }

        }
        return -1;
    }
}