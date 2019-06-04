public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] intarray = new int[]{4, 3, 2, 1};

        for (int i : intarray
        ) {
            System.out.print(i + " ");
        }
        printSelectionSort(intarray);


        int[] unsortedforBubbleSort = new int[]{4, 1, 2, 1};
        printBubbleSort(unsortedforBubbleSort);
    }

    private static void printSelectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }

            }

            int tempVar = array[i];
            array[i] = array[minPosition];
            array[minPosition] = tempVar;
        }

        System.out.println();
        for (int i : array
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printBubbleSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < n - i; j++) {
                if (array[j] > array[j + 1]) {
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }

                }
            }
        }
        System.out.println();
        for (int i : array
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void printInsertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n ; i++) {
            int hole = i;
            int value = array[i];
            while(hole>0 && array[hole-1] >  value){
                array[hole] = array[hole - 1];
                hole--;
            }
            array[hole] = value;

        }
        System.out.println();
        for (int i : array
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
