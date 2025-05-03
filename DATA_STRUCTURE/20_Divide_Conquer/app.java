public class app {

    public static void printArray(int arr[]) {
        for (int elem : arr) {
            System.out.print(elem + " , ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // we can use (si+ ei)//2 also here no issue
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for 1st sorted part
        int j = mid + 1;// idx for 2st sorted part
        int k = 0; // idx for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        ///copy the temp to the original array 
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];

        int i = si - 1; // to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {

        // Merge Sort : -
        // ? time comp = nlogn
        // ? to impleement this merge sort we us depth first approach
        //
        int arr[] = new int[] { 3, 222, 7, 3, 8, 3, 6 };
        // mergeSort(arr, 0, arr.length - 1);
        // printArray(arr);

        // ! quick sort
        // uses pivot & partition
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}