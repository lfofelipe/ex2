package entity;

public class Endereco {
	private Integer idENdereco;
	private String bairro;
	private String cidade;
	
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(Integer idENdereco, String bairro, String cidade) {
		super();
		this.idENdereco = idENdereco;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Integer getIdENdereco() {
		return idENdereco;
	}

	public void setIdENdereco(Integer idENdereco) {
		this.idENdereco = idENdereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [idENdereco=" + idENdereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + "]";
	}
	
	
}
