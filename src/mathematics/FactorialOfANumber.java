package mathematics;


import java.math.BigInteger;

// Replace class name with your topic
class FactorialOfANumber {

    //Define Approaches
    enum Approach {
        FIRST_APPROACH,
        SECOND_APPROACH,
        THIRD_APPROACH,
    }

    // Input the approach you want to execute.
    private static final Approach approach = Approach.SECOND_APPROACH;


    // Maintain the actual method name for clear understandings
    public BigInteger findFactorial(int value) {
        if (approach.equals(Approach.FIRST_APPROACH)) {
            return BigInteger.valueOf(Approach_1(value));
        } else if (approach.equals(Approach.SECOND_APPROACH)) {
            return Approach_2(value);
        }
//        else if (approach.equals(Approach.THIRD_APPROACH)) {
//            return Approach_Your_Approach_Number(your_inputs);
//        }
        return BigInteger.ZERO;
    }

    // Approach_1: Iterative Approach. TC: O(N), SC: O(1).
    // Outcome: ACCEPTED
    /*
     * Problems: It'll work till 12!, and overflow on 13!
     * 13! = 6,227,020,800 → This is greater than the maximum int value (2,147,483,647), so it will overflow.
     * If we are thinking of using long type, It'll work till 20!, and overflow on 21!
     * 21! = 51,090,942,171,709,440,000 (This exceeds the maximum long value ->  9,223,372,036,854,775,807.)
     */

    /*
     ---------------------------------------------------------------------- NOTE ----------------------------------------------------------------------
     * Make a short note on your approach
     // No Need (Simple Approach)
    */

    /*
     ---------------------------------------------------------------------- Algorithm ----------------------------------------------------------------------
     * Write an algorithm on your approach.
    */
    private int Approach_1(int value) {
        // Code starts from here.
        int result = 1;
        if (value == 1 || value == 0) {
            return 1;
        }
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // Approach_1: Using BigInteger TC: O(n² log n), SC: O(n log n).
    // Outcome: ACCEPTED

    /*
     ---------------------------------------------------------------------- NOTE ----------------------------------------------------------------------
     * Make a short note on your approach
    */
    //Java's BigInteger class can handle arbitrarily large integers,
    // constrained only by the available memory on your machine.
    // There is no predefined upper limit on the size of the number BigInteger can represent. Instead, the limit depends on the amount of memory the JVM can allocate.
    /*
     ---------------------------------------------------------------------- Algorithm ----------------------------------------------------------------------
     * Write an algorithm on your approach.
    */
    private BigInteger Approach_2(int value) {
        // Code starts from here.
        if (value == 0 || value == 1) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Driver Class
    public static class Driver {
        public static void main(String[] args) {
            // Code starts from here.
            FactorialOfANumber factorialOfANumber = new FactorialOfANumber();
            BigInteger result = factorialOfANumber.findFactorial(100);
            System.out.println(result);
        }
    }
}

// Conclusion: Compare your approaches and report the best one according to your findings.
// FUTURE PLAN: Write about your upcoming approaches on this problem.
