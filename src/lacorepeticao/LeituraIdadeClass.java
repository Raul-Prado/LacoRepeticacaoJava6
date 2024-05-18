package lacorepeticao;

import java.util.Scanner;

public class LeituraIdadeClass {

	public static void main(String[] args) {
		
		// variaveis
		int PessoaIdade;
		int ContadorIdade=0;
		int Contador=0;
					
		//ler dados
		Scanner scanner = new Scanner(System.in);
						
		//entrada
		System.out.println("Digite uma idade: ");
		PessoaIdade = scanner.nextInt();
		
		//laco
		while(PessoaIdade >=0) {
					
			//codicao
			if(PessoaIdade < 21){
				ContadorIdade++;
			}

			System.out.println("Total de pessoas menores de 21 anos: " + ContadorIdade);
		}
	}
}
