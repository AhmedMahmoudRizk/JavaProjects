import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JPanel;

import javax.swing.Timer;
import javax.swing.Box.Filler;
import javax.swing.JScrollBar;

public class Simulation extends JPanel {
	private static Simulation sim;

	public static Simulation get_instance() {
		if (sim == null)
			sim = new Simulation();
		return sim;

	}

	private Simulation() {
		
		
		// sort = InsertionSort.get_instance();
	}

	int Curr_point1, Curr_point2, Curr_point3, Curr_point4;

	public void setCurr_point1(int curr_point1) {
		Curr_point1 = curr_point1;
		repaint();
	}

	public void setCurr_point2(int curr_point2) {
		Curr_point2 = curr_point2;
		repaint();

	}

	public void setCurr_point3(int curr_point1) {
		Curr_point3 = curr_point1;
		repaint();

	}

	public void setCurr_point4(int curr_point2) {
		Curr_point4 = curr_point2;
		repaint();

	}

	private int[] temp;
	private int[] Bounds;

	public void setArr(int n) {
		temp = new int[n];
		Bounds = new int[n];
		Random rand = new Random();
		int random;
		for (int i = 0; i < n; i++) {
			random = rand.nextInt(300);
			random += 200;
			Bounds[i] = random;
			temp[i] = random;
		}
	}

	MainClass sort = new MainClass();

	public void setBounds(int[] bounds) {
		repaint();

		Bounds = bounds;

//		System.out.println("ddsdddddddddddddddddddds");
	}

	
	public void paint(Graphics g) {
		super.paintComponent(g);
//		System.out.println("fsfsfsfs");
		if (Bounds != null)
			for (int i = 0; i < Bounds.length; i++) {
				g.setColor(Color.BLACK);
				if (i == Curr_point1 || i == Curr_point2) {
					g.setColor(Color.BLUE);
				}
				if (i == Curr_point3 || i == Curr_point4) {
					g.setColor(Color.RED);
				}
				g.fillRect(10, i+2, Bounds[i], 1);

			}

		// repaint();
	}

	public void sort(String s) {
		sort.Sort(s, Bounds);
		// repaint();
	}

	public void Clear() {
		for (int i = 0; i < Bounds.length; i++) {
			Bounds[i] = temp[i];
		}
		repaint();
	}
}
