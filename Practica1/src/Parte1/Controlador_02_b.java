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


	public class Controlador_02_b {

		 public Controlador_02_b() {
		        EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                    Practica02_b frame = new Practica02_b();
		                    frame.setVisible(true);
		                    frame.getBsalir().addActionListener(new ActionListener() {
		                        public void actionPerformed(ActionEvent e) {
		                            JOptionPane.showMessageDialog(frame, "Hasta luego");
		                            frame.dispose();
		                        }
		                    });
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		            }
		        });
		    }
		}


	
