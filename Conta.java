class Conta{
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

	public Conta(int numero, double limite){
		this(numero, limite, 0);
	}
	
	public Conta(int numero, double limite, double saldoInicial){
                this.numero = numero;
                this.limite = limite;
 		this.saldo = saldoInicial;
        }


	public void saca(double valor){
		if(valor > this.saldo + this.limite){
                	System.out.println("Saque invalido!");
                }else{
			this.saldo = this.saldo - valor;
		}	
	}

	public void deposito(double valor){
		this.saldo = this.saldo + valor;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void setLimite(double novoLimite){
		this.limite = novoLimite;
	}
}
