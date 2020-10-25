package lab8;

public class CaixaBaixa implements Formatacao{
		public CaixaBaixa () {}
		
		@Override
		public String formata(String msg) {
			return msg.toLowerCase();
		}
}
