package lab8;

public class CaixaAlta implements Formatacao {


	private String txt;

	public CaixaAlta(String txt) {
		this.txt = txt;
	}
	
	@Override
	public String formatar() {
		String imprime = txt.toUpperCase();
		return imprime;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
}
