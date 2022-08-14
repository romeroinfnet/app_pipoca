package test.edu.org.br;

public class Sal {
	
	private String sabor;

	
	@Override
	public String toString() {
		return    sabor;  
	}

	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		sabor = "calabresa";
		System.out.println(this.sabor = sabor);
	}

}
