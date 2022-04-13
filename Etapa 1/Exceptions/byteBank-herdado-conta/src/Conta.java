

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int count = 0;
	
	public Conta(int agencia, int numero) {
		Conta.count++;
		System.out.println("O tatal de contas criadas: " + Conta.count);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Rodando Constructor");
	}
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor) throws ExceptionSaldoInsuficiente{
		
		if(this.saldo < valor) {
			throw new ExceptionSaldoInsuficiente("ERRO:.. Saldo: " + this.saldo + ", Valor: " + valor);		
		}		
			this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta contaDestino) throws ExceptionSaldoInsuficiente {	
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getCount() {
		return count;
}
}
