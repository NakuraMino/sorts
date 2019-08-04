public class MinHeap {

   private int[] heap;
   private int size;

   public MinHeap(int[] array) {
      this.size = array.length;
      this.heap = new int[100];
      buildHeap(array);
   }
   
   private void buildHeap(int[] array) {
      for (int i = 0; i < array.length; i++) {
         heap[i] = array[i];
      }
      // parent is (index - 1)/ 2
      // children are index * 2 + 1 and index * 2 + 2
      for (int i = array.length - 1; i >= 0; i--) {
         //int parent = (i - 1) / 2;
         percolateUp(i);
         /*
         while (heap[parent] > heap[i]) {
            swap(parent, i);
            parent = (parent - 1) / 2;
         }
         */
      }
   }
   
   private void percolateUp(int index) {
      while (index > 0) {
         int parent = (index - 1) / 2;
         if (heap[parent] > heap[index]) {
            swap(parent, index);
            index = parent;
         } else {
            break;
         }
      }
   }
   
   private void swap(int first, int second) {
      int temp = heap[first];
      heap[first] = heap[second];
      heap[second] = temp;
   }
   
   public int remove() {
      if (size == 0) {
         return -1;  // incorrect 
      } else {
         int top = heap[0];
         swap(0, size - 1);
         size--;
         percolateDown();  
         return top;
      }
   }
   
   public int getSize() {
      return size;
   }
   
   private void percolateDown() {
      int index = 0; 
      while (index < size) {
         int leftChild = (index * 2) + 1;
         int rightChild = (index * 2) + 2;
         if (leftChild < size && rightChild < size) {
            if (heap[leftChild] < heap[rightChild]) {
               swap(index, leftChild);
               index = leftChild;
            } else {
               swap(index, rightChild);
               index = rightChild;
            }
         } else if (leftChild < size && heap[leftChild] < heap[index]) {
            swap(index, leftChild);
            index = leftChild;
         } else {
            break;
         }        
      }
   }
}