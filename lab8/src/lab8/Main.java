package lab8;

public class Main {
	public static void main(String[] args) {
		Controller Controller = new Controller();
		String msg = "Testando";
		
		CaixaAlta caixaAlta = new CaixaAlta();
		CaixaBaixa caixaBaixa = new CaixaBaixa();
		Italico italico = new Italico();
		Negrito negrito = new Negrito();
		
		String um = Controller.formataMsg(msg, caixaAlta);
		String dois = Controller.formataMsg(msg, caixaBaixa);
		String tres = Controller.formataMsg(msg, italico);
		String quatro = Controller.formataMsg(msg, negrito);
		
		System.out.println(um);
		System.out.println(dois);
		System.out.println(tres);
		System.out.println(quatro);
	}


}
