/*
 * 3 - Escreva um programa para ler 3 notas de um aluno e informar se 
o alunos está aprovado, reprovado ou se deverá fazer a prova
final.

O aluno será Aprovado a média de suas notas for > 6
O aluno será Reprovado se a média de suas notas for < 4
O aluno deverá fazer a prova se a média de suas notas for >= 4 e < 6 

Média das notas: (Nota1 + Nota2 + Nota3) / 3
 */
package javaaulass;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Dados = new Scanner (System.in);
		
		int primNota,segNota,terNota;
		String nomeAluno;
		int mediaAluno;
		int Opcoes=0;
		
		System.out.println ("Entre com o nome do Aluno : ");
		nomeAluno = Dados.nextLine();
		
		System.out.println("Entre com sua Primeira Nota : ");
		primNota = Dados.nextInt();
		System.out.println ("Entre com sua Segunda Nota : ");
		segNota = Dados.nextInt();
		System.out.println("Entre com sua Terceira Nota : ");
		terNota = Dados.nextInt();
		
		mediaAluno = (primNota + segNota + terNota) / 3;
	
		
			if (mediaAluno >= 6){
			System.out.println("Média = " +mediaAluno);
			System.out.println ("Parabéns!. Você foi Aprovado!");
			}
			
		if (mediaAluno <= 4){
			System.out.println ("Média = " +mediaAluno);
		System.out.println ("Sinto muito, você foi reprovado por nota.");
		}
		
		
			if (mediaAluno >= 4 && mediaAluno < 6){
			System.out.println ("Média = " +mediaAluno);
		System.out.println ("Você terá a chance de fazer uma nova prova.");
			}
		
	
	}

}


