package br.edu.iftm;

import java.util.Scanner;

public class simula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        float sal;
        double valor_veiculo;
       	float juros = 0;
        float valor_entrada;
        int meses;
     //valor_final(0.02, 10,0000, 2);
     
     
    System.out.println("Digite sua renda: ");
	sal = entrada.nextFloat();
    //sal = funcoes.calculo_parcela(entrada.nextFloat());
	//System.out.printf("Parcela (mÃ¡ximo): R$" + sal);
	System.out.println("\nDigite o valor do veículo: ");
	valor_veiculo = entrada.nextFloat();
	System.out.println("\nDigite o valor da entrada: ");
	valor_entrada = entrada.nextFloat();
	System.out.println("\nTaxa de juros ao mês: ");
	juros = funcoes.juros(entrada.nextFloat());
	System.out.println("\nEscolha a parcela do Financiamento: \n(1) 12x\n(2) 24x\n(3) 36x\n(4) 48x\n(5) 60x\n(6) 72x\n(0) Sair");
	meses = entrada.nextInt();
	
	switch (meses)
	{
		case 1: 
			meses=12;
			break;
		
		case 2: 
			meses=24;
			break;
			
		case 3: 
			meses=36;
			break;
			
		case 4: 
			meses=48;
			break;
			
		case 5: 
			meses=60;
			break;
			
		case 6: 
			meses=72;					
					
			break; 
			
		case 0:
			break;		
			
	}
	double parcela = funcoes.valor_parcela(juros, valor_veiculo, meses, valor_entrada);
	if (funcoes.valida(sal, parcela, valor_veiculo, valor_entrada) == true)
	{
	funcoes.resumo(juros, valor_veiculo, parcela, meses, valor_entrada); 
	}
	

	}

}
