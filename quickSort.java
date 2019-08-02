import java.util.*;

public class quickSort {

   public static void main(String[] args) {
      int[] array = new int[]{5, 7, 8, 31, 4, 65, 7, 2, 4, 73};
      System.out.println(Arrays.toString(array));
      quickSort(array, 0, array.length);
      System.out.println(Arrays.toString(array));
   
   }

   public static void quickSort(int[] array, int start, int end) {
      if (start < end) {
         int pivot = (start + end) / 2;
         swap(array, start, pivot);
         int left = start + 1;
         int right = end - 1;
      
         while (left < right) {
         
            if (array[right] < array[start] && array[left] > array[start]) {
               swap(array, left, right);
            }
         
            if (array[left] <= array[start]) {
               left++;
            }
            if (array[right] >= array[start]) {
               right--;
            }
         
         }
         swap(array, start, left);
         quickSort(array, start, left);
         quickSort(array, left, end);
      }
   }


   private static void swap(int[] array, int index1, int index2) {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
   }

}