public class MinSubArraySum {

    public static void main(String[] args) {
       int []arr={1,2,3,4,5};
        System.out.println(minSubArrayLen(5,arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int windowSum=0;
        int windowStart=0;
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            windowSum=nums[i]+windowSum;
            while (windowSum>=target){
                minlength=Math.min(minlength,i-windowStart+1);
                windowSum=windowSum-nums[windowStart];
                windowStart++;

            }

        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }
}
