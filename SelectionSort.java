public class SelectionSort {
    public static void selectionSort(int[] arr) {
        // Khởi tạo độ dài của mảng
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // giống như bài toán tìm min trong 1 mảng
            // khi nào cũng gán phần tử đầu tiên là phần tử
            // nhỏ nhất
            int minIndex = i;
            // Thuật toán tìm min
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            // Hoán đổi phần tử nhỏ nhất của mảng chưa sắp xếp với phần
            // tử đầu tiên của mảng chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr = {7, 5, 4, 2};
        System.out.println("Mảng chưa sắp xếp:");
        printArray(arr);
        System.out.println("Mảng đã sắp xếp:");
        selectionSort(arr);
        printArray(arr);
    }
}
