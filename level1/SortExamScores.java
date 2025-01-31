package level1;
import java.util.Arrays;

public class SortExamScores {
    //method to perform selection sorting
    private static void sortScores(int[] scores) {
        int size = scores.length;

        for (int i = 0; i < size; i++) {
            //assume current index contain minimum element
            int min_index=i;
            for (int j = i+1; j < size; j++) {
                //if score at min index is greater, then update min index
                if (scores[min_index]>scores[j]){
                    min_index = j;
                }
            }
            //swap score at min index with score at i
            int temp = scores[min_index];
            scores[min_index]=scores[i];
            scores[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {65,50,23,95,29,80,25};
        sortScores(scores);
        System.out.println(Arrays.toString(scores));
    }
}
