public class FirstLastBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int n = arr.length;
        int x = 8;
        System.out.println("First Occurrence = " + first(arr, 0, n - 1, x));
        System.out.println("Last Occurrence = " + last(arr, 0, n - 1, x));
    }

    //1,2,3,4,5,6,6,7

    //mid=1



    public static int first(int arr[],int low,int high,int x){
        if (high>=low){
            int mid=low+(high-low)/2;
            if((mid==0||x>arr[mid-1])&&arr[mid]==x){
                return mid;
            }else if(x>arr[mid]){
                return first(arr,mid+1,high,x);
            }else{
                return first(arr,low,mid-1,x);
            }
        }
        return -1;
    }

    public static int last(int arr[],int low,int high,int x){
        int n=arr.length;
        if (high>=low){
            int mid=low+(high-low)/2;
            if((mid==n-1||x<arr[mid+1])&&arr[mid]==x){
                return mid;
            }else if(x<arr[mid]){
                return last(arr,low,mid-1,x);
            }else{
                return last(arr,mid+1,high,x);
            }
        }
        return -1;
    }
}
