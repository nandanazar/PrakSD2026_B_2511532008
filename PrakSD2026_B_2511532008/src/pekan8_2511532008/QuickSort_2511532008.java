package pekan8_2511532008;

public class QuickSort_2511532008 {
    static void swap_2008(int[] arr_2008, int i_2008, int j_2008)
    {
        int temp_2008 = arr_2008[i_2008];
        arr_2008[i_2008] = arr_2008[j_2008];
        arr_2008[j_2008] = temp_2008;
    }
    static void medianOfThree_2008(int[] arr_2008, int low_2008, int high_2008)
    {
        int mid_2008 = low_2008 + (high_2008 - low_2008) / 2;
        if (arr_2008[low_2008] > arr_2008[mid_2008]) {
            swap_2008(arr_2008, low_2008, mid_2008);
        }
        
        if (arr_2008[low_2008] > arr_2008[high_2008]) {
            swap_2008(arr_2008, low_2008, high_2008);
        }
        if (arr_2008[mid_2008] > arr_2008[high_2008]) {
            swap_2008(arr_2008, mid_2008, high_2008);
        }
        swap_2008(arr_2008, mid_2008, high_2008);
    }
    
    static int partition_2008(int[] arr_2008, int low_2008, int high_2008)
    {
        medianOfThree_2008(arr_2008, low_2008, high_2008);
        int pivot_2008 = arr_2008[high_2008]; 
        int i_2008 = (low_2008 - 1);
        
        for (int j_2008 = low_2008; j_2008 <= high_2008 - 1; j_2008++) {
            if (arr_2008[j_2008] < pivot_2008) {
                i_2008++;
                swap_2008(arr_2008, i_2008, j_2008);
            }
        }
        swap_2008(arr_2008, i_2008 + 1, high_2008);
        return (i_2008 + 1);
        
    }
    static void quickSort_2008(int[] arr_2008, int low_2008, int high_2008)
    {
        if (low_2008 < high_2008) {
            int pi_2008 = partition_2008(arr_2008, low_2008, high_2008);
            quickSort_2008(arr_2008, low_2008, pi_2008 - 1);
            quickSort_2008(arr_2008, pi_2008 + 1, high_2008);
        }
    }
    public static void printArr_2008(int[] arr_2008)
    {
        for (int i_2008 = 0; i_2008 < arr_2008.length; i_2008++) {
            System.out.print(arr_2008[i_2008] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr_2008 = { 10, 7, 8, 9, 1, 5 };
        int N_2008 = arr_2008.length;
        System.out.print("Data sebelum diurutkan : ");
        printArr_2008(arr_2008);

        quickSort_2008(arr_2008, 0, N_2008 - 1);

        System.out.print("Data Terurut quicksort : ");
        printArr_2008(arr_2008);
    }
}






