public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 7, 11, 15, 19, 25, 30, 35, 75, 102, 124, 134, 135, 158};
        System.out.println(binarySearch(array, 0));
    }
    
    public static int binarySearch(int[] array, int value) {
      int middle = array.length / 2;
      int front = 0;
      int end = array.length;
      while (array[middle] != value) {
         if (array[middle] < value) {
            front = middle + 1;
         } else if (array[middle] > value) {
            end = middle - 1;
         }
         middle = front + ((end - front) / 2);
         if (front > end || middle >= end || middle < 0) {
            return -1;
         }
      }
      return middle;
    }
}