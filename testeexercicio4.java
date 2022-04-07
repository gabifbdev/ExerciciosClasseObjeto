package Familia51;

public class testeexercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercicio4classeobjeto[] lista = new Exercicio4classeobjeto[3];
		
		lista[0] = new Exercicio4classeobjeto("Kamila Lima",5000);
		lista[1] = new Exercicio4classeobjeto("Lavínia Amorim",20000);
		lista[2] = new Exercicio4classeobjeto("Claudio Pereira",13000);
		
		for(Exercicio4classeobjeto roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("\n********************************************************");
		
		for(Exercicio4classeobjeto roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}

