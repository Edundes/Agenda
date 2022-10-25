
public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Agenda agenda = new Agenda();
		try {
			agenda.criaTabela();
			System.out.println("Teste");
		} catch (Exception e) {
			System.out.println("Tabela já criada!!!");
		}
		
		
		
	}

}
