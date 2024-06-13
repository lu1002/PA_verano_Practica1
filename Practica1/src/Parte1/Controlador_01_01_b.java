package Parte1;

import java.awt.EventQueue;

public class Controlador_01_01_b {
	
	public Controlador_01_01_b() {
        iniciarAplicacion();
    }

    private void iniciarAplicacion() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica01_01_b frame = new Practica01_01_b();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}







