package lab8;

public class Controller {
	public Controller( ) {}
	
	public String formatarStr(int valor, String txt) {
		Formatacao formatacao = null;
		String imprime = "";
		try {
			if(valor == 1) {
				formatacao = new CaixaAlta(txt);
			}
			else if(valor == 2) {
				formatacao = new CaixaBaixa(txt);
			}
			else if(valor == 3) {
				formatacao = new Italico(txt);
			}
			else if(valor == 4) {
				formatacao = new Negrito(txt);
			}
			imprime = formatacao.formatar();
			
	
		}catch(Exception e) {
			System.out.println("Valor invalido");
		}
		return imprime;

	}
}