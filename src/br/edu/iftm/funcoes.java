package br.edu.iftm;

import javax.swing.JOptionPane;

public class funcoes {

public static float calculo_parcela_min(float salario){
		
		float parcela = salario * 40 / 100;
		return parcela;
		
	}
	
public static double calculo_entrada(double veiculo){
		
		double entrada = veiculo * 20 / 100;
		return entrada;
		
	}

public static float juros(float taxa_juros){
	
	float taxa = taxa_juros / 100;
	return taxa;
	
}

public static double valor_parcela(double juros, double val_veiculo, int meses, double entr){
	
	double j = 1+juros;
	double denominador1 = Math.pow(j, meses);
	//System.out.print("\n" + denominador1);
	double denominador2 = 1 - (1/denominador1);
	//System.out.print("\n" + denominador2);
	double valor_financiado = val_veiculo - entr;
	double valor_final = valor_financiado * juros / denominador2;
	//System.out.print("\n" + valor_final);
 	return valor_final;
		
}

public static String resumo (float juros, double valor_veiculo, double parcela, int meses, double entrada){
	String mensagem = ("Taxa de Juros: " + String.valueOf(juros) + " a.m." +
	"\nValor Veículo: R$" + String.valueOf(valor_veiculo) +
	"\nEntrada mínima de 20 por cento do valor do veículo: R$ " + String.valueOf(funcoes.calculo_entrada(valor_veiculo)) + 
	"\nValor da parcela: " + meses +"x: R$" + String.valueOf(parcela) + 
	"\nValor Entrada: R$" + entrada +
	"\nValor Total Financiado: R$" + parcela*meses);
	
	return mensagem;
	/*System.out.printf("Taxa de Juros: " + String.valueOf(juros) + " a.m.");
	System.out.printf("\nValor Veículo: R$" + String.valueOf(valor_veiculo) +
	"\nEntrada mínima de 20 por cento do valor do veículo: R$ " + String.valueOf(funcoes.calculo_entrada(valor_veiculo)));
	System.out.printf("\nValor da parcela: " + meses +"x: R$" + String.valueOf(parcela));
	System.out.printf("\nValor Entrada: R$" + entrada);
	System.out.printf("\nValor Total: R$" + parcela*meses);*/
	
}

public static boolean valida(float salario, double parcela, double veiculo, double entrada){
	if (calculo_parcela_min(salario) < parcela)
	{JOptionPane.showMessageDialog(null, "Valor da parcela maior que o permitido para esse cliente!", "Erro", 0);
	//simula.main(null);
		return false;}
	
	if (entrada < calculo_entrada(veiculo))		
	{JOptionPane.showMessageDialog(null, "Valor insuficiente da entrada!", "Erro", 0);
	//simula.main(null);
		return false;}
	
	else
		return true;
}

}
