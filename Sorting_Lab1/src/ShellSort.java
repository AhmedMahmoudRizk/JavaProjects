
public class ShellSort {
	Simulation sim = Simulation.get_instance();

	public void shellSort(int[] arr) {
		int k = arr.length / 2;
		int temp = 0;
		while (k > 0) {
			for (int i = 0; i + k < arr.length; i++) {
				
				if (arr[i] > arr[i + k]) {
					temp = arr[i];
					arr[i] = arr[i + k];
					arr[i + k] = temp;
					sim.setCurr_point3(i);
					sim.setCurr_point2(i + k);
					sim.setBounds(arr);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					for (int j = i; j - k >= 0; j--) {
						if (arr[j - k] > arr[j]) {
							temp = arr[j];
							arr[j] = arr[j - k];
							arr[j - k] = temp;
							sim.setCurr_point3(j);
							sim.setCurr_point2(j - k);
							sim.setBounds(arr);
							try {
								Thread.sleep(5);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}

			k= k / 2;
		}
	}
}
