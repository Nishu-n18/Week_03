package org.example;
public class FirstNegativeNumber {
    public static int findNegativeNumber(int []arr) {
         //iterate through array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;//return index
            }
        }
            return -1;
        }
        public static void main(String[] args){
            int arr[]={2,4,3,-1,5,-3};
            int index=findNegativeNumber(arr);
            if(index!=-1){
                System.out.println("Number found at index " + index);
            }
            else{
                System.out.println("Negative num not found");
            }
        }
}
