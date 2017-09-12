import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class Container extends JFrame {
	static Simulation Sim = Simulation.get_instance();
	// private static int[] Bounds = { 400, 470, 420, 570, 520, 670, 620, 770,
	// 720, 270, 220, 370, 320, 870, 820, 170, 120,
	// 70, 20, 330 };
	static String sort_name = "Heap";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Enter the array number : ");
		int num = Integer.valueOf(n);
//		System.out.println(num);
		Sim.setArr(num);
		// Sim.setBounds(Bounds);
		String sort = null;
		new Container();
		sort = JOptionPane.showInputDialog(
				"Enter the Sort : (Bubble , Heap , Shell , Merge, Insertion ," + "Selection or Quick )");

		while (sort != null && !sort.equals("end")) {

			Sim.sort(sort);
			// Sim.setBounds(Bounds);
			sort = JOptionPane.showInputDialog(
					"Enter the Sort : (Bubble , Heap , Shell , Merge, Insertion ," + "Selection or Quick )");
			Sim.Clear();
		}
		// Sim.setBounds(Bounds);
		System.exit(0);

	}

	/**
	 * Create the frame.
	 */
	private JPanel BPanel = new JPanel();
	private JFrame window = new JFrame();

	public Container() {
		Build_Gui();
	}

	void Build_Gui() {

		JMenuBar menuBar = new JMenuBar();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		window.getContentPane().add(BPanel);
		BPanel.setBounds(0, 0, 95, 681);
		BPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GRAY, Color.GRAY, new Color(0, 0, 0)));

		BPanel.setBackground(Color.LIGHT_GRAY);
		BPanel.setLayout(null);

		JButton btnNewButton = new JButton("Heap");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Sim.sort("Heap");

			}
		});
		btnNewButton.setBounds(10, 11, 75, 54);
		BPanel.add(btnNewButton);

		JButton btnInsertion = new JButton("Insertion");
		btnInsertion.setVerticalAlignment(SwingConstants.BOTTOM);
		btnInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Sim.setBounds(Bounds);

				Sim.sort("Insertion");
			}
		});
		btnInsertion.setBounds(10, 76, 75, 54);
		BPanel.add(btnInsertion);

		JButton btnMerge = new JButton("Merge");
		btnMerge.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMerge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sim.sort("Merge");
			}
		});
		btnMerge.setBounds(10, 141, 75, 54);
		BPanel.add(btnMerge);

		JButton btnQuick = new JButton("Quick");
		btnQuick.setVerticalAlignment(SwingConstants.BOTTOM);
		btnQuick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sim.sort("Quick");
			}
		});
		btnQuick.setBounds(10, 206, 75, 54);
		BPanel.add(btnQuick);

		JButton btnSelection = new JButton("Selection");
		btnSelection.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sim.sort("Selection");
			}
		});
		btnSelection.setBounds(10, 271, 75, 54);
		BPanel.add(btnSelection);

		JButton btnShell = new JButton("Shell");
		btnShell.setVerticalAlignment(SwingConstants.BOTTOM);
		btnShell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sim.sort("Shell");
			}
		});
		btnShell.setBounds(10, 336, 75, 54);
		BPanel.add(btnShell);

		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		file.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(file);
		JMenuItem clear = new JMenuItem("New");
		clear.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		clear.setHorizontalAlignment(SwingConstants.LEFT);
		clear.setIcon(new ImageIcon("D:\\workshop\\oop\\newb.png"));
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Sim.setBounds(Bounds);
				// this.Clearing();

			}
		});
		file.add(clear);
		JMenuItem exit = new JMenuItem("Exit");
		exit.setIcon(new ImageIcon("D:\\workshop\\oop\\exit.png"));
		exit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		file.add(exit);
		Sim.setBackground(Color.WHITE);
		JScrollPane scroll = new JScrollPane(Sim);
//		scroll.setPreferredSize(new Dimension(100,100)); 

		scroll.setBounds(106, 10, 1234, 660);
	    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    Sim.setMinimumSize(new Dimension(100, 100));
	    Sim.setPreferredSize(new Dimension(100, 100));

		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		 scroll.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		// window.getContentPane().add(scroll);
		
		window.setJMenuBar(menuBar);
		window.setVisible(true);
		window.setSize(1366, 740);
		window.getContentPane().add(scroll);
	

//		Sim.setBorder(new TitledBorder(null, "Drawing Area", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	}
}
