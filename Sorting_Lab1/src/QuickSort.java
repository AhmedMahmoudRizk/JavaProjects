
public class QuickSort {

	public void quickSort(int[] arr, int l, int r) {
	    Simulation sim = Simulation.get_instance();

		int pivot = l;
		int current = r;
		int temp;

		while (pivot != current) {
			sim.setCurr_point3(pivot);
			sim.setCurr_point4(current);

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(arr);
			if (pivot < current && arr[pivot] < arr[current]) {
				current--;
			} else if (pivot > current && arr[pivot] > arr[current]) {
				current++;
			} else {
				temp = arr[pivot];
				arr[pivot] = arr[current];
				arr[current] = temp;
				if (pivot < current )
					pivot++;
				else
					pivot--;
				temp = pivot;
				pivot = current;
				current = temp;

			}
		}
		if (l < current - 1)
			quickSort(arr, l, current - 1);

		if (current + 1 < r)
			quickSort(arr, current + 1, r);

	}

}
