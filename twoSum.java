import java.util.Arrays;

public class twoSum {

    private static int[] arr = new int[] {8, 4, 7, 2, 9, 1};

    private static void quickSort(int[] arr, int l, int h){
        if(l<h){
            int pivot = partition(arr, l, h);

            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }


    }

    private static int partition(int[] arr, int l, int h){
        int i = l;
        int j = h;
        int pivot = arr[i];

        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }

            while(arr[j]>pivot){
                j--;
            }

            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, j, l);
        return j;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
