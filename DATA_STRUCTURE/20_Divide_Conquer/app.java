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

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1; // the target element do not exist in the array
        }
        int mid = si + (ei - si) / 2;
        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        /// on l1 
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        /// on l2 
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        // Merge Sort : -
        // ? time comp = nlogn
        // ? to impleement this merge sort we us depth first approach
        //
        // int arr[] = new int[] { 3, 222, 7, 3, 8, 3, 6 };
        // mergeSort(arr, 0, arr.length - 1);
        // printArray(arr);

        // ! quick sort
        // uses pivot & partition
        // quickSort(arr, 0, arr.length - 1);
        // printArray(arr);
        // * qucik sort wrost cases - condition
        // wrost case occurs when pivot is always the smaallest or the largest element
        // o(n^2)

        // Search in Rotated Sorted Array - medium level
        // input : sorted, rotated array with distinct numbers (in ascending order)
        // It is rotated at a pivot point. Find the index of given element.
        // 4 5 6 7 0 1 2 target:

        // ? modified binary sarch - o(nlogn)
        // * agar sorted aur rotated array hai to hamesa do line banti hai
        int arr23[] = { 4,5,6,7,0,1,2};
        int tar = 2;
        int tarIdx = search(arr23, tar, 0, arr23.length -1 );
        System.out.println(tarIdx);
    }
}