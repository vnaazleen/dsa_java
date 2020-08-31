import java.util.Scanner;

class Arrays 
{
  public static void main(String[] args) 
  {
    int a[];   // only a array reference
    int n;
    int min, max;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    n = sc.nextInt();

    a = new int[n];
    
    // Take array input
    System.out.println("Enter values into array:");
    for (int i = 0; i < n; ++i) 
    {
        System.out.printf("Enter %d index elem:", i);
        a[i] = sc.nextInt();
    }

    // Print array
    System.out.print("Array: ");
    for (int i = 0; i < n; ++i) 
    {
        System.out.print(a[i] + " ");
        
    }
    System.out.println();
    
    // Find min and max of array
    min = max = a[0];
    for (int i = 0; i < n; ++i) 
    {
        if (min > a[i])
        {
            min = a[i];
        }
        if (max < a[i])
        {
            max = a[i];
        }
        
    }
    System.out.printf("The minimum element in the array is %d\n", min);
    System.out.printf("The maximum element in the array is %d\n", max);

    // Insert in an array
    System.out.println("Enter the new element to insert & index: ");
    int elem = sc.nextInt();
    int pos = sc.nextInt();

    // Add extra space to fit new element in array
    int[] b = new int[n + 1];
    
    // Copy all the elements of a to b
    for (int i = 0; i < n; ++i)
    {
        b[i] = a[i];
    }

    for (int i = n - 1; i >= pos; --i)
    {
        System.out.println(b[i]);
        b[i + 1] = b[i];
    }
    b[pos] = elem;

    // Print array after insertion
    System.out.println("Array: ");
    for (int i = 0; i < n + 1; ++i) 
    {
        System.out.print(b[i] + " ");
        
    }
    System.out.println();
    n = n + 1;

    // Delete element at specific position in array
    System.out.println("Enter the index of element to delete: ");
    pos = sc.nextInt();

    for (int i = pos; i < n - 1; ++i)
    {
        b[i] = b[i + 1];
    }
    b[n - 1] = 0;

    // Print array after deletion
    System.out.println("Array: ");
    for (int i = 0; i < n; ++i) 
    {
        System.out.print(b[i] + " ");
        
    }
    System.out.println();

    // Searching for an element in an array
    boolean notFound = true;
    System.out.print("Enter an element to search: ");
    int key = sc.nextInt();
    for (int i = 0; i < n - 1; ++i)
    {
        if (b[i] == key)
        {
            System.out.printf("Found at location %d", i + 1);
            notFound = false;
        }
    }
    if (!notFound)
    {
        System.out.println("Element not found :(");
    }

  }
  
}