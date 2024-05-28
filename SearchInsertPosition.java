public class SearchInsertPosition {

    //This is a Binary search problem, as it has a sorted array values
    public static void main(String[] args){
        int[] nums = {1,3,5,6};//Input array
        int target = 5; // Target
        int index = binarySearch(nums, target);
        System.out.println("index is: "+ index);
    }

    static int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int missingIndex=0;
        while(low <= high){
            int middle = low + (high-low)/2;
            int value = nums[middle];
            if(value < target){
                low = middle+1;
                missingIndex = middle+1;
            }else if(value > target){
                high = high-1;
                missingIndex = middle;
            }else{
                return middle;
            }
//            missingIndex = middle+1;
        }
        return missingIndex;
    }
}
