package bancoBrasil;


	
	class Conta {
		
		 int agencia;
		 int numero;
		 private double saldo;
		 Cliente titular;
		 
		 public void depositar(double valor) {
			 
			 this.saldo += valor;
			 
		 }
		 
		
		 public boolean sacar(double valor) {
			 
			 if(saldo >= valor) {
				 this.saldo -= valor;
				 return true;
				 
			 }else {
				 return false;
			 }
				 
			 
		 }
		 
	}


