
public class MainClass {
	SelectionSort testS ;
	public InsertionSort testI;
	MergeSort test ;
	QuickSort testQ ;
    HeapSort testH;
    ShellSort testSH;
    BubbleSort testB;
//	public static void main(String[] args) {
//		int[] arr = { 5, 7, 9, 2, 1, 7, 3, 0, -1, 6, -1, -9, 6, 6, 10000 };
//
//		System.out.println("//////////// Selection Sort /////////////");
//		int[] arr2 = { 5, 7, 9, 2, 1, 7, 3, 0, -1, 6, -1, -9, 6, 6, 10000 };
//		testS.selectionSort(arr2);
//		int i = 0;
//		while (i < arr2.length) {
//			System.out.print(arr2[i] + " ");
//			i++;
//		}
//
//		System.out.println("\n\n//////////// Insertion Sort /////////////");
//		int[] ar = { 5, 7, 9, 2, 1, 7, 3, 0, -1, 6, -1, -9, 6, 6, 10000 };
//		testI.insertionSort(ar);
//		i = 0;
//		while (i < ar.length) {
//			System.out.print(ar[i] + " ");
//			i++;
//		}
//
//		System.out.println("\n\n////////////  Merge  Sort /////////////");
//		test.mergeSort(arr, 0, arr.length - 1);
//		i = 0;
//		while (i < arr.length) {
//			System.out.print(arr[i] + " ");
//			i++;
//		}
//
//		System.out.println("\n\n//////////// Quick Sort /////////////");
//		int[] arr3 = { 5, 7, 9, 2, 1, 7, 3, 0, -1, 6, -1, -9, 6, 6, 10000 };
//		testQ.quickSort(arr3, 0, arr3.length - 1);
//		i = 0;
//		while (i < arr3.length) {
//			System.out.print(arr3[i] + " ");
//			i++;
//		}
//	}
	public void Sort (String name , int[] unsorted){
		if (name.equals("Merge")){
			test = new MergeSort();
			test.mergeSort(unsorted, 0, unsorted.length - 1);

		}
		else if (name.equals("Quick")){
			testQ = new QuickSort();
			testQ.quickSort(unsorted, 0, unsorted.length - 1);

		}
		else if (name.equals("Selection")){
			testS = new SelectionSort();
			testS.selectionSort(unsorted);

		}
		else if (name.equals("Insertion")){
			testI = new InsertionSort();
			testI.insertionSort(unsorted);

		}
		else if (name.equals("Heap")){
			testH = new HeapSort();
			testH.Heap_Sort(unsorted);

		}
		else if (name.equals("Shell")){
			testSH = new ShellSort();
			testSH.shellSort(unsorted);

		}else if (name.equals("Bubble")){
			testB = new BubbleSort();
			testB.bubbleSort(unsorted);

		}

	}
	

}
