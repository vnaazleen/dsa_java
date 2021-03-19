import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort (int[] a) {
        int temp, j, n = a.length;
        // Loop through the array
        for (int i = 1; i < n; ++i) {
            temp = a[i];
            for (j = i - 1; j >= 0; --j) {
                if (a[j] > temp) {
                    a[j+1] = a[j];
                }
                else{
                    break;
                }
            }
            if(i!=j-1){
                a[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter the size of the array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }

        // Apply the insertion sort algo
        insertionSort(arr);

        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
