import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={1,32,4,54};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        int []result=reverseArray(arr,0,arr.length-1);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }

    public static int[] reverseArray(int[] arr,int start,int end){
        int temp;
       while(start<end){
           temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;

       }
        return arr;
    }
}
