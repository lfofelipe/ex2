package entity;

public class Cliente {
	private Integer idCliente;
	private String nome;
	private String email;
	private Endereco endereco;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(Integer idCliente, String nome, String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}



	public Cliente(Integer idCliente, String nome, String email,
			Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome
				+ ", email=" + email + "]";
	}
	public String toString(String op) {
		switch (op) {
		case "csv":
			return idCliente + ";" + nome + ";" + email + ";" + endereco.getIdENdereco() + ";" + endereco.getBairro() + ";" + endereco.getCidade();
		case "txt":
			return idCliente + "," + nome + "," + email + "," + endereco.getIdENdereco() + "," + endereco.getBairro() + "," + endereco.getCidade();
		default:
			return toString();
		}
	}
	public static void main(String[] args) {
		Cliente c = new Cliente(1, "luis felipe", "pro__felipe@hotmail.com");
		Endereco e = new Endereco(1, "centro", "Niteroi");
		c.setEndereco(e);
		System.out.println(c.toString(""));
	}
}
