package sorting;

// Replace class name with your topic
class BubbleSort {

    //Define Approaches
    enum Approach {
        FIRST_APPROACH,
        SECOND_APPROACH,
        THIRD_APPROACH,
    }

    // Input the approach you want to execute.
    private static final Approach approach = Approach.SECOND_APPROACH;


    // Maintain the actual method name for clear understandings
    public int[] bubble_sort(int[] nums) {
        if (approach.equals(Approach.FIRST_APPROACH)) {
            return Approach_1(nums);
        }
        else if (approach.equals(Approach.SECOND_APPROACH)) {
            return Approach_2(nums);
        }
//        else if (approach.equals(utils.BoilerPlate.Approach.THIRD_APPROACH)) {
//            return Approach_Your_Approach_Number(your_inputs);
//        }
        return null;
    }

    // Approach_1: Bubble Sort Algorithm, TC-> O(n^2), SC -> O(1)
    // Outcome: ACCEPTED
    /*
     ---------------------------------------------------------------------- NOTE ----------------------------------------------------------------------
     * Make a short note on your approach
     Already written below
    */
    /*
     ---------------------------------------------------------------------- Algorithm ----------------------------------------------------------------------
     * Write an algorithm on your approach.
    */
    private int[] Approach_1(int[] nums) {
        // Code starts from here.
        // here, i<num.length-1, if the num.length = 5, bubble sort takes 5-1 = 4 passes at most
        for (int i = 0; i < nums.length - 1; i++) {
            // here,
            // for inner loop, we have to run the loop within nums.length-1 because we have check adjacent value
            // and, we have, run the loop within num.length-1-i because, for the bubble sort after each pass, the last item is always sorted.
            // So, we have to skip the last item in each iteration
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    // Approach_2: Bubble Sort Algorithm, TC-> O(n^2), SC -> O(1), in best case, TC -> O(N)
    // Outcome: ACCEPTED
    /*
     ---------------------------------------------------------------------- NOTE ----------------------------------------------------------------------
     * Make a short note on your approach
     Already written below
    */

    /*
     ---------------------------------------------------------------------- Algorithm ----------------------------------------------------------------------
     * Write an algorithm on your approach.
    */

    private int[] Approach_2(int[] nums) {
        // Code starts from here.
        for (int i = 0; i < nums.length - 1; i++) {
            // Here, we have performed, optimization by using this isSwapped value
            Boolean isSwapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // if array is not sorted, the block will be executed each time.
                    // if array is already sorted then, the block will not be executed again, but the iteration will be continued. So, we have to break this
                    // for many cases, the array will be sorted before nums.length-1 passes, so this optimization needed.
                    isSwapped = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return nums;
    }


    // Driver Class
    public static class Driver {
        public static void main(String[] args) {
            // Code starts from here.
            BubbleSort bubbleSort = new BubbleSort();
            int res[] = bubbleSort.bubble_sort(new int[]{2, 3, 1, 4, 6});
            for (int value : res) {
                System.out.print(value + " ");
            }
        }
    }
}

// Conclusion: Approach-2 is more optimal.
// FUTURE PLAN: Nothing to Say
