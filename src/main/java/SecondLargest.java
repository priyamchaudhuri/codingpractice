public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12,43,54,2,45,5};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=firstMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
