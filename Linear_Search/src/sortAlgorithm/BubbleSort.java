package sortAlgorithm;

public class BubbleSort {
    // Hàm sắp xếp tăng dần
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1); // Hoán đổi hai phần tử
                }
            }
        }
    }   
    
    // Hàm hoán đổi hai phần tử
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b]; // Chỉnh sửa hoán đổi
        arr[b] = temp;
    }

    // Hàm sắp xếp giảm dần
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1); // Hoán đổi hai phần tử
                }
            }
        }
    }
}
