import java.util.*;

public class quickSort {

   public static void main(String[] args) {
      int[] array = new int[]{5, 7, 8, 31, 4, 65, 7, 2, 4, 73};
      System.out.println(Arrays.toString(array));
      quickSort(array, 0, array.length);
      System.out.println(Arrays.toString(array));
   
   }

   public static void quickSort(int[] array, int start, int end) {
      if (end - start > 1) {
         int pivot = (start + end) / 2;
         int pivotVal = array[pivot];
         swap(array, start, pivot);
         int left = start + 1;
         int right = end - 1;
         if (right - left > 1) {   
         
            while (left < right) {
            
               while (array[left] <= pivotVal) {
                  left++;
               }
               if (left == right) {
                  left--;
               }
               while (array[right] >= pivotVal) {
                  right--;
               }
               if (right == start + 1) {
                  right++;
               }
               if (array[left] > pivotVal && array[right] < pivotVal) {
                  swap(array, left, right);
               }
            /*
            if (array[right] < array[start] && array[left] > array[start]) {
               swap(array, left, right);
            }
            
            if (array[left] <= array[start]) {
               left++;
            }
            if (array[right] >= array[start]) {
               right--;
            }
            */
            
            }
            swap(array, start, left);
            quickSort(array, start, left);
            quickSort(array, left - 1, end);
         }
      }
   }


   private static void swap(int[] array, int index1, int index2) {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
   }

}