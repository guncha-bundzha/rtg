package Main;

import java.awt.event.ActionListener;

import javax.swing.JFrame;



public class Main implements ActionListener {
	
	static JFrame frame = new JFrame();

	public static void main(String[] args) {

	}

	static void createFrame() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		//frame.setTitle("");
		//frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
	}
}
