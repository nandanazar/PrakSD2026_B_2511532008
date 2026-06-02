package pekan8_2511532008;

public class ShellSort_2511532008 {

    public static void shellSort_2008(int[] A_2008) {
        int n_2008 = A_2008.length;
        int gap_2008 = n_2008 / 2;
        while (gap_2008 > 0) {
            for (int i_2008 = gap_2008; i_2008 < n_2008; i_2008++) {
                int temp_2008 = A_2008[i_2008];
                int j_2008 = i_2008;
                while (j_2008 >= gap_2008 && A_2008[j_2008 - gap_2008] > temp_2008) {
                    A_2008[j_2008] = A_2008[j_2008 - gap_2008];
                    j_2008 = j_2008 - gap_2008;
                }
                A_2008[j_2008] = temp_2008;
            }
            gap_2008 = gap_2008 / 2;
        }
    }
    public static void main(String[] args) {
        int[] data_2008 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        System.out.print("Sebelum: ");
        printArray_2008(data_2008);

        shellSort_2008(data_2008);

        
        System.out.print("Sesudah (Shell Sort) : ");
        printArray_2008(data_2008);
    }

    public static void printArray_2008(int[] arr_2008) {
        for (int i_2008 : arr_2008) System.out.print(i_2008 + " ");
        System.out.println();
     
     }
}