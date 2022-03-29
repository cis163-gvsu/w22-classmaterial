import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr) {
        quicksortHelper(arr, 0, arr.length-1);
    }

    public static void quicksortHelper(int[] arr, int l, int r) {
        System.out.println("on l=" + l + ", r=" +r);
        if (r == l || l > r) {
            return;
        }
        else {
            int pivotVal = arr[l];
            int lArrow = l+1;
            int rArrow = r;
            while (lArrow < rArrow) {
                while (arr[lArrow] < pivotVal && lArrow < rArrow) {
                    lArrow++;
                }
                while (arr[rArrow] > pivotVal && rArrow >= lArrow && rArrow > 0) {
                    rArrow--;
                }
                if (rArrow <= lArrow) {
                    break;
                }
                int temp = arr[lArrow];
                arr[lArrow] = arr[rArrow];
                arr[rArrow] = temp;
            }
            arr[l] = arr[rArrow];
            arr[rArrow] = pivotVal;
            System.out.println("calling left side");
            quicksortHelper(arr, l, rArrow-1);
            System.out.println("calling right side, l parent was " + l + ", r parent was " + r);
            quicksortHelper(arr, rArrow+1, r);
        }
    }
    public static void main(String[] args) throws Exception {
        int[] vals = {15,4,1,12,26,8,5,29,45,2};
        quicksort(vals);
        System.out.println(Arrays.toString(vals));
    }
}
