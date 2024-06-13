package Parte1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_02_a implements ActionListener{
	
Practica02_a ventana;
	public Controlador_02_a() {
        iniciarAplicacion();
    }

    private void iniciarAplicacion() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica02_a frame = new Practica02_a();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
			if (ventana.Bsalir == e.getSource())
				System.exit(0);

		}
}
