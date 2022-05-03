public class MergeSortedArray {
    public static void main(String[] args) {
        int []arr1={2,4,6,8};
        int []arr2={1,5,7};
        int []result=mergeArrays(arr1,arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int i=0,j=0,k=0;
        int arr3[]=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
         while(i<arr1.length){
             arr3[k]=arr1[i];
             i++;
             k++;
         }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3; // make a new resultant array and return your results in that
    }
}
