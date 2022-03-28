
public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.print("Ola novo teste");
		
		int idade = 35;
		double salario = 6850.70;
		System.out.println("A idade do Marcel é: "+ idade + " e ganha R$" + salario + " por mês.");
	
		double valorDouble = 7500.50;
		int valorInt = (int) valorDouble;
		
		System.out.println("Valor converdito double->int : " + valorInt);
		
		char valorChar = 66;
		int valorChar2 = 65;
		valorChar = ( char ) valorChar2;
		
		System.out.println("valor char = " + valorChar);
		
		

	}
}
