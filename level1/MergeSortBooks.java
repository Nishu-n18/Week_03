package level1;
import java.util.Arrays;

public class MergeSortBooks {

    // Function to perform Merge Sort
    public static void mergeSort(int[] prices, int left, int right) {
        //if starting index is less than end index
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort both halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays
    private static void merge(int[] prices, int left, int mid, int right) {
        // Create temporary array
        int[] merged = new int[right-left+1];
        int i=left,j=mid+1;
        // Merge the arrays
        int k=0;
        while (i <=mid && j <=right) {
            if (prices[i] <= prices[j]) {
                merged[k++] = prices[i++];
            } else {
                merged[k++] = prices[j++];
            }
        }

        // Copy remaining elements if any
        while (i <=mid) {
            merged[k++] = prices[i++];
        }

        while (j <=right) {
            merged[k++] = prices[j++];
        }
        //convert merged array to original array
        for(int a=0,b=left;a<merged.length;a++,b++){
            prices[b]=merged[a];
        }
    }

    // Main function to test Merge Sort
    public static void main(String[] args) {
        int[] bookPrices = {400, 150, 159, 99, 450, 200};

        System.out.println("Original Prices: " + Arrays.toString(bookPrices));

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(bookPrices));
    }
}
