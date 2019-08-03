import java.util.*;

public class quickSort {

   public static void main(String[] args) {
      int[] array = new int[]{5, 7, 8, 31, 10};
      System.out.println(Arrays.toString(array));
      quickSort(array, 0, array.length - 1);
      System.out.println(Arrays.toString(array));
   
   }

   public static void quickSort(int[] array, int start, int end) {
      if (end - start >= 1) {
         int left = start; 
         int right = end - 1;
         int pivot = array[end];
         
         while (left <= right) {
            
            if (array[left] <= pivot) {
               left++;
            }
            
            if (array[right] >= pivot) {
               right--;
            }
            
            if (array[left] > pivot && array[right] < pivot) {
               swap(array, left, right);
               left++;
               right--;
            }
         }
         swap(array, left, end);
         quickSort(array, start, left - 1);
         quickSort(array, left + 1, end);
      }
   }


   private static void swap(int[] array, int index1, int index2) {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
   }

}