package Parte1;

	import java.awt.EventQueue;

	public class Controlador_01_01 {
		
		public Controlador_01_01() {
	        iniciarAplicacion();
	    }

	    private void iniciarAplicacion() {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Practica01_01 frame = new Practica01_01();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	}


