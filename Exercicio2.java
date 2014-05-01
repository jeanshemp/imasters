package imasters;
import java.util.Scanner;

public class Exercicio2 {

	/**
	 * @param args
	 * @author dvpjean
	 */
	public static void main(String[] args) {
		Scanner Dados = new Scanner (System.in);
		
	
		float faturamentoTotal=0;
		int totalVideos;
		
		System.out.println ("                           - Locadora iMastersBR -          ");
		System.out.println ("                      Banco de dados da Locadora. Faturamento e etc. ");
		System.out.println();
		System.out.println();
		
		System.out.println ("Entre com   a quantidade de vídeos que a locadora iMastersBR possui : ");
		int quantidadeVideos = Dados.nextInt();
		
		System.out.println("Entre com o  valor cobrado por locação de cada Vídeo : ");
		float valorLocacao = Dados.nextFloat();
		
		System.out.println ("Total de Vídeos = "+quantidadeVideos+ ", Valor cobrado por locação R$ "+valorLocacao);
		
		System.out.println();
		System.out.println();
		faturamentoTotal = (quantidadeVideos/3 * valorLocacao) * 12;
		System.out.println ("Faturamento com 1/3 de vídeos locados =  R$"+faturamentoTotal);
		
		faturamentoTotal = (quantidadeVideos * valorLocacao )/ 10;
		System.out.println ("Valor gânho com multas mensais, 1/10 de Videos Atrasados = R$"+faturamentoTotal);
		
		totalVideos = (quantidadeVideos / 50);
		System.out.println ("Total de vídeos que estragam por ano %2 de : "+totalVideos+ " Videos.");
		
		totalVideos = (quantidadeVideos / 10);
		System.out.println ("Total de vídeos comprados para  reposição : "+totalVideos+ " Videos.");
		
		
				
		
		

	}

}
