import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {

    public static void main(String[] args) {
        sortWithIndexes();
        sortWithComparator();
    }
    
    public static void sortWithIndexes() {
        int[] nums = new int[]{20, 11, 30, 7, 15, 40, 12, 5, 22, 7};
        Arrays.sort(nums, 3, 8);
        // Elements are sorted between position 3 and 8 
        // Sorted array should look like:
        // {20, 11, 30, 5, 7, 12, 15, 40, 22, 7}
        
        assert(nums[0] == 20) : "Incorrect number at position 0";
        assert(nums[1] == 11) : "Incorrect number at position 1";
        assert(nums[2] == 30) : "Incorrect number at position 2";
        assert(nums[3] == 5) : "Incorrect number at position 3";
        assert(nums[4] == 7) : "Incorrect number at position 4";
        assert(nums[5] == 12) : "Incorrect number at position 5";
        assert(nums[6] == 15) : "Incorrect number at position 6";
        assert(nums[7] == 40) : "Incorrect number at position 7";
        assert(nums[8] == 22) : "Incorrect number at position 8";
        assert(nums[9] == 7) : "Incorrect number at position 9";
    }
    
    public static void sortWithComparator() {
        Integer[] nums = new Integer[]{4,2,7,1,3,8,5};
        Arrays.sort(nums, new Comparator<Integer>(){
            public int compare(Integer num1, Integer num2) {
                // order by square root of number
                return new Integer(num1*num1).compareTo(num2*num2);
            }
        });
        
        assert(nums[0] == 1) : "Incorrect number at position 0";
        assert(nums[1] == 2) : "Incorrect number at position 1";
        assert(nums[2] == 3) : "Incorrect number at position 2";
        assert(nums[3] == 4) : "Incorrect number at position 3";
        assert(nums[4] == 5) : "Incorrect number at position 4";
        assert(nums[5] == 7) : "Incorrect number at position 5";
        assert(nums[6] == 8) : "Incorrect number at position 6";
    }
}