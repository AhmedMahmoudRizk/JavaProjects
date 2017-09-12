package eg.edu.alexu.csd.oop.calculator.cs18;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gui_work_space {

	public JFrame frame;
	public JTextField s;
	public JLabel answer;
	public JButton equal;
	public the_hard_work Ob = new the_hard_work();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_work_space window = new gui_work_space();
					window.frame.setVisible(true);
				} catch (Exception e) {
					throw new RuntimeException();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui_work_space() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 337, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		s = new JTextField();
		s.setBounds(10, 0, 310, 43);
		frame.getContentPane().add(s);
		s.setColumns(10);

		equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1, s2;
				s1 = s.getText();
				Ob.input(s1);
				s2 = Ob.getResult();
				try {
					answer.setText(s2);
				} catch (Exception e) {

				}
			}
		});
		equal.setBounds(167, 302, 72, 43);
		frame.getContentPane().add(equal);

		answer = new JLabel("");
		answer.setBounds(82, 54, 84, 23);
		frame.getContentPane().add(answer);

		JLabel lblTheAnswer = new JLabel("the answer");
		lblTheAnswer.setBounds(20, 54, 135, 23);
		frame.getContentPane().add(lblTheAnswer);

		JButton prev = new JButton("<--");
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s2 = Ob.prev();
				try {
					s.setText(s2);
				} catch (Exception e) {

				}
			}
		});
		prev.setBounds(1, 88, 72, 43);
		frame.getContentPane().add(prev);

		JButton next = new JButton("-->");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s2 = Ob.next();
				try {
					s.setText(s2);
				} catch (Exception e) {

				}
			}
		});
		next.setBounds(82, 88, 73, 43);
		frame.getContentPane().add(next);

		JButton save = new JButton("save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ob.save();
			}
		});
		save.setBounds(167, 88, 72, 43);
		frame.getContentPane().add(save);

		JButton load = new JButton("load");
		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ob.load();
			}
		});
		load.setBounds(248, 88, 72, 43);
		frame.getContentPane().add(load);

		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.setText(s.getText() + "7");
			}
		});
		btnNewButton.setBounds(1, 142, 71, 46);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "8");
			}
		});
		btnNewButton_1.setBounds(82, 142, 73, 46);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "9");
			}
		});
		btnNewButton_2.setBounds(167, 142, 72, 46);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "/");
			}
		});
		btnNewButton_3.setBounds(248, 142, 72, 46);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "4");
			}
		});
		btnNewButton_4.setBounds(0, 199, 72, 44);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "5");
			}
		});
		btnNewButton_5.setBounds(82, 199, 73, 44);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "6");
			}
		});
		btnNewButton_6.setBounds(167, 199, 72, 44);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "*");
			}
		});
		btnNewButton_7.setBounds(248, 199, 72, 44);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "1");
			}
		});
		btnNewButton_8.setBounds(0, 254, 72, 37);
		frame.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "2");
			}
		});
		btnNewButton_9.setBounds(82, 254, 73, 37);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "3");
			}
		});
		btnNewButton_10.setBounds(167, 254, 72, 37);
		frame.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "-");
			}
		});
		btnNewButton_11.setBounds(248, 254, 72, 37);
		frame.getContentPane().add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "+");
			}
		});
		btnNewButton_12.setBounds(249, 302, 71, 43);
		frame.getContentPane().add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + ".");
			}
		});
		btnNewButton_13.setBounds(82, 302, 75, 43);
		frame.getContentPane().add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText(s.getText() + "0");
			}
		});
		btnNewButton_14.setBounds(0, 302, 69, 43);
		frame.getContentPane().add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("C");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setText("");
			}
		});
		btnNewButton_15.setBounds(249, 45, 71, 32);
		frame.getContentPane().add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("cur");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer.setText(Ob.current());
			}
		});
		btnNewButton_16.setBounds(176, 45, 61, 32);
		frame.getContentPane().add(btnNewButton_16);
	}
}
