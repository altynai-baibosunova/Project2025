import java.util.Arrays;

public class AzretClass_MajorityElement_169LeetCode {

        public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = -1;

            for(int num : nums){
                if(count == 0){
                  candidate = num;

                }if(candidate==num){
                    count++;
                }else{
                    count--;
                }
            }
            return candidate;

        }

        public static void main(String[] args) {
           int[] nums = {2,2,1,1,1,2,2};
           AzretClass_MajorityElement_169LeetCode solution= new AzretClass_MajorityElement_169LeetCode();
          int result= solution.majorityElement(nums);
            System.out.println(result);
        }
        }

//169. Majority Element
//Easy
//Topics
//premium lock icon
//Companies
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2