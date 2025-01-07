package sorting;

// Replace class name with your topic
class SelectionSort {

    //Define Approaches
    enum Approach {
        FIRST_APPROACH,
        SECOND_APPROACH,
        THIRD_APPROACH,
    }

    // Input the approach you want to execute.
    private static final Approach approach = Approach.FIRST_APPROACH;


    // Maintain the actual method name for clear understandings
    public int[] selection_sort(int[] nums) {
        if (approach.equals(Approach.FIRST_APPROACH)) {
            return Approach_1(nums);
        }
//        else if (approach.equals(Approach.SECOND_APPROACH)) {
//            return Approach_2(nums);
//        }
//        else if (approach.equals(utils.BoilerPlate.Approach.THIRD_APPROACH)) {
//            return Approach_Your_Approach_Number(your_inputs);
//        }
        return null;
    }

    // Approach_1: Selection Sort Algorithm, TC-> O(n^2), SC -> O(1)
    // Outcome: ACCEPTED
    /*
     ---------------------------------------------------------------------- NOTE ----------------------------------------------------------------------
     * Make a short note on your approach
       Selection Sort ->
       2, 3, 1, 4, 6
       *** here, we have to apply select minimum from the whole array and swap it with the sequential position (one after another) (actual position of the value on ascending fashion)
       here, we have to work with index(minIndex, i) due to swapping purpose
       N.B: In simple words, outer loop is used for iterating each value and storing the minimum value in sequential fashion.
       Inner loop is used for finding minimum value from the whole array in one pass, after found minimum place it with sequential index then iterate to other position excluding this on next iteration as we have placed the minimum value which is the place of this value if it's on ascending order so no need to use this position (fixed) further iteration
       then, repeat the same process until n-1
    */
    /*
     ---------------------------------------------------------------------- Algorithm ----------------------------------------------------------------------
     * Write an algorithm on your approach.
    */
    private int[] Approach_1(int[] nums) {
        // Code starts from here.
//        for (int i = 0; i < nums.length - 1; i++) {
              // assume the first value, or index is minimum, and then we have to compare the value starting with first position
//            int min = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] < nums[min]) {
//                    min = j;
//                }
//            }
//
        // this is for optimization. If the minimum value and the checking value are same then don't need to swap
//            if (min != i) {
//                int temp = nums[i];
//                nums[i] = nums[min];
//                nums[min] = temp;
//            }
//
//
//        }
//        return nums;

        for (int i = 0; i < nums.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minPos = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minPos = j;
                }
            }
            // this is for optimization. If the minimum value and the checking value are same then don't need to swap
            if (nums[i] != min) {
                int temp = nums[i];
                nums[i] = min;
                nums[minPos] = temp;
            }

        }
        return nums;
    }


    // Driver Class
    public static class Driver {
        public static void main(String[] args) {
            // Code starts from here.
            SelectionSort selectionSort = new SelectionSort();
            int res[] = selectionSort.selection_sort(new int[]{2, 3, 1, 4, 6});
            for (int value : res) {
                System.out.print(value + " ");
            }
        }
    }
}

// Conclusion: Approach-1 is optimal.
// FUTURE PLAN: Nothing to Say

