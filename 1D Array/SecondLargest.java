package Assignment;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 34, 21, 54, 65, 43 };
        int arr_size = arr.length;
        int i, second;

        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
        int largest = second = Integer.MIN_VALUE;

        for (i = 0; i < arr_size; i++)
            largest = Math.max(largest, arr[i]);

        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " + "largest element\n");
        else
            System.out.printf("%d\n", second);
    }

}
