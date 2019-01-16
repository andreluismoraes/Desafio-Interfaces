package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidade.Contrato;
import Servico.ServicoPagamentoPayPal;

public class Programa {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Inserir dados do Contrato");
		System.out.print("Numero Contrato: ");
		Integer numeroContrato = sc.nextInt();
		System.out.print("Data do contrato: ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor Contrato: ");
		Double valorContrato = sc.nextDouble();
		System.out.print("Em quantas parcelas você pretende fazer? ");
		int parcela = sc.nextInt();

		Contrato c = new Contrato(numeroContrato, dataContrato, valorContrato, new ServicoPagamentoPayPal());
		for(int i = 1 ; i <= parcela; i++) {
			System.out.print(i + "º Parcela para o dia --> ");
			System.out.print(sdf.format(c.gerarData(dataContrato, i)) + " ");
			System.out.printf("%.2f", c.gerarValorParcela(parcela, i));
			System.out.println();
		}
	}
}
