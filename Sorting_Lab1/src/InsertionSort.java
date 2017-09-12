
public class InsertionSort extends Thread {
	private static InsertionSort ins;
	private Simulation sim = Simulation.get_instance();

	public static InsertionSort get_instance() {
		if (ins == null)
			ins = new InsertionSort();
		return ins;

	}

	public InsertionSort() {

	}

	public void insertionSort(int[] arr) {

		int temp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {

				arr[j + 1] = arr[j];

			}
			arr[j + 1] = temp;
			sim.setCurr_point3(j+1);
			sim.setCurr_point4(i);

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sim.setBounds(arr);
			// Sort.Notify(arr);

		}
	}
}
