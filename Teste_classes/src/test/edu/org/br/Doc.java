package test.edu.org.br;

public class Doc {

	
	private String tipo;

	
	@Override
	public String toString() {
		return  tipo;  
	}

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		tipo = "Chocolate";
		this.tipo = tipo;
	}
}
