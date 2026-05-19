package pekan7_2511532008;

public class InsertionSort_2511532008 {
	public static void insertionSort_2008 (int [] arr_2008) {
		int n = arr_2008.length;
		for (int i =1; i< n; i++) {
			int key_2008 = arr_2008[i]; 
			int j = i - 1;
			while (j >= 0 && arr_2008[j] > key_2008) {
				arr_2008 [j + 1] = arr_2008[j];
				j--;
			}
			arr_2008[j + 1] = key_2008;
		}			
	}
	
	public static void main (String []args) {
		
		int arr_2008[] =  {23 , 78,45,8,32,56,1};
		int n = arr_2008.length;
		
		System.out.printf("Array yg belum terurut : \n");
		for (int i = 0; i < n; i++)
			System.out.print(arr_2008[i] +" ");
			System.out.println("");
			insertionSort_2008(arr_2008);
		System.out.printf("Array yg belum terurut : \n");
		for (int i = 0; i <n; i++) 
			System.out.print(arr_2008[i]+" ");
			System.out.println("");	
	}
}
