import java.util.Arrays;

public class Maximumsumsubarray {
    public static void main(String[] args) {
        int x=Integer.MIN_VALUE;
        int []arr=new int[]{2, 1, 5, 1, 3, 2 };
        int result=maximumsubArray(arr,3);
        System.out.println("Maximum sum of subarrays of size k " + result);
    }

    public static int maximumsubArray(int []arr,int k){

       int windowSum=0;
       int windowStart=0;
       int maxSum=0;

       for (int i=0;i<arr.length;i++){
           windowSum+=arr[i];
           if(i>=k-1){
               if (maxSum<=windowSum){
                   maxSum=windowSum;
               }
               windowSum-=arr[windowStart];
              windowStart++;
           }
       }
       return maxSum;
    }
}
