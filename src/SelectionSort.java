
public class SelectionSort {
	public static void Selection(int[] a) {
		int temp; //temporary values are required
		for (int i = 0; i < a.length; i++) { // loop
			for (int c = 0; c < a.length - 1; c++) { //nested loop for comparison
				if (a[i] < a[c]) {
					//pls halp
					temp = a[i];
					a[i] = a[c];
					a[c] = temp;
				}
				System.out.print(a[c] + " ");
			}
			System.out.println("");
		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	public static void Insertion(int[] a){
		int[] temp = new int[a.length];
		for(int i = 0; i < temp.length; i++){
			
		}
	}
}
