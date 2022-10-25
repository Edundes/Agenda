public class Pessoa {
	
	private int codigo;
	private String nome;
	private String dataDeNascimento;
	private String telefone;
	
	public Pessoa(String nome, String dataDeNascimento, String telefone) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return String.format("Códido: %d"
						+ "\nNome: %s"
						+ "\nData de Nascimento: %s"
						+ "\nTelefone: %s\n", codigo, nome, dataDeNascimento, telefone);
	}
	
	
}