package Parte1;

import java.awt.EventQueue;

public class Controlador_01_03 {

	public Controlador_01_03() {
        iniciarAplicacion();
    }

    private void iniciarAplicacion() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica01_03 frame = new Practica01_03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
