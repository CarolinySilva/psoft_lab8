package lab8;

public class Negrito implements Formatacao{
	@Override
	public String formata(String msg) {
		return "\033[1m" + msg + "\033[1m";
	}

}
