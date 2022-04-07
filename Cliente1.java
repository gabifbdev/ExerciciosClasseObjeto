package Familia51;

public class Cliente1 {
	
	private String cliente;
	private String cpf;
	private String dataNascimento;
	private int idade;
	
	//metodos construtores
	
		public Cliente1(String cliente, String cpf, String dataNascimento, int idade) {
		super();
		this.cliente = cliente;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}
	//métodos atributos
		
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
		public void imprimir() {
			
	System.out.println("\nNome: " + cliente);	
	System.out.println("\nCpf: " + cpf);	
	System.out.println("\ndatanascimento: " + dataNascimento);
	System.out.println("\nIdade: " + idade);	

	
	
	}

}
	
		

