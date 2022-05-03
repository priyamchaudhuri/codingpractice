import java.util.Arrays;

public class ContinuousAvgsldwindow {
    public static void main(String[] args) {
        double[] result=AverageofSubArraySlide(5,new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println("Average of subarrays of size k" + Arrays.toString(result));
    }

 //brute force
    public static double[] AverageofSubArrayBrute(int k,int arr[]){
        double[] result=new double[arr.length-k+1];

        for (int i=0;i<=arr.length-k;i++){
            double sum=0;
            for (int j=i;j<i+k;j++){
                sum+=arr[j];
            }
         result[i]=sum/k;
        }
        return result;

    }

//sliding
public static double[] AverageofSubArraySlide(int k,int arr[]){
    double[] result=new double[arr.length-k+1];
    double windowSum=0;
    int windowStart=0;
    for (int i=0;i<arr.length;i++){
        windowSum+= arr[i];
        if (i>=k-1){
            result[windowStart]=windowSum/k;
            windowSum=windowSum-arr[windowStart];
            windowStart++;
        }

    }
    return result;
}

}
