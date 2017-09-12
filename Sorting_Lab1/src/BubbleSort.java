

public class BubbleSort {
	Simulation sim = Simulation.get_instance();

	public void bubbleSort(int[] arr) {
		int temp = 0;
		int p = arr.length - 1;
		int upper = 0;
		boolean isSorted = false;
		for (int i = arr.length - 1; i > -1 && !isSorted; i--) {
			p = arr.length - 1;
			isSorted = true;
			for (int j = p - 1; j > -1; j--) {
				if (arr[j] > arr[p]) {
					isSorted = false;
					temp = arr[p];
					arr[p] = arr[j];
					arr[j] = temp;
				}
				sim.setCurr_point1(p);
				sim.setCurr_point4(j);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sim.setBounds(arr);
				p--;
			}
		}
	}
}
