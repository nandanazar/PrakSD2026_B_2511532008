package pekan7_2511532008;

public class BubleSort_2511532008 {
    public static void bubbleSort_2008(int[] arr_2008) {
        int n_2008 = arr_2008.length;
        for (int i_2008 = 0; i_2008 < n_2008; i_2008++) {
            for (int j_2008 = 0; j_2008 < n_2008 - i_2008 - 1; j_2008++) {
                if (arr_2008[j_2008] > arr_2008[j_2008 + 1]) {
                    int temp_2008 = arr_2008[j_2008];
                    arr_2008[j_2008] = arr_2008[j_2008 + 1];
                    arr_2008[j_2008 + 1] = temp_2008;
                     System.out.println("data:"+arr_2008[j_2008]+" "+arr_2008[j_2008+1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr_2008[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_2008 = arr_2008.length;
        
        System.out.print("array yang belum terurut:");
        for (int i_2008 = 0; i_2008 < n_2008; i_2008++) {
            System.out.print(arr_2008[i_2008] + " ");
        }
        System.out.println("");
        
        bubbleSort_2008(arr_2008);
        
        System.out.print("array yang terurut menggunakan BubleSort:");
        for (int i_2008 = 0; i_2008 < n_2008; i_2008++) {
            System.out.print(arr_2008[i_2008] + " ");
        }
        System.out.println("");
    }
}
