
public class MergeSort {
	Simulation sim = Simulation.get_instance();

	private int[] t;

	public MergeSort() {
	}

	public void mergeSort(int[] arr, int l, int r) {
		t = new int[arr.length];
		int mid = (l + r) / 2;
		if (l < r) {
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, r, mid);
		}
		
	}

	private void merge(int[] arr, int l, int r, int mid) {
		for (int i = l; i <= r; i++)
			t[i] = arr[i];

		int i = l;
		int j = mid + 1;
		int c = i;
		while (i <= mid && j <= r) {
			if (t[i] < t[j]) {
				arr[c] = t[i];
				i++;
				c++;
			} else {
				arr[c] = t[j];
				j++;
				c++;
			}
			sim.setCurr_point4(i);
			sim.setCurr_point1(j);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(arr);

		}

		while (i <= mid) {
			arr[c] = t[i];
			i++;
			c++;
			sim.setCurr_point3(c);
//			sim.setCurr_point4(mid);
//			sim.setCurr_point1(r);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(arr);
		}
		while (j <= r) {
			arr[c] = t[j];
			j++;
			c++;
			sim.setCurr_point3(c);
//			sim.setCurr_point4(mid);
//			sim.setCurr_point1(r);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(arr);
		}

	}

}
