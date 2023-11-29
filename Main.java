import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println((new Solution()).longestConsecutive(nums));
    }
}

class Solution{
    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int resLen = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int curLen = 1;
                while(set.contains(num + 1)){
                    curLen += 1;
                    num += 1;
                }
                resLen = Math.max(resLen, curLen);
            }
        }
        return resLen;
    }
}
