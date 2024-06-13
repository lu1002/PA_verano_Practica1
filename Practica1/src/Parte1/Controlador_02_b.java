package Parte1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


	public class Controlador_02_b implements ActionListener {

	    private Practica02_b ventana;
	    private JButton Bsalir;

	    public Controlador_02_b() {
	        iniciarAplicacion();
	    }

	    private void iniciarAplicacion() {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    ventana = new Practica02_b();
	                    Bsalir = new JButton("Salir");
	                    Bsalir.addActionListener(Controlador_02_b.this);
	                    ventana.getContentPane().add(Bsalir);
	                    ventana.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == Bsalir) {
	            JOptionPane.showMessageDialog(ventana, "Hasta luego");
	            ventana.dispose();
	        }
	    }

	    public static void main(String[] args) {
	        new Controlador_02_b();
	    }
	}

	
