package P2_Practica_a;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_03_c {

    public Controlador_03_c() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica03_c frame = new Practica03_c();
                    frame.setVisible(true);
                    frame.getBagregar().addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.Altas();
                        }
                    });
                    frame.getBeliminar().addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.Eliminar();
                        }
                    });
                    frame.getBsalir().addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (frame.getBsalir().getText().compareTo("Cancelar") == 0) {
                                frame.Volveralinicio();
                            } else {
                                frame.dispose();
                            }
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}



