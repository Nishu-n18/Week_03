package level1;
import java.util.Arrays;
public class SortEmployeeId {
    // method to perform sorting
    private static void sortId(int[] id) {
        for (int i = 1; i < id.length; i++) {
            //key element
            int key = id[i];
            int j = i-1;

            while (j>=0 && id[j]>key){
                id[j+1]=id[j];
                j--;
            }
            id[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] id = {1,5,3,2,4,7};
        //call sortId method
        sortId(id);
        //print sorted array
        System.out.println(Arrays.toString(id));
    }
}
