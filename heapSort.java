import java.util.*;

public class heapSort {

   public static void main(String[] args) {
      int[] array = new int[]{5, 7, 8, 31, 65, 2, 4, 73, 1};
      System.out.println(Arrays.toString(array));
      int[] sorted = heapSort(array);
      System.out.println(Arrays.toString(sorted));
   }

   public static int[] heapSort(int[] array) {
      MinHeap heap = new MinHeap(array);
      int[] ans = new int[array.length];
      for (int i = 0; i < array.length; i++) {
         ans[i] = heap.remove();
      }
      return ans;
   }
}