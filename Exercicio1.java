/*
 * 1 - Escreva um programa efetuar o cálculo do salário bruto e do salário
líquido de um empregado. Os dados fornecidos são:

- O valor do salário hora
- O número de horas trabalhadas no mês
- O percentual de desconto do INSS (double inss = 1.10;)
 */
package javaaulass;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Dados = new Scanner (System.in);
		
		double salHora;
		double horasMes;
		double inss = 1.10;
		String nomeFunc;
		double salBruto;
		double salLiquido;
		
		System.out.println ("Entre com  o Nome do Colaborador : ");
		nomeFunc = Dados.nextLine();
		
		System.out.println ("Valor da hora trabalhada : ");
		salHora  = Dados.nextFloat();
		
		System.out.println ("Entre com o numero de horas trabalhas no mês : ");
		horasMes = Dados.nextFloat();
		
		salBruto = salHora * horasMes;
		
		System.out.println ("O Valor do Salário bruto é R$ = " + salBruto);
		
		salLiquido = (salBruto - inss);
		System.out.println ("                                  ");
		
		System.out.println (":::::: Dados do Colaborador ::::::");
		System.out.println ("                                  ");
		System.out.println ("Nome :" + nomeFunc);
		System.out.println ("Ganha por hora :" +salHora);
		System.out.println ("Trabalhou por mês :" +horasMes);
		System.out.println ("Recebera o valor liquido dê R$ = "+ salLiquido);
		
	}

}
