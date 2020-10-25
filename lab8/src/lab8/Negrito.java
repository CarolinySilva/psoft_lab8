package lab8;

public class Negrito implements Formatacao{
	private String txt;
	
	public Negrito(String txt) {
		this.txt = txt;
	}
	
	@Override
	public String formatar() {
		String imprime = "\033[1m" + txt + "\033[1m";
		return imprime;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
}
