/*
 * 3 - Escreva um programa para ler 3 notas de um aluno e informar se 
o alunos est� aprovado, reprovado ou se dever� fazer a prova
final.

O aluno ser� Aprovado a m�dia de suas notas for > 6
O aluno ser� Reprovado se a m�dia de suas notas for < 4
O aluno dever� fazer a prova se a m�dia de suas notas for >= 4 e < 6 

M�dia das notas: (Nota1 + Nota2 + Nota3) / 3
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
			System.out.println("M�dia = " +mediaAluno);
			System.out.println ("Parab�ns!. Voc� foi Aprovado!");
			}
			
		if (mediaAluno <= 4){
			System.out.println ("M�dia = " +mediaAluno);
		System.out.println ("Sinto muito, voc� foi reprovado por nota.");
		}
		
		
			if (mediaAluno >= 4 && mediaAluno < 6){
			System.out.println ("M�dia = " +mediaAluno);
		System.out.println ("Voc� ter� a chance de fazer uma nova prova.");
			}
		
	
	}

}


