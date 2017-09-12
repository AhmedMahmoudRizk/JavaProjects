
public class SelectionSort {
    Simulation sim = Simulation.get_instance();

	public void selectionSort(int[] arr) {
		int min = arr[0];
		int minIndex = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			sim.setCurr_point1(minIndex);
			sim.setCurr_point4(i);

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
