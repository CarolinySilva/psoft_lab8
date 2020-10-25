package lab8;

public class CaixaAlta implements Formatacao {
	public CaixaAlta() {}

	@Override
	public String formata (String msg) {
		return msg.toUpperCase();
	}
}	
