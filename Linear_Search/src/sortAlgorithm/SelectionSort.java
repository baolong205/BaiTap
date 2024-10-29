package sortAlgorithm;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        int n = arr.length;

        // Một cái vòng lặp cho mỗi phần tử trong mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm vị trí nhỏ nhất trong phần còn lại của mảng
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử hiện tại với phần tử nhỏ nhất
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
