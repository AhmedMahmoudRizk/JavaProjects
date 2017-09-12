
public class HeapSort {
	int Heap_Size;
    Simulation sim = Simulation.get_instance();
	public void Heap_Sort(int a[]) {
		int temp;
		Build_max_heap(a);
		for (int i = a.length - 1; i >= 1; i--) {
			temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			sim.setCurr_point3(i);
			sim.setCurr_point4(0);

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(a);
			Heap_Size--;
			Max_Heapify(a, 0);
		}
	}

	public void Build_max_heap(int a[]) {
		Heap_Size = a.length;
		for (int i = Heap_Size / 2 - 1; i >= 0; i--) {
			Max_Heapify(a, i);
		}
	}

	public void Max_Heapify(int[] a, int i) {
		int Left, Right, largest = i;
		sim.setCurr_point1(i);
		sim.setCurr_point2(largest);
		Left = get_Left(i);
		Right = get_Right(i);
		if (Left < Heap_Size)
			if (a[Left] > a[i])
				largest = Left;
		if (Right < Heap_Size)
			if (a[Right] > a[largest])
				largest = Right;
		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			sim.setCurr_point1(i);
			sim.setCurr_point2(largest);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(a);
			Max_Heapify(a, largest);
		}
	}
	public int get_Left(int i) {
		return 2 * i + 1;
	}

	public int get_Right(int i) {
		return 2 * i + 2;
	}
	// public void Build_min_heap(int a[]) {
	// Heap_Size = a.length;
	// for (int i = Heap_Size / 2 - 1; i >= 0; i--) {
	// Min_Heapify(a, i);
	// }
	// }
	//
	// public void Min_Heapify(int[] a, int i) {
	// int L, R, least = i;
	// L = get_Left(i);
	// R = get_Right(i);
	// if (L < Heap_Size)
	// if (a[L] < a[i])
	// least = L;
	//
	// if (R < Heap_Size)
	// if (a[R] < a[least])
	// least = R;
	//
	// if (least != i) {
	// int temp;
	// temp = a[i];
	// a[i] = a[least];
	// a[least] = temp;
	// Min_Heapify(a, least);
	// }
	//
	// }

	

//	public static void main(String[] args) {
//		int[] arr = { 5, 7, 9, 2, 1, 7, 3, 0, -1, 6, -1, -9, 6, 6, 10000 };
//		HeapSort h = new HeapSort();
//		h.Heap_Sort(arr);
//		System.out.println("//////////// Heap Sort /////////////");
//		int i = 0;
//		while (i < arr.length) {
//			System.out.print(arr[i] + " ");
//			i++;
//		}
//	}
}
