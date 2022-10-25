import java.util.ArrayList;
import java.sql.*;

public class Agenda {

	private ArrayList<Pessoa> pessoas;
	private Connection conn;

	public Agenda() throws Exception {
		pessoas = new ArrayList<>();
		String dbURL = "jdbc:postgresql://localhost:5432/atividade";
		String username = "postgres";
		String password = "Piczeac@28";
		conn = DriverManager.getConnection(dbURL, username, password);
		if (conn != null) {
            System.out.println("Conectado ao Banco de Dados!");
        }
	}
	//Método para criar a tabela
	public void criaTabela() throws Exception {
		String sql = "CREATE TABLE agenda (" + 
					"codigo int primary key," + 
					"nome varchar(30)," + 
					"dataDeNascimento DATE," + 
					"telefone varchar (15))";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.executeUpdate();
	}
	
	public void inserir(Pessoa pessoa) throws Exception{
        String sql = "INSERT INTO Item (codigo, nome, datadenascimento, telefone) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        statement.setInt(1, pessoa.getCodigo());
        statement.setString(2, pessoa.getNome());
        statement.setString(3, pessoa.getDataDeNascimento());
        statement.setString(3, pessoa.getTelefone());
        statement.executeUpdate();
    }
	

	public void armazenaPessoas(String nome, String dataDeNascimento, String telefone) {
		Pessoa novaPessoa = new Pessoa(nome, dataDeNascimento, telefone);
		pessoas.add(novaPessoa);
	}

	public void removerPessoa(String nome) {
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa p = pessoas.get(i);
			if (p.getNome().equals(nome)) {
				pessoas.remove(p);
			}
		}
	}
	
	public void imprimeAgenda() {
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}
