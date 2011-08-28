
public class QuickSort {

    static int count = 0;

    public static void main(String[] args) {

        QuickSort obj = new QuickSort();

        Comparable[] array = {"cat", "zebra", "dog", "aardvark", "giraffe",
            "fish", "whale", "elephant", "hippopotamus",
            "lion", "monkey", "tiger"};

        System.out.println("Initial list:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int c = obj.quickSort(array);

        System.out.println();
        System.out.println("Sorted list:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }//main

    public int quickSort(Comparable[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int quickSort(Comparable[] arr, int start, int end) {
        if (start < end) {
            int q = partition(arr, start, end);
            quickSort(arr, start, q - 1);
            quickSort(arr, q + 1, end);

        }
        return count;

    } //quickSort

    private int partition(Comparable[] array, int begin, int last) {
        Comparable pivot = array[last];

        int i = begin - 1;

        for (int j = begin; j <= last - 1; j++) {
            count++;
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        Comparable temp_2 = array[i + 1];
        array[i + 1] = array[last];
        array[last] = temp_2;

        return i + 1;

    }//partition
}

/********************************OUTPUT****************************************
 *  run:
    Initial list:
    cat
    zebra
    dog
    aardvark
    giraffe
    fish
    whale
    elephant
    hippopotamus
    lion
    monkey
    tiger

    Sorted list:
    aardvark
    cat
    dog
    elephant
    fish
    giraffe
    hippopotamus
    lion
    monkey
    tiger
    whale
    zebra
    BUILD SUCCESSFUL (total time: 0 seconds)

 */