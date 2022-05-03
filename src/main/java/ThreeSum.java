import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int []arr={-1,0,1,2,-1,-4};
        List<List<Integer>> list=threeSum(arr);
        for(List list123:list){
            for (int i=0;i<list123.size();i++){
                System.out.print(list123.get(i)+",");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output=new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=nums.length-1;
                int sum=0-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        output.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1])
                            low++;
                        while(low<high && nums[high]==nums[high-1])
                            high--;
                        low++;
                        high--;
                    }else if (nums[low]+nums[high]>sum){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }
        return output;
    }

}
