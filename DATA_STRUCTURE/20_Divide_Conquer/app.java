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

    public static void main(String[] args) {

        // Merge Sort : -
        // ? time comp = nlogn
        // ? to impleement this merge sort we us depth first approach 
        // 
        int arr[] = new int[] { 3, 222, 7, 3, 8, 3, 6 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);

        // ! quick sort 
        

    }
}