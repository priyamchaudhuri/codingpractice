public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={12,43,54,2,45,5};
        System.out.println(secondSmallest(arr));
    }

    public static int secondSmallest(int[] arr){
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){

            if (arr[i] < firstMin)  {
                        secondMin=firstMin;
                firstMin=arr[i];
            }else if (arr[i]<secondMin && arr[i]!=firstMin){
                secondMin=arr[i];
            }
        }
        return secondMin;
    }
}
