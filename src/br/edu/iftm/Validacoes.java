package br.edu.iftm;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

	

public final class Validacoes extends JTextField { 
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int maximoCaracteres=-1;// definição de -1, pois o valor normal de um textfield é sem limite de caracters 
		
		public Validacoes() { 
			super(); 
			addKeyListener(new java.awt.event.KeyAdapter() { 
		
		@Override 
		public void keyTyped(java.awt.event.KeyEvent evt) { 
			JTextFieldKeyTyped(evt);
			}

		private void JTextFieldKeyTyped(KeyEvent evt) {
			// TODO Auto-generated method stub
			
		}
	}); 
} 
		
		private void addKeyListener(KeyAdapter keyAdapter) {
			// TODO Auto-generated method stub
			
		}

		public void JtextFieldSomenteLetras(int maximo) { 
			//super(); 
			setMaximoCaracteres(maximo);// define o tamanho máximo que deve ser aceito no jtextfield que foi recebido no construtor 
			addKeyListener(new java.awt.event.KeyAdapter() { 
				
				
				
		@Override 
		public void keyTyped(java.awt.event.KeyEvent evt) { 
			jTextFieldKeyTyped(evt);
			}
		}); 
	} 
		
		private void jTextFieldKeyTyped(KeyEvent evt) { 
			String caracteres="0987654321"; // lista de caracters que não devem ser aceitos 
			if(!caracteres.contains(evt.getKeyChar()+"")){ // se o caracter que gerou o evento não estiver na lista 
				evt.consume();//aciona esse propriedade para eliminar a ação do evento 
				} 
			
			//if para saber se precisa verificar também o tamanho da string do campo maior ou igual ao tamanho máximo, cancela e nao deixa inserir mais
			if((getText().length()>=getMaximoCaracteres())&&(getMaximoCaracteres()!=-1)){ 
						 
				evt.consume(); 
				
				// esta linha acima é para remover os caracters inválidos caso o usuário tenha copiado o conteúdo de algum lugar, ou seja, com tamanho maior que o definido	
				setText(getText().substring(0,getMaximoCaracteres())); 
					 
			} //fim do if do tamanho da string do campo 
		}
		
		public int getMaximoCaracteres() { 
			return maximoCaracteres; 
			} 
		
		public void setMaximoCaracteres(int maximoCaracteres) { 
			this.maximoCaracteres = maximoCaracteres; 
			} 
	}
	

