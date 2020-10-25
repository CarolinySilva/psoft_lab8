package lab8;

public class Italico implements Formatacao {
	
	@Override
	public String formata(String msg) {
		return "\033[3m" + msg + "\033[0m";
	}
}
