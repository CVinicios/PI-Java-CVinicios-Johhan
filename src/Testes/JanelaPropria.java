package testes;

import javax.swing.*;

public class JanelaPropria extends JFrame
{
	JPanel painel;
	JLabel lblHello;
	
	
	public JanelaPropria()
	{
		//Cria Elementos
		JPanel painel = new JPanel();
		JLabel lbl_hello =  new JLabel("PI Java");
		//Conecta os elemtnos
		painel.add(lbl_hello);
		setContentPane(painel);
		//Exibe janela
		setSize(800,600);
		setVisible(true);
	}
	
}
