/*
 * 7 - Escreva um programa para imprimir o menu abaixo:

1 - Solteiro(a)
2 - Desquitado(a)
3 - Casado(a)
4 - Divorciado(a)
5 - Vi�vo(a)

O usu�rio dever� selecionar uma das op��es do menu e este dever� escrever
o estado civil da pessoa. Emitir mensagem de erro caso seja escolhida uma
op��o inexistente.
 */
package javaaulass;
import java.util.Scanner;
public class Exercico7 {

	public static void main(String[] args) {
		Scanner Dados = new Scanner (System.in);
		int Casado=3;
		int Desquitado=2;
		int Solteiro=1;
		int Divorciado=4;
		int Viuvo=5;
		int Opcao;
		
		System.out.println (" Em qual das op��es voc� se enquadra: ");
		System.out.println ("1 - Solteiro(a)");
		System.out.println ("2 - Desquitado(a)");
		System.out.println ("3 - Casado(a)");
		System.out.println ("4 - Divorciado(a)");
		System.out.println ("5 - Vi�vo(a)");
		System.out.println ("Escolha sua Op��o : ");
		 Opcao = Dados.nextInt();
		
		 for (;;){
		switch (Opcao){
		
		case 1 : if (Opcao == Solteiro)
			System.out.println ("Aproveite essa vida merm�o");
		       break;
	   
		case 2 : if (Opcao == Desquitado)
			System.out.println("quite-se");
		break;
		case 3 : if (Opcao == Casado)
			
			System.out.println ("Se Lascou amigao, boa morte");
	                        break;
	                        
		case 4 : if (Opcao == Divorciado)
			System.out.println ("Casou cedo, e se arrependeu n�?");
		break;
		
		case 5 : if (Opcao == Viuvo)
			System.out.println ("Meus P�sames.");
		 break;
		     default : System.out.println("invalida");
		     
		}
		break;
		 }

	}

}
