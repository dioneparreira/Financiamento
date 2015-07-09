package br.edu.iftm;

import java.awt.EventQueue;

//import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
//import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.util.Scanner;

import javax.swing.JComboBox;
//import javax.swing.DefaultComboBoxModel;

public class SimulaFinan extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JFrame frmSimuladorDeFinanciamento;
	private JTextField textField_VLVEIC;
	private JTextField textField_VLENTR;
	private JTextField textField_TAXAJUROS;
	private JTextField textField_RENDA;
	//private JComboBox<E>
	
	private float valorVeic;
	
	public float getValorVeic() {
		return valorVeic;
	}

	public void setValorVeic(float valorVeic) {
		this.valorVeic = valorVeic;
	}

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimulaFinan frame = new SimulaFinan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SimulaFinan() {
		
		frmSimuladorDeFinanciamento = new JFrame();
		frmSimuladorDeFinanciamento.setTitle("Simulador de Financiamento de Veiculos");
		frmSimuladorDeFinanciamento.setBounds(100, 100, 708, 480);
		frmSimuladorDeFinanciamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Simulador de Financiamento de Veiculos");
		setMaximizable(true);
		setBounds(100, 100, 618, 797);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblVLVeic = new JLabel("VALOR DO VEICULO:");
		lblVLVeic.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblVLVeic = new GridBagConstraints();
		gbc_lblVLVeic.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblVLVeic.insets = new Insets(0, 0, 25, 35);
		gbc_lblVLVeic.gridx = 0;
		gbc_lblVLVeic.gridy = 2;
		getContentPane().add(lblVLVeic, gbc_lblVLVeic);
		
		textField_VLVEIC = new JTextField();
		textField_VLVEIC.setColumns(10);
		//valorVeic= textField_VLVEIC.get
		GridBagConstraints gbc_textField_VLVEIC = new GridBagConstraints();
		gbc_textField_VLVEIC.anchor = GridBagConstraints.NORTH;
		gbc_textField_VLVEIC.gridwidth = 2;
		gbc_textField_VLVEIC.insets = new Insets(0, 0, 5, 0);
		gbc_textField_VLVEIC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLVEIC.gridx = 1;
		gbc_textField_VLVEIC.gridy = 2;
		getContentPane().add(textField_VLVEIC, gbc_textField_VLVEIC);
		
		JLabel lblVLEntr = new JLabel("VALOR DA ENTRADA:");
		lblVLEntr.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 25, 35);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		getContentPane().add(lblVLEntr, gbc_lblNewLabel);
		
		textField_VLENTR = new JTextField();
		textField_VLENTR.setColumns(10);
		GridBagConstraints gbc_textField_VLENTR = new GridBagConstraints();
		gbc_textField_VLENTR.anchor = GridBagConstraints.NORTH;
		gbc_textField_VLENTR.gridwidth = 2;
		gbc_textField_VLENTR.insets = new Insets(0, 0, 5, 0);
		gbc_textField_VLENTR.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLENTR.gridx = 1;
		gbc_textField_VLENTR.gridy = 5;
		getContentPane().add(textField_VLENTR, gbc_textField_VLENTR);
		
		JLabel lblNumeroDePrestacao = new JLabel("NUMERO DE PRESTACAO:");
		lblNumeroDePrestacao.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNumeroDePrestacao = new GridBagConstraints();
		gbc_lblNumeroDePrestacao.insets = new Insets(0, 0, 25, 35);
		gbc_lblNumeroDePrestacao.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNumeroDePrestacao.gridx = 0;
		gbc_lblNumeroDePrestacao.gridy = 8;
		getContentPane().add(lblNumeroDePrestacao, gbc_lblNumeroDePrestacao);
		
		final JComboBox comboBox = new JComboBox();
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox.addItem(new ComboItem(0,""));
		comboBox.addItem(new ComboItem(1,"12 meses"));
		comboBox.addItem(new ComboItem(2,"24 meses"));
		comboBox.addItem(new ComboItem(3,"36 meses"));
		comboBox.addItem(new ComboItem(4,"48 meses"));
		comboBox.addItem(new ComboItem(5,"60 meses"));
		comboBox.addItem(new ComboItem(6,"72 meses"));
		
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.insets = new Insets(0, 0, 25, 35);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 8;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblTaxaDeJuros = new JLabel("TAXA DE JUROS:");
		lblTaxaDeJuros.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblTaxaDeJuros = new GridBagConstraints();
		gbc_lblTaxaDeJuros.insets = new Insets(0, 0, 25, 35);
		gbc_lblTaxaDeJuros.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTaxaDeJuros.gridx = 0;
		gbc_lblTaxaDeJuros.gridy = 11;
		getContentPane().add(lblTaxaDeJuros, gbc_lblTaxaDeJuros);
		
		textField_TAXAJUROS = new JTextField();
		textField_TAXAJUROS.setColumns(10);
		GridBagConstraints gbc_textField_TAXAJUROS = new GridBagConstraints();
		gbc_textField_TAXAJUROS.anchor = GridBagConstraints.NORTH;
		gbc_textField_TAXAJUROS.gridwidth = 2;
		gbc_textField_TAXAJUROS.insets = new Insets(0, 0, 5, 0);
		gbc_textField_TAXAJUROS.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TAXAJUROS.gridx = 1;
		gbc_textField_TAXAJUROS.gridy = 11;
		getContentPane().add(textField_TAXAJUROS, gbc_textField_TAXAJUROS);
		
		JLabel lblRendaMensalBruta = new JLabel("RENDA MENSAL BRUTA:");
		lblRendaMensalBruta.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblRendaMensalBruta = new GridBagConstraints();
		gbc_lblRendaMensalBruta.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblRendaMensalBruta.insets = new Insets(0, 0, 25, 35);
		gbc_lblRendaMensalBruta.gridx = 0;
		gbc_lblRendaMensalBruta.gridy = 14;
		getContentPane().add(lblRendaMensalBruta, gbc_lblRendaMensalBruta);
		
		textField_RENDA = new JTextField();
		textField_RENDA.setColumns(10);
		GridBagConstraints gbc_textField_RENDA = new GridBagConstraints();
		gbc_textField_RENDA.anchor = GridBagConstraints.NORTH;
		gbc_textField_RENDA.gridwidth = 2;
		gbc_textField_RENDA.insets = new Insets(0, 0, 5, 0);
		gbc_textField_RENDA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_RENDA.gridx = 1;
		gbc_textField_RENDA.gridy = 14;
		getContentPane().add(textField_RENDA, gbc_textField_RENDA);
		
		JButton btnSimularFinanciamento = new JButton("SIMULAR FINANCIAMENTO");
		btnSimularFinanciamento.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				float sal;
		        double valor_veiculo;
		       	float juros = 0;
		        float valor_entrada;
		        int meses;
		        
		        
		     //valor_final(0.02, 10,0000, 2);
		     
		     
		    //System.out.println("Digite sua renda: ");
			sal = Float.parseFloat(textField_RENDA.getText());
		    //System.out.println("\nDigite o valor do ve�culo: ");
			valor_veiculo = Float.parseFloat(textField_VLVEIC.getText());
			//System.out.println("\nDigite o valor da entrada: ");
			valor_entrada = Float.parseFloat(textField_VLENTR.getText());
			//System.out.println("\nTaxa de juros ao m�s: ");
			juros = Float.parseFloat(textField_TAXAJUROS.getText());
			//System.out.println("\nEscolha a parcela do Financiamento: \n(1) 12x\n(2) 24x\n(3) 36x\n(4) 48x\n(5) 60x\n(6) 72x\n(0) Sair");
			meses = comboBox.getSelectedIndex();
			JOptionPane.showInputDialog(meses);
			
			//lblNewLabel_Resumo.setVisible(true);
			
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
				
		});
		
		GridBagConstraints gbc_btnSimularFinanciamento = new GridBagConstraints();
		gbc_btnSimularFinanciamento.anchor = GridBagConstraints.EAST;
		gbc_btnSimularFinanciamento.insets = new Insets(25, 0, 5, 45);
		gbc_btnSimularFinanciamento.gridx = 0;
		gbc_btnSimularFinanciamento.gridy = 16;
		getContentPane().add(btnSimularFinanciamento, gbc_btnSimularFinanciamento);
		
		JButton btnLimparDados = new JButton("LIMPAR DADOS");
		btnLimparDados.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				textField_VLVEIC.setText(null);  
				textField_VLENTR.setText(null); 
				//textField_NUMPRESTACAO.setText(null); 
				textField_TAXAJUROS.setText(null); 
				textField_RENDA.setText(null); 
			}
		});
		GridBagConstraints gbc_btnLimparDados = new GridBagConstraints();
		gbc_btnLimparDados.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimparDados.insets = new Insets(25, 0, 5, 45);
		gbc_btnLimparDados.gridx = 1;
		gbc_btnLimparDados.gridy = 16;
		getContentPane().add(btnLimparDados, gbc_btnLimparDados);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				int opcao ; 
				opcao=JOptionPane.showConfirmDialog(null,"DESEJA FECHAR A JANELA DE SIMULA��O? ","",JOptionPane.YES_NO_OPTION); 
				if(opcao==JOptionPane.YES_OPTION) 
				System.exit(0); 

				
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(25, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 16;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_Resumo = new JLabel("New Label");
		lblNewLabel_Resumo.setVisible(false);
		lblNewLabel_Resumo.setEnabled(false);
		lblNewLabel_Resumo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_Resumo = new GridBagConstraints();
		gbc_lblNewLabel_Resumo.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_Resumo.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_Resumo.gridx = 0;
		gbc_lblNewLabel_Resumo.gridy = 19;
		getContentPane().add(lblNewLabel_Resumo, gbc_lblNewLabel_Resumo);
						
	}
}
