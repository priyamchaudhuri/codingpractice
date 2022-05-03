public class MinElementRotate {
    public static void main(String[] args) {
        int []arr={5,1,2,3,4};
       int  min=findMin(arr,0,arr.length-1);
        System.out.println(min);
    }

    public static int findMin(int []arr,int low,int high) {
        if (arr.length==1)
            return arr[0];//
        while (low < high) {
            int mid = low + (high - low) / 2;//2
            if (mid>0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[low] <= arr[mid] && arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[low];
    }

}
