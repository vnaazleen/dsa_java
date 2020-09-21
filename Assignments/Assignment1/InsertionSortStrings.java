/*
2) Sort the following list of names using Insertion sort: Varun, Amar, Karthik, Ramesh, Bhuvan, Dinesh, Firoz, and Ganesh.
*/

class InsertionSortStrings {
    public static void insertionSort(String[] names) {
        int size = names.length;
        for (int i = 1; i < size; i++) {
            int index = 0;
            String name = names[i];

            for (int j = i - 1; j > -1; j--) {
                if (name.compareTo(names[j]) <= 0) {
                    index = j;
                }
            }

            for (int j = i; j > index; j--) {
                names[j] = names[j - 1];
            }
            names[index] = name;


            for (String nme : names) {
            System.out.print(nme + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] names = {"Varun", "Amar", "Karthik", "Ramesh", "Dinesh", "Firoz", "Ganesh"};

        insertionSort(names);

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}


/*
Amar Varun Karthik Ramesh Dinesh Firoz Ganesh 
Amar Karthik Varun Ramesh Dinesh Firoz Ganesh 
Amar Karthik Ramesh Varun Dinesh Firoz Ganesh 
Amar Dinesh Karthik Ramesh Varun Firoz Ganesh 
Amar Dinesh Firoz Karthik Ramesh Varun Ganesh 
Amar Dinesh Firoz Ganesh Karthik Ramesh Varun 

Amar Dinesh Firoz Ganesh Karthik Ramesh Varun
*/
