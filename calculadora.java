package calculadora;

import java.util.Scanner;

public class calculo {
	
	//Declaração de variaveis 
	int n1 = 0;
	int n2 = 0;
	
	public static void main(final String... args) {
		//Instanciar o metodo Scanner para receber os dados 
		Scanner entrada = new Scanner(System.in);

		//Entrada de dados pelo usuario
		System.out.printf("Digite o primeiro valor: ");

		String numero1 = entrada.nextLine();

		System.out.printf("Digite o segundo valor: ");

		String numero2 = entrada.nextLine();
		
		//Instanciar a classe principal 
		calculo cal = new calculo();
		
		//conversao de tipos String para tipo Inteiro (Int)
		cal.n1 = Integer.parseInt(numero1);
		cal.n2 = Integer.parseInt(numero2);
		
		//Chamada dos metodos responsaveis para operação 
		 System.out.println("Resultado operações matematicas basica:");
		 cal.soma(cal.n1, cal.n2);
		 cal.divisao(cal.n1, cal.n2);
		 cal.subtracao(cal.n1, cal.n2);
		 cal.multiplicacao(cal.n1, cal.n2);
		
	}
	
	
	//metodos operaçoes matematicas basica
	void soma(int x, int y) {
		//realizar calculo
		int result = x + y;
		//impressao do resultado
		System.out.println("Soma: "+result);
	}
	
	void divisao(int x, int y) {
		int result = x / y;
		System.out.println("Divisao: "+result);
	}
	
	void subtracao(int x, int y) {
		int result = x - y;
		System.out.println("Subtracao: "+result);
	}
	
	void multiplicacao(int x, int y) {
		int result = x * y;
		System.out.println("Multiplicação: "+result);
	}
}
