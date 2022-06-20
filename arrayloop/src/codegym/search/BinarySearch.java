package codegym.search;

public class BinarySearch {
    public static int searchBinary(int[] array, int value) {
        int begin = 0;
        int end = array.length-1;
        int middle;
        while (end >= begin) {
            middle = (end + begin) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 10, 12, 14, 16};
        System.out.println(searchBinary(arr, 20));
    }
}
