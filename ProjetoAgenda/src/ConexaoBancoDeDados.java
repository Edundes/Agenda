import java.sql.*;

public class ConexaoBancoDeDados {

	private Connection conn;

	public ConexaoBancoDeDados() throws Exception {

		String dbURL = "jdbc:postgresql://localhost:5432/atividade";
		String username = "postgres";
		String password = "Piczeac@28";
		conn = DriverManager.getConnection(dbURL, username, password);

	}

	public void criaTabela() throws Exception {
		String sql = "CREATE TABLE agenda (" + 
					"codigo int primary key," + 
					"nome varchar(30)," + 
					"dataDeNascimento DATE," + 
					"telefone varchar (15)";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.executeUpdate(sql);
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

}