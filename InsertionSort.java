public class InsertionSort {
    public static void insertionSort(int[] arr) {
        //Độ dài của mảng
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            //Khởi tạo phần tử đầu tiên của mảng chưa sắp xếp
            int key = arr[i];
            //Khởi tạo phần tử cuối cùng của mảng đã sắp xếp
            int j = i - 1;

            while(j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                //duy trì bước nhảy tránh lặp vô hạn
                j--;
            }
            
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 10, 5, 8, 4, 7};
        System.out.println("Mảng chưa sắp xếp:");
        printArray(arr);
        System.out.println("Mảng sau khi đã sắp xếp:");
        insertionSort(arr);
        printArray(arr);
    }
    
}