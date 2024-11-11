import java.util.HashSet;

/**
 * GrearLearning_6_1
 */
public class GrearLearning_6_1 {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 1, -4, 1, -1};

        System.out.println(LongestSubArraySumZero_n2(arr));

    }

    private static int subArraySumZero_n2(int[] arr){

        //Time Complexity  = O(n*n)
        //Space Complexity = O(1)

        for(int i=0; i<arr.length; i++){

            int sum = 0;

            for(int j = i; j<arr.length; j++){

                sum = sum + arr[j];

                if(sum == 0) return 1;
            }
        }

        return 0;
    }

    private static int subArraySumZero_n(int[] arr){

        //Time Complexity = O(n)
        //Space Complexity = O(n)

        HashSet<Integer> set = new HashSet<>();

        set.add(0);

        int sum = 0;

        for(int a : arr){

            sum = sum + a;
            
            if(sum == 0) return 1;

            set.add(sum);
        }


        return 0;

    }


    private static int LongestSubArraySumZero_n2(int[] arr){

        //Time Complexity = O(n*n)
        //Space Complexity = O(1)

        int longestSubArray = 0;

        for(int i = 0; i<arr.length; i++){

            int sum = 0;

            for(int j = i; j< arr.length; j++){

                sum = sum + arr[j];

                if(sum == 0){

                    // longestSubArray =  (j-i+1) > longestSubArray ? (j-i+1) : longestSubArray;

                    longestSubArray = Math.max(j-i+1, longestSubArray);
                }
            }
        }

        return longestSubArray;
    }
}