/**
 * GreatLearning_1_1
 */
public class GreatLearning_1_1 {

    public static void main(String[] args) {
        
        int[] input = new int[]{1, 3, 5, 6, 6, 3, 1};

        naiveApproach(input);
        

    }

    private static void naiveApproach(int[] input){

        for(int i=0; i<input.length; i++){

            boolean flag = true;

            for(int j=0; j<input.length; j++){
                
                if(input[i] == input[j] && i != j) flag = false;
            }

            if(flag){

                System.out.println(input[i]);

                break;
            }
        }
    }
}