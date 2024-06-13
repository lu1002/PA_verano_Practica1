package P2_Practica_a;

import java.util.ArrayList;

public class Categoria {
	
	private String idcategoria;
	private String categoria;
	
	
	public Categoria(String idcategoria, String categoria) {
		super();
		this.idcategoria = idcategoria;
		this.categoria = categoria;
	}


	public String getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return this.getCategoria();

	}
}


	
	


