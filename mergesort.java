Class mergeSort {


    public static void main(String[] args) {
        int[] array = new int[]{5,7, 8, 31, 4, 65, 7, 2, 4, 73};
        int[] sorted = mergeSort(array, 0, array.length - 1);

        System.out.println(array);
        System.out.println(sorted);
    }

    public static int[] mergeSort(int[] array, int start, int end) {
        if (end - start == 1) {
            return new int[]{array[start]};
        } else {
            int[] firstHalf = mergeSort(array, start, (start + end) / 2);
            int[] secondHalf = mergeSort(array, (start + end) / 2 + 1, end);
            int[] merged = new int[firstHalf.length + secondHalf.length];
            int firstIndex = 0; 
            int secondIndex = 0;
            for (int i = 0; i < firstHalf.length + secondHalf.length; i++) {
                if (firstIndex < firstHalf.length && secondIndex < secondHalf.length) {
                    if (firstHalf[firstIndex] < secondHalf[secondIndex]) {
                        merged[i] = firstHalf[firstIndex];
                        firstIndex++;
                    } else {
                        merged[i] = secondHalf[secondIndex];
                        secondIndex++;
                    }
                } else if (firstIndex == firstHalf.length) {
                    merged[i] = secondHalf[secondIndex];
                    secondIndex++;
                } else {
                    merged[i] = firstHalf[firstIndex];
                    firstIndex++;
                }
            } 
            return merged;
        }
    }

}