package lab8;

public class CaixaBaixa implements Formatacao{
	
	private String txt;
	
	public CaixaBaixa(String txt) {
		this.txt = txt;
	}
	
	@Override
	public String formatar() {
		String imprime = txt.toLowerCase();
		return imprime;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
}
