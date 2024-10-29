import java.util.Scanner;

import searchAlgorithm.BinarySearch;
import searchAlgorithm.LinearSearch;
import sortAlgorithm.BubbleSort;
import sortAlgorithm.InsertionSort;
import sortAlgorithm.SelectionSort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int arrayLength = scanner.nextInt();
        // Khởi tạo mảng
        int[] arrayInput = new int[arrayLength];

        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            arrayInput[i] = scanner.nextInt();
        }
        
        System.out.print("Nhập giá trị cần tìm: ");
        int key = scanner.nextInt();
        callMeForLinearSearch(arrayInput, key); // Gọi tìm kiếm tuyến tính
        callMeForBubbleSort(arrayInput); // Gọi phương thức sắp xếp nổi bọt
        
        // Gọi phương thức sắp xếp chèn và chọn nếu cần
        callMeForSelectionSort(arrayInput);
        callMeInsertionSort(arrayInput);

        scanner.close();
    }

    static void callMeForBinarySearch(int[] arrayInput, int key) {
        System.out.print(BinarySearch.binarySearch(arrayInput, key));
    }

    static void callMeForLinearSearch(int[] arrayInput, int key) {
        int index = LinearSearch.linearSearch(arrayInput, key); // Gọi phương thức tĩnh
        if (index != -1) {
            System.out.println("Vị trí của phần tử cần tìm là: " + index);
        } else {
            System.out.println("Phần tử không có trong mảng.");
        }
    }

    static void callMeForBubbleSort(int[] arrayInput) {
        System.out.println("Mảng trước khi sắp xếp bằng BubbleSort: ");
        printArray(arrayInput);
        
        BubbleSort.bubbleSortAscending(arrayInput); // Sắp xếp từ bé đến lớn
        System.out.println("Mảng sau khi sắp xếp từ bé đến lớn (BubbleSort): ");
        printArray(arrayInput);
        
        BubbleSort.bubbleSortDescending(arrayInput); // Sắp xếp từ lớn đến bé
        System.out.println("Mảng sau khi sắp xếp từ lớn đến bé (BubbleSort): ");
        printArray(arrayInput);
    }

    static void callMeForSelectionSort(int[] arrayInput) {
        SelectionSort selectionSortInstance = new SelectionSort();
        System.out.println("Mảng trước khi sắp xếp bằng Selection Sort: ");
        printArray(arrayInput);
        
        selectionSortInstance.selectionSort(arrayInput); // Sắp xếp
        System.out.println("Mảng sau khi sắp xếp bằng Selection Sort: ");
        printArray(arrayInput);
    }

    static void callMeInsertionSort(int[] arrayInput) {
        InsertionSort insertionSortInstance = new InsertionSort();
        System.out.println("Mảng trước khi sắp xếp bằng Insertion Sort: ");
        printArray(arrayInput);
        
        insertionSortInstance.insertionSort(arrayInput); // Sắp xếp
        System.out.println("Mảng sau khi sắp xếp từ bé đến lớn (InsertionSort): ");
        printArray(arrayInput);
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
