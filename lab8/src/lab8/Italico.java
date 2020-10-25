package lab8;

public class Italico implements Formatacao{

	private String txt;
	
	public Italico(String txt) {
		this.txt = txt;
	}
	
	@Override
	public String formatar() {
		String imprime = "\033[3m" + txt + "\033[0m";
		return imprime;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
}