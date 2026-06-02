package pekan8_2511532008;

public class MergeSort_2511532008 {
    void merge_2008(int[] arr_2008, int l_2008, int m_2008, int r_2008) {

        int n1_2008 = m_2008 - l_2008 + 1;
        int n2_2008 = r_2008 - m_2008;

        int[] L_2008 = new int[n1_2008];
        int[] R_2008 = new int[n2_2008];


        for (int i_2008 = 0; i_2008 < n1_2008; ++i_2008) {
            L_2008[i_2008] = arr_2008[l_2008 + i_2008];
        }
        for (int j_2008 = 0; j_2008 < n2_2008; ++j_2008) {
            R_2008[j_2008] = arr_2008[m_2008 + 1 + j_2008];
        }
        int i_2008 = 0, j_2008 = 0;

        int k_2008 = l_2008;
        while (i_2008 < n1_2008 && j_2008 < n2_2008) {
            if (L_2008[i_2008] <= R_2008[j_2008]) {
                arr_2008[k_2008] = L_2008[i_2008];
                i_2008++;
            } else {
                arr_2008[k_2008] = R_2008[j_2008];
                j_2008++;
            }
            k_2008++;
        }
        while (i_2008 < n1_2008) {
            arr_2008[k_2008] = L_2008[i_2008];
            i_2008++;
            k_2008++;
        }
        while (j_2008 < n2_2008) {
            arr_2008[k_2008] = R_2008[j_2008];
            j_2008++;
            k_2008++;
        }
    }
    void sort_2008(int[] arr_2008, int l_2008, int r_2008) {
        if (l_2008 < r_2008) {
            int m_2008 = (l_2008 + r_2008) / 2;

            sort_2008(arr_2008, l_2008, m_2008);
            sort_2008(arr_2008, m_2008 + 1, r_2008);

            merge_2008(arr_2008, l_2008, m_2008, r_2008);
        }
    }

    static void printArray_2008(int[] arr_2008) {
        int n_2008 = arr_2008.length;
        for (int i_2008 = 0; i_2008 < n_2008; ++i_2008) {
            System.out.print(arr_2008[i_2008] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr_2008 = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut :");
        printArray_2008(arr_2008);

        MergeSort_2511532008 ob_2008 = new MergeSort_2511532008();
        ob_2008.sort_2008(arr_2008, 0, arr_2008.length - 1);

        System.out.println("\nSesudah Terurut menggunakan Merge Sort : ");
        printArray_2008(arr_2008);
    }
}