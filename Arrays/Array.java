package mid1;

class Array {
    private int size;
    private int numItems = 0;
    public int[] arr;
    
    public Array (int n) {
        size = n;
        arr = new int[n];
    }
    
    private void doubleSize() {
    	int[] temp = new int[size];
        for (int i = 0; i < size; ++i)
            temp[i] = arr[i];
        size += size;
        arr = new int[size];
        for (int i = 0; i < numItems; ++i)
            arr[i] = temp[i];
    }
    // insert an item at end
    public void insert (int number) {
        if (size == numItems) {
            doubleSize();
        } 
        arr[numItems++] = number;
    }
    // insert an item at particular index (Overloaded)
    public void insert (int number, int index) {
    	if (size == numItems) {
            doubleSize();
        } 
        for (int i = numItems; i >= index; --i) {
        	arr[i] = arr[i - 1];
        }
        arr[index] = number;
        numItems++;
    }

    // Remove an element at index
    public void removeAt (int index) {
        if (index >= numItems) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < numItems - 1; ++i) {
                arr[i] = arr[i + 1];
            }
            arr[--numItems] = 0;
        }
    }
    
    public int min() {
    	int mi = Integer.MAX_VALUE;
    	for (int i = 0; i < numItems; ++i) {
    		if (mi > arr[i]) {
    			mi = arr[i];
    		}
    	}
    	return mi;
    }
    
    public int max() {
    	int mx = Integer.MIN_VALUE;
    	for (int i = 0; i < numItems; ++i) {
    		if (mx < arr[i]) {
    			mx = arr[i];
    		}
    	}
    	return mx;
    }
  
    public void print () {
        System.out.print("Array: ");
        for (int i = 0; i < numItems; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
    	Array a = new Array(5);
        a.insert(10);   // Array: 10 
        a.print();
        a.insert(20);   // Array: 10 20 
        a.print();
        a.insert(30);   // Array: 10 20 30 
        a.print();
        a.insert(40);   // Array: 10 20 30 40
        a.print();
        a.insert(50);   // Array: 10 20 30 40 50
        a.print();
        a.insert(60);   // Array: 10 20 30 40 50 60
        a.print();
        a.removeAt(5);  // Array: 10 20 30 40 50
        a.print();
        a.removeAt(2);  // Array: 10 20 40 50
        a.print();
        //a.removeAt(7); // Throws exception
        a.insert(30, 2);   // Array: 10 20 30 40 50
        a.print();
        System.out.println("Minimum value in Array: " + a.min());   // 10
        System.out.println("Maximum value in Array: " + a.max());   // 20
    }
}
