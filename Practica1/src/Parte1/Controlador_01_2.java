package Parte1;

import java.awt.EventQueue;

public class Controlador_01_2 {

	
	public Controlador_01_2() {
        iniciarAplicacion();
    }

    private void iniciarAplicacion() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica01_2 frame = new Practica01_2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
