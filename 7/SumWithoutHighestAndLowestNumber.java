import java.util.Arrays;

import java.util.stream.IntStream;

public class SumWithoutHighestAndLowestNumber {

        static int ARRAY_LENGTH = 3;
        static int SOL_TEST = 1;

        public static void main(String[] args) {
            int[] testArray = new int[ARRAY_LENGTH];
            for (int i = 0; i < ARRAY_LENGTH; i++)
                testArray[i] = (int) Math.floor(Math.random()*100 - 50);
            System.out.println("Random array: " + Arrays.toString(testArray));

            int sum_test = sol2(testArray);
            
            Arrays.sort(testArray);
            System.out.println("Sorted: " + Arrays.toString(testArray));
            int sum = 0;
            for (int i = 1; i < ARRAY_LENGTH - 1; i++)
                sum += testArray[i];
            System.out.println("The answer is " + sum);
            System.out.println("My method gave " + sum_test);
        }

        public static int sol1 (int[] nums){
            if (nums == null || nums.length <= 1) return 0;
            int min, max, sum;
            min = max = sum = nums[0];
            for (int i = 1; i < nums.length; i++) { 
                sum += nums[i];
                System.out.println("sum is " + sum);
                if (nums[i] < min) min = nums[i];
                if (nums[i] > max) max = nums[i];
            }
            System.out.println("max is " + max + " min is " + min + " sum before is " + sum);
            return sum - min - max;
        }

        public static int sol2(int[] nums){
            if (nums == null || nums.length <= 2)
                return 0;
            else {
                return of(nums).sum();
            }
        }
}
