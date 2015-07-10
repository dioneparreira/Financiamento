package br.edu.iftm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;


public class Menu {

	private JFrame frame_Menu;
	
	JMenuBar Barra_Menu;
	JMenu Menu_simulador;
	JMenuItem financiamento, sair;
	private JDesktopPane desktopPane_Princ;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame_Menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
	}

	 /**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_Menu = new JFrame();
		frame_Menu.setBounds(100, 100, 791, 499);
		frame_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//inserindo menu
		JMenuBar Barra_Menu = new JMenuBar();
		frame_Menu.setJMenuBar(Barra_Menu);
		Menu_simulador = new JMenu("Início");
		Menu_simulador.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Barra_Menu.add(Menu_simulador);
		
		financiamento = new JMenuItem("Simular Financiamento");
		financiamento.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				SimulaFinan obj = new SimulaFinan();
				desktopPane_Princ.add(obj);
				obj.setVisible(true);
				
			}
		});
		
		financiamento.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Menu_simulador.add(financiamento);
		Menu_simulador.addSeparator();
		
		
		sair = new JMenuItem("Sair");
		sair.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Menu_simulador.add(sair);
		
		desktopPane_Princ = new JDesktopPane();
		frame_Menu.getContentPane().add(desktopPane_Princ, BorderLayout.CENTER);
		
		
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int opcao ; 
				opcao=JOptionPane.showConfirmDialog(null,"DESEJA SAIR DO APLICATIVO? ","",JOptionPane.YES_NO_OPTION); 
				if(opcao==JOptionPane.YES_OPTION) 
				System.exit(0); 
						
			}
		});
	}
		
}
