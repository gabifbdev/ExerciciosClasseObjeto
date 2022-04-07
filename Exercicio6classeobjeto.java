package Familia51;
import java.text.NumberFormat;


public class Exercicio6classeobjeto {

	private String cliente;
	private String tipoConta;
	private int saldo;
	private int saque;
	
	
	public Exercicio6classeobjeto(String cliente, String tipoConta, int saldo, int saque) {
		super();
		this.cliente = cliente;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
		this.saque = saque;
		
		
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public int getSaque() {
		return saque;
	}


	public void setSaque(int saque) {
		this.saque = saque;
	}
	
	
	public void imprimir() {
		
	
	System.out.println("\nCliente: " + cliente);	
	System.out.println("\nTipo de Conta: " + tipoConta);	
	System.out.println("\nSaldo: " + 	saldo);
	System.out.println("\nSaque: " + saque);
		
		
		
	}
	
}
