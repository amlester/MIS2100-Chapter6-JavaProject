package Lester.Alisha.Chapter6.JavaProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField Numerator;
	private JTextField Denominator;
	private JLabel Denominator_1;
	private JLabel Numerator_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Numerator = new JTextField();
		Numerator.setBounds(12, 42, 116, 22);
		frame.getContentPane().add(Numerator);
		Numerator.setColumns(10);
		
		Denominator = new JTextField();
		Denominator.setBounds(286, 42, 116, 22);
		frame.getContentPane().add(Denominator);
		Denominator.setColumns(10);
		
		Denominator_1 = new JLabel("Denominator");
		Denominator_1.setBounds(312, 13, 90, 16);
		frame.getContentPane().add(Denominator_1);
		
		Numerator_1 = new JLabel("Numerator");
		Numerator_1.setBounds(34, 13, 94, 16);
		frame.getContentPane().add(Numerator_1);
		
		JTextPane Awnser = new JTextPane();
		Awnser.setBounds(172, 113, 74, 22);
		frame.getContentPane().add(Awnser);
		
		JButton Calculate = new JButton("Calculate");
		
		Calculate.setBounds(162, 61, 97, 25);
		frame.getContentPane().add(Calculate);
		
		Calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double numerator = Double.parseDouble(Numerator_1.getText());
				double denominator = Double.parseDouble(Denominator_1.getText());
				
				SimpleMath simplemath = new SimpleMath();
				
			
				try{
					double result = simplemath.divide(numerator, denominator);
					String s = String.valueOf(result);
					Awnser.setText(s);
				}catch(ArithmeticException e){
					Awnser.setText("Cannot divide by 0"); 					
				}
			
				
		
				
				
			}
		});
	}
}
