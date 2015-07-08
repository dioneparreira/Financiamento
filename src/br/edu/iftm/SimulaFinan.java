package br.edu.iftm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimulaFinan extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JFrame frmSimuladorDeFinanciamento;
	private JTextField textField_VLVEIC;
	private JTextField textField_VLENTR;
	private JTextField textField_NUMPRESTACAO;
	private JTextField textField_TAXAJUROS;
	private JTextField textField_RENDA;
	
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
	public SimulaFinan() {
		
		frmSimuladorDeFinanciamento = new JFrame();
		frmSimuladorDeFinanciamento.setTitle("Simulador de Financiamento de Ve\u00EDculos");
		frmSimuladorDeFinanciamento.setBounds(100, 100, 708, 480);
		frmSimuladorDeFinanciamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Simulador de Financiamento de Ve\u00EDculos");
		setMaximizable(true);
		setBounds(100, 100, 618, 613);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblVLVeic = new JLabel("VALOR DO VEICULO:");
		lblVLVeic.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblVLVeic = new GridBagConstraints();
		gbc_lblVLVeic.anchor = GridBagConstraints.WEST;
		gbc_lblVLVeic.insets = new Insets(0, 0, 25, 35);
		gbc_lblVLVeic.gridx = 0;
		gbc_lblVLVeic.gridy = 2;
		getContentPane().add(lblVLVeic, gbc_lblVLVeic);
		
		textField_VLVEIC = new JTextField();
		textField_VLVEIC.setColumns(10);
		//valorVeic= textField_VLVEIC.get
		GridBagConstraints gbc_textField_VLVEIC = new GridBagConstraints();
		gbc_textField_VLVEIC.gridwidth = 2;
		gbc_textField_VLVEIC.insets = new Insets(0, 0, 5, 5);
		gbc_textField_VLVEIC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLVEIC.gridx = 1;
		gbc_textField_VLVEIC.gridy = 2;
		getContentPane().add(textField_VLVEIC, gbc_textField_VLVEIC);
		
		JLabel lblNewLabel = new JLabel("VALOR DA ENTRADA:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 25, 35);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField_VLENTR = new JTextField();
		textField_VLENTR.setColumns(10);
		GridBagConstraints gbc_textField_VLENTR = new GridBagConstraints();
		gbc_textField_VLENTR.gridwidth = 2;
		gbc_textField_VLENTR.insets = new Insets(0, 0, 5, 5);
		gbc_textField_VLENTR.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLENTR.gridx = 1;
		gbc_textField_VLENTR.gridy = 5;
		getContentPane().add(textField_VLENTR, gbc_textField_VLENTR);
		
		JLabel lblNumeroDePrestacao = new JLabel("NUMERO DE PRESTACAO:");
		lblNumeroDePrestacao.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNumeroDePrestacao = new GridBagConstraints();
		gbc_lblNumeroDePrestacao.insets = new Insets(0, 0, 25, 35);
		gbc_lblNumeroDePrestacao.anchor = GridBagConstraints.WEST;
		gbc_lblNumeroDePrestacao.gridx = 0;
		gbc_lblNumeroDePrestacao.gridy = 8;
		getContentPane().add(lblNumeroDePrestacao, gbc_lblNumeroDePrestacao);
		
		textField_NUMPRESTACAO = new JTextField();
		textField_NUMPRESTACAO.setColumns(10);
		GridBagConstraints gbc_textField_NUMPRESTACAO = new GridBagConstraints();
		gbc_textField_NUMPRESTACAO.gridwidth = 2;
		gbc_textField_NUMPRESTACAO.insets = new Insets(0, 0, 5, 5);
		gbc_textField_NUMPRESTACAO.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_NUMPRESTACAO.gridx = 1;
		gbc_textField_NUMPRESTACAO.gridy = 8;
		getContentPane().add(textField_NUMPRESTACAO, gbc_textField_NUMPRESTACAO);
		
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
		gbc_textField_TAXAJUROS.gridwidth = 2;
		gbc_textField_TAXAJUROS.insets = new Insets(0, 0, 5, 5);
		gbc_textField_TAXAJUROS.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TAXAJUROS.gridx = 1;
		gbc_textField_TAXAJUROS.gridy = 11;
		getContentPane().add(textField_TAXAJUROS, gbc_textField_TAXAJUROS);
		
		JLabel lblRendaMensalBruta = new JLabel("RENDA MENSAL BRUTA:");
		lblRendaMensalBruta.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblRendaMensalBruta = new GridBagConstraints();
		gbc_lblRendaMensalBruta.anchor = GridBagConstraints.WEST;
		gbc_lblRendaMensalBruta.insets = new Insets(0, 0, 25, 35);
		gbc_lblRendaMensalBruta.gridx = 0;
		gbc_lblRendaMensalBruta.gridy = 14;
		getContentPane().add(lblRendaMensalBruta, gbc_lblRendaMensalBruta);
		
		textField_RENDA = new JTextField();
		textField_RENDA.setColumns(10);
		GridBagConstraints gbc_textField_RENDA = new GridBagConstraints();
		gbc_textField_RENDA.gridwidth = 2;
		gbc_textField_RENDA.insets = new Insets(0, 0, 5, 5);
		gbc_textField_RENDA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_RENDA.gridx = 1;
		gbc_textField_RENDA.gridy = 14;
		getContentPane().add(textField_RENDA, gbc_textField_RENDA);
		
		JButton btnSimularFinanciamento = new JButton("SIMULAR FINANCIAMENTO");
		btnSimularFinanciamento.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
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
				textField_NUMPRESTACAO.setText(null); 
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
				opcao=JOptionPane.showConfirmDialog(null,"DESEJA FECHAR A JANELA DE SIMULAÇÃO? ","",JOptionPane.YES_NO_OPTION); 
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
						
	}
}
