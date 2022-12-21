package bancoBrasil;

public class TestaBanco {

	public static void main(String[] args) {
	
		Conta conta = new Conta ();
		Cliente pessoa = new Cliente();
		

		
		conta.titular = pessoa;
		
		System.out.println(conta.titular.nome);
		System.out.println(conta.titular.nomeDaMae);
	 
}
		
		
		
		
	}
	

