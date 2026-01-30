public class BinarySearchExample {

    
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == key) {
                return mid;
            }

            
            if (arr[mid] < key) {
                left = mid + 1;
            }
            
            else {
                right = mid - 1;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {

        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int key = 40;

        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int result = binarySearch(numbers, key);

        if (result == -1) {
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement found at index: " + result);
        }
    }
}
