package br.edu.iftm;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Tela_Inicial extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JFrame frmSimuladorDeFinanciamento;
	private JTextField textField_VLENTR;
	private JTextField textField_VLPREST;
	private JTextField textField_VLVEIC;
	private JTextField textField_VLTAXAJ;
	private JTextField textField_RENDA;
	

	/**
	 * Launch the application.

	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Inicial window = new Tela_Inicial();
					window.frmSimuladorDeFinanciamento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Inicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimuladorDeFinanciamento = new JFrame();
		frmSimuladorDeFinanciamento.setTitle("Simulador de Financiamento de Ve\u00EDculos");
		frmSimuladorDeFinanciamento.setBounds(100, 100, 708, 480);
		frmSimuladorDeFinanciamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout_Tela = new GridBagLayout();
		gridBagLayout_Tela.columnWidths = new int[] {30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout_Tela.rowHeights = new int[] {30, 30, 30, 0, 0, 0, 0, 0, 30, 30, 30, 30, 30, 0};
		gridBagLayout_Tela.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout_Tela.rowWeights = new double[]{0.0, 100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0, 900.0, 1000.0, 0.0, 0.0, Double.MIN_VALUE};
		frmSimuladorDeFinanciamento.getContentPane().setLayout(gridBagLayout_Tela);
		
		JLabel lblSimuladorDeFinanciamento = new JLabel("SIMULADOR DE FINANCIAMENTO DE VEICULOS");
		lblSimuladorDeFinanciamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimuladorDeFinanciamento.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblSimuladorDeFinanciamento = new GridBagConstraints();
		gbc_lblSimuladorDeFinanciamento.gridwidth = 5;
		gbc_lblSimuladorDeFinanciamento.anchor = GridBagConstraints.NORTH;
		gbc_lblSimuladorDeFinanciamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblSimuladorDeFinanciamento.gridx = 0;
		gbc_lblSimuladorDeFinanciamento.gridy = 0;
		frmSimuladorDeFinanciamento.getContentPane().add(lblSimuladorDeFinanciamento, gbc_lblSimuladorDeFinanciamento);
		
		JLabel lblValorDoVeculo = new JLabel("VALOR DO VEICULO:   ");
		lblValorDoVeculo.setLabelFor(frmSimuladorDeFinanciamento);
		lblValorDoVeculo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblValorDoVeculo.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblValorDoVeculo = new GridBagConstraints();
		gbc_lblValorDoVeculo.anchor = GridBagConstraints.WEST;
		gbc_lblValorDoVeculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorDoVeculo.gridx = 0;
		gbc_lblValorDoVeculo.gridy = 3;
		frmSimuladorDeFinanciamento.getContentPane().add(lblValorDoVeculo, gbc_lblValorDoVeculo);
		
		textField_VLVEIC = new JTextField();
		textField_VLVEIC.setColumns(30);
		GridBagConstraints gbc_textField_VLVEIC = new GridBagConstraints();
		gbc_textField_VLVEIC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLVEIC.insets = new Insets(0, 0, 5, 5);
		gbc_textField_VLVEIC.gridx = 1;
		gbc_textField_VLVEIC.gridy = 3;
		frmSimuladorDeFinanciamento.getContentPane().add(textField_VLVEIC, gbc_textField_VLVEIC);
		
		JLabel lblValorDaEntrada = new JLabel("VALOR DA ENTRADA:  ");
		lblValorDaEntrada.setLabelFor(frmSimuladorDeFinanciamento);
		lblValorDaEntrada.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDaEntrada.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblValorDaEntrada = new GridBagConstraints();
		gbc_lblValorDaEntrada.anchor = GridBagConstraints.WEST;
		gbc_lblValorDaEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorDaEntrada.gridx = 0;
		gbc_lblValorDaEntrada.gridy = 4;
		frmSimuladorDeFinanciamento.getContentPane().add(lblValorDaEntrada, gbc_lblValorDaEntrada);
		
		textField_VLENTR = new JTextField();
		textField_VLENTR.setColumns(10);
		GridBagConstraints gbc_textField_VLENTR = new GridBagConstraints();
		gbc_textField_VLENTR.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLENTR.insets = new Insets(0, 0, 5, 5);
		gbc_textField_VLENTR.gridx = 1;
		gbc_textField_VLENTR.gridy = 4;
		frmSimuladorDeFinanciamento.getContentPane().add(textField_VLENTR, gbc_textField_VLENTR);
		
		JLabel lblNmeroDePrestaes = new JLabel("NUMERO DE PRESTACOES:  ");
		lblNmeroDePrestaes.setLabelFor(frmSimuladorDeFinanciamento);
		lblNmeroDePrestaes.setHorizontalAlignment(SwingConstants.LEFT);
		lblNmeroDePrestaes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNmeroDePrestaes = new GridBagConstraints();
		gbc_lblNmeroDePrestaes.anchor = GridBagConstraints.WEST;
		gbc_lblNmeroDePrestaes.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDePrestaes.gridx = 0;
		gbc_lblNmeroDePrestaes.gridy = 5;
		frmSimuladorDeFinanciamento.getContentPane().add(lblNmeroDePrestaes, gbc_lblNmeroDePrestaes);
		
		textField_VLPREST = new JTextField();
		textField_VLPREST.setColumns(10);
		GridBagConstraints gbc_textField_VLPREST = new GridBagConstraints();
		gbc_textField_VLPREST.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLPREST.insets = new Insets(0, 0, 5, 5);
		gbc_textField_VLPREST.gridx = 1;
		gbc_textField_VLPREST.gridy = 5;
		frmSimuladorDeFinanciamento.getContentPane().add(textField_VLPREST, gbc_textField_VLPREST);
		
		JLabel lblTaxaDeJuros = new JLabel("TAXA DE JUROS:  ");
		lblTaxaDeJuros.setLabelFor(frmSimuladorDeFinanciamento);
		lblTaxaDeJuros.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaxaDeJuros.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTaxaDeJuros = new GridBagConstraints();
		gbc_lblTaxaDeJuros.anchor = GridBagConstraints.WEST;
		gbc_lblTaxaDeJuros.insets = new Insets(0, 0, 5, 5);
		gbc_lblTaxaDeJuros.gridx = 0;
		gbc_lblTaxaDeJuros.gridy = 6;
		frmSimuladorDeFinanciamento.getContentPane().add(lblTaxaDeJuros, gbc_lblTaxaDeJuros);
		
		textField_VLTAXAJ = new JTextField();
		GridBagConstraints gbc_textField_VLTAXAJ = new GridBagConstraints();
		gbc_textField_VLTAXAJ.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_VLTAXAJ.insets = new Insets(0, 0, 5, 5);
		gbc_textField_VLTAXAJ.gridx = 1;
		gbc_textField_VLTAXAJ.gridy = 6;
		frmSimuladorDeFinanciamento.getContentPane().add(textField_VLTAXAJ, gbc_textField_VLTAXAJ);
		textField_VLTAXAJ.setColumns(10);
		
		JLabel lblRendaMensalBruta = new JLabel("RENDA MENSAL BRUTA:  ");
		lblRendaMensalBruta.setLabelFor(frmSimuladorDeFinanciamento);
		lblRendaMensalBruta.setHorizontalAlignment(SwingConstants.LEFT);
		lblRendaMensalBruta.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRendaMensalBruta = new GridBagConstraints();
		gbc_lblRendaMensalBruta.anchor = GridBagConstraints.WEST;
		gbc_lblRendaMensalBruta.insets = new Insets(0, 0, 5, 5);
		gbc_lblRendaMensalBruta.gridx = 0;
		gbc_lblRendaMensalBruta.gridy = 7;
		frmSimuladorDeFinanciamento.getContentPane().add(lblRendaMensalBruta, gbc_lblRendaMensalBruta);
		
		textField_RENDA = new JTextField();
		GridBagConstraints gbc_textField_RENDA = new GridBagConstraints();
		gbc_textField_RENDA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_RENDA.insets = new Insets(0, 0, 5, 5);
		gbc_textField_RENDA.gridx = 1;
		gbc_textField_RENDA.gridy = 7;
		frmSimuladorDeFinanciamento.getContentPane().add(textField_RENDA, gbc_textField_RENDA);
		
		JButton btnSimular = new JButton("SIMULAR");
		GridBagConstraints gbc_btnSimular = new GridBagConstraints();
		gbc_btnSimular.anchor = GridBagConstraints.EAST;
		gbc_btnSimular.insets = new Insets(0, 0, 0, 5);
		gbc_btnSimular.gridx = 0;
		gbc_btnSimular.gridy = 12;
		frmSimuladorDeFinanciamento.getContentPane().add(btnSimular, gbc_btnSimular);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_VLVEIC.setText(null);  
				textField_VLENTR.setText(null); 
				textField_VLPREST.setText(null); 
				textField_VLTAXAJ.setText(null); 
				textField_RENDA.setText(null); 
				
			}
		});
		GridBagConstraints gbc_btnLimpar = new GridBagConstraints();
		gbc_btnLimpar.insets = new Insets(0, 0, 0, 5);
		gbc_btnLimpar.gridx = 1;
		gbc_btnLimpar.gridy = 12;
		frmSimuladorDeFinanciamento.getContentPane().add(btnLimpar, gbc_btnLimpar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							 
				int opcao ; 
				opcao=JOptionPane.showConfirmDialog(null,"DESEJA FECHAR A JANELA DE SIMULAÇÃO? ","",JOptionPane.YES_NO_OPTION); 
				if(opcao==JOptionPane.YES_OPTION) 
				System.exit(0); 

				} 
			
					
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.WEST;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 12;
		frmSimuladorDeFinanciamento.getContentPane().add(btnCancelar, gbc_btnCancelar);
						
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
