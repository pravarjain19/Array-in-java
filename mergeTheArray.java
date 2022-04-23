public class mergeTheArray {

    public static void main(String[] args) {
        int arr1 [] = { 1,3,5,7,11,23};
        int arr2 [] = {0,2,4,8,9};
        int n = arr1.length;
        int m = arr2.length;
        mergeArray(arr1,arr2,n,m);
    }

    private static void mergeArray(int[] arr1, int[] arr2, int n, int m) {
        int ans[] = new int[n+m];
        int k = 0 ;
        int i =0;
        int j =0;
        int max =0 ;
        if(n<m){
            max = m;
        }
        else {
            max = n;
        }
        while(i<n  && j<m ){
            if(arr1[i]< arr2[j] ){
                ans[k] = arr1[i];
               i++;
            }
            else if ( arr2[j]< arr1[i] ){
                ans[k] = arr2[j];
                j++;

            }
            k++;
        }
        while(j<m) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
        while(i<n) {
            ans[k] = arr1[i];
            k++;
            i++;
        }


        

        for (int l : ans) {
            System.out.print(l + " ");
        }
    }
    
}
