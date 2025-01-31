package level1;
import java.util.Arrays;

public class SortStudentMarks {
    //Method to sort student marks
    private static void sortMarks(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
          swapped=false;
            for (int j = 0; j <n-i-1 ; j++) {
                //if marks of current is greater than next then swap the current with next.
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }//if swapped is false then break
            if (!swapped){
                break;
            }
        }

    }
    public static void main(String[] args) {
        //Marks given
        int marks[]={85,33,50,65,25};
        sortMarks(marks);
        System.out.println(Arrays.toString(marks));
    }
}
