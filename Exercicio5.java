/*
 * Escreva um programa para ler 3 notas de um aluno e informar o valor 
da sua maior e menor nota.
 */
package javaaulass;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner Dados = new Scanner (System.in);
		int notaAv1;
		int notaAv2;
        int notaAv3;
        
        
        System.out.println ("Digite  a Nota da Avaliação 1 : ");
        notaAv1 = Dados.nextInt();
        System.out.println ("Digite a Nota da Avaliação 2 : ");
        notaAv2 = Dados.nextInt();
        System.out.println ("Digite  a Nota da Avaliação 3 :");
        notaAv3 = Dados.nextInt();
        
        if (notaAv1 > notaAv2 && notaAv1 > notaAv3){
        	System.out.println ("A Nota da Avaliação 1 foi a maior nota. Nota = " + notaAv1);
        }
        
        if (notaAv2 > notaAv1 && notaAv2 > notaAv3){
        	System.out.println ("A Nota da Avaliação 2 foi a maior. Nota = " + notaAv2);
        }
        
        if (notaAv3 > notaAv2 && notaAv3 > notaAv1){
        	System.out.println ("A Nota da Avaliação 3 foi a maior. Nota = " + notaAv3);
        }
        
        if (notaAv1 < notaAv2 && notaAv1 < notaAv3){
        	System.out.println ("A Nota da Avaliação 1 foi a menor nota. Nota = " + notaAv1);
        }
        
        if (notaAv2 < notaAv1 && notaAv2 < notaAv3){
        	System.out.println ("A Nota da Avaliação 2 foi a menor nota. Nota = " + notaAv2);
        }
        
        if (notaAv3 < notaAv2 && notaAv3 < notaAv1){
        	System.out.println ("A Nota da Avaliação 3 foi a menor nota. Nota = " + notaAv3);
        }
        
		

	}

}
