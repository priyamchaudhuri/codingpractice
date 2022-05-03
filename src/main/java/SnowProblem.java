public class SnowProblem {
    public static void main(String[] args) {
     int arr[]={0,1,3,0,1,2,0,4,2,0,3,0};
        System.out.println(getSnow(arr));
    }

    public static int getSnow(int[] arr){
        int []left =new int[arr.length];
        int []right=new int[arr.length];
        left[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            {
                if (arr[i]>=left[i-1]){
                    left[i]=arr[i];
                }else{
                    left[i]=left[i-1];
                }
            }
        }
        right[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            {
                if (arr[i]>=right[i+1]){
                    right[i]=arr[i];
                }else{
                    right[i]=right[i+1];
                }
            }
        }
        int snow=0;
        for(int i=0;i<arr.length;i++){
            int min=Math.min(left[i],right[i]);
            snow=snow + min-arr[i];
        }
        return snow;
    }
}
