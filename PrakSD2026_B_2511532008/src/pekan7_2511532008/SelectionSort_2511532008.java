package pekan7_2511532008;

public class SelectionSort_2511532008 {
    public static void selectionSort_2008(int[] arr_2008) {
        int n_2008 = arr_2008.length;
        for (int i_2008 = 0; i_2008 < n_2008; i_2008++) {
            int minIndex_2008 = i_2008;
            for (int j_2008 = i_2008 + 1; j_2008 < n_2008; j_2008++) {
                if (arr_2008[j_2008] < arr_2008[minIndex_2008]) {
                    minIndex_2008 = j_2008;
                }
            }
            int temp_2008 = arr_2008[i_2008];
            arr_2008[i_2008] = arr_2008[minIndex_2008];
            arr_2008[minIndex_2008] = temp_2008;
        }
    }

    public static void main(String[] args) {
        int arr_2008[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_2008 = arr_2008.length;
        
        System.out.printf("array yang belum terurut:\n");
        for (int i_2008 = 0; i_2008 < n_2008; i_2008++) {
            System.out.print(arr_2008[i_2008] + " ");
        }
        System.out.println("");
        
        selectionSort_2008(arr_2008);
        
        System.out.printf("array yang terurut:\n");
        for (int i_2008 = 0; i_2008 < n_2008; i_2008++) {
            System.out.print(arr_2008[i_2008] + " ");
        }
        System.out.println("");
    }
}
