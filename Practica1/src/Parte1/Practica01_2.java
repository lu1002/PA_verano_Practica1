package Parte1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;

public class Practica01_2 extends JWindow {

	private JPanel contentPane;


	
	public Practica01_2() {
         setBounds(100,100,450,300);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
	}

}
