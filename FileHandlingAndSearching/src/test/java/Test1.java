import org.example.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.BinarySearchFirstLast.findFirstAndLast;
import static org.example.CompareStringBuilderWithBuffer.compare;
import static org.example.ConcatenateString.concatenateStrings;
import static org.example.FirstNegativeNumber.findNegativeNumber;
import static org.example.LinearAndBinarySearch.binarySearch;
import static org.example.LinearAndBinarySearch.firstMissingPositive;
import static org.example.LinearSearchSentence.findSentenceWithWord;
import static org.example.PeakElement.findPeak;
import static org.example.RemoveDuplicates.removeDuplicates;
import static org.example.ReverseString.reverseString;
import static org.example.RotationPointFinder.findRotationPoint;
import static org.example.SearchIn2DArray.searchMatrix;

public class Test1 {
    @Test
    void reverseString(){
    Assertions.assertEquals("olleh", ReverseString.reverseString("hello"));
}
    @Test
void removeDuplicate(){
    String input="Hello";
    Assertions.assertEquals("Helo",removeDuplicates(input));
}
    @Test
    void concatenation(){
    String[] words = {"Hello", " ", "Folks", "!", " Welcome", " to", " Capgemini"};
    Assertions.assertEquals("Hello Folks! Welcome to Capgemini",concatenateStrings(words));
}
    @Test
    void f4(){
    //Assertions.assertEquals("ram",compare()); void method can not be tested

}
    @Test
    void searchFirstNegative(){
    int arr[]={1,3,-1,2,5};
    Assertions.assertEquals(2,findNegativeNumber(arr));
    
}
    @Test
    void searchsentences(){
    String sentences[]={"Hello world","I love java language"};
    String word="java";
    Assertions.assertEquals("I love java language",findSentenceWithWord(sentences, word));
}
    @Test
    void rotationPoint(){
    int arr[]={6, 7, 9, 15, 19, 2, 3};
    Assertions.assertEquals(2,findRotationPoint(arr));
}
    @Test
    void peak(){
    int arr[]={1,3,15,8,5};
    Assertions.assertEquals(15,findPeak(arr));
}
    @Test
     void serchIn2D(){
    // Example matrix
     int[][] matrix = {
            {1, 3, 5},
            {10, 12, 14},
            {20, 22, 24},
            {30, 35, 40}
     };
     int target = 22;
     Assertions.assertEquals(true,searchMatrix(matrix, target));
}
    @Test
    void firstLast(){
        int[] arr = {1, 2, 2, 2, 2, 4, 5, 5, 6};
        int target = 2;

        int newArr[] = {1,4};

        Assertions.assertArrayEquals(newArr,findFirstAndLast(arr, target));
    }
    @Test
    void linearAndBinary(){
        int[] arr = {3, 4, -1, 1};
        int target = 4;
        Assertions.assertEquals(2,firstMissingPositive(arr));
        Assertions.assertEquals(3,binarySearch(arr,target));
    }

}
