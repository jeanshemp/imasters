/*
 * 16 - Escreva um programa para ler o nome e a idade de uma pessoa e 
imprimir o nome e o valor que ela ter� que pagar por um plano
de sa�de. O programa dever� levar em considera��o a tabela 
abaixo:

at� 10 anos - R$ 30,00
acima de 10 at� 29 anos - R$ 60,00
acima de 29 at� 45 anos - R$ 120,00
acima de 45 at� 59 anos - R$ 150,00
acima de 59 at� 65 anos - R$ 250,00
acima de 65 anos - R$ 400,00
 */
package javaaulass;
import java.util.Scanner;

public class Exercicio16 {
	
    public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Entre com seu Nome : ");
		String nomeUser = entrada.nextLine();
		
		System.out.println ("Sr." +nomeUser+ ", Entre com sua Idade : ");
		int idadeUser = entrada.nextInt();
		
		if (idadeUser <= 10){
			System.out.println ("Sr(a)." +nomeUser+ ", voce entrara no plano - Infantil. Valor R$30,00");
		}
		
		else if (idadeUser > 10 && idadeUser <=29){
			System.out.println("Sr(a)."+nomeUser+", voce entrara no Plano - Adolescente. Valor R$ 60,00");
		}
		else if (idadeUser > 29 && idadeUser <= 45){
			System.out.println ("Sr(a)."+nomeUser+",voce entrara no Plano - Jovem Guarda. Valor R$ 120,00");
		}

		else if (idadeUser > 45 && idadeUser <= 59){
			System.out.println ("Sr(a)."+nomeUser+",voce entrara no Plano - Velha Idade. Valor R$ 150,00");
		}
		else if (idadeUser > 59 && idadeUser <= 65){
			System.out.println ("Sr(a)."+nomeUser+",voce entrara no Plano - P/ Senhores(a). Valor R$ 250,00");
		}
		
		else if (idadeUser > 65){
			System.out.println ("Sr(a)."+nomeUser+",voce entrara no plano - Especial Year 3. Valor R$ 400,00");
		}
	}

}
