package test.edu.org.br;


public class Prod {

		private int tamanho;
	
		
		public int getTamanho() {
			if(tamanho == 1) {
				tamanho = 200;
			}else if(tamanho == 2) {
				tamanho = 300;
			}else if(tamanho == 3) {
				tamanho = 500;
			}

			return tamanho;
		}
	
		
		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}

}
