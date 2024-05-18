package lacorepeticao;

import java.util.Scanner;

public class NumerosMultiplosClass {

	public static void main(String[] args) {
		// variaveis
		int NumeroA;
		int NumeroB;
		int Numero3 = 3;
		int Numero5 = 5;
		int NumeroMultiplo = 2;
		int Resultado;
		int Contador;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//entrada
		System.out.println("Digite o primeiro número do intervalo: ");
		NumeroA = scanner.nextInt();
		System.out.println("Digite o primeiro número do intervalo: ");
		NumeroB = scanner.nextInt();
		
		if(NumeroA > NumeroB && NumeroB < NumeroA) {
			System.out.println("No Intervalo entre " + NumeroA + " e " + NumeroB);
			System.out.println("========================");
			//NumeroMultiplo = (NumeroA*NumeroB);
			//System.out.println(NumeroMultiplo + " é múltiplo de " + NumeroA + " e " + NumeroB);
			
			//laço
			for(Contador = 1; Contador < NumeroA+1; Contador++) {
				Resultado = (Contador*NumeroA);
				//% numero == 0
				System.out.println(Contador + "x" + NumeroA + "=" + Resultado);
			}
			
		}
		else {
			System.out.println("Intervalo inválido!");
			
		}
		
	}

}
