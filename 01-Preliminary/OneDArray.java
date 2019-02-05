public class OneDArray {

    public static void main(String[] args) {
        arrayExample();
    }

    public static void arrayExample() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        printArray(arr, 10);
    }

    public static void printArray(int arr[], int count) {
        System.out.println("Values stored in array are : ");
        for (int i = 0; i < count; i++) {
            System.out.println(" " + arr[i]);
        }
    }
}
