package Testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Index extends JFrame
{
	JButton adicionar;
	/*
	JButton remover;
	JButton pesquisar;
	JButton buscar;
	JButton listar;
	*/
	JButton sair;
	JPanel painel;
	
	public Index()
	{
	
		adicionar = new JButton("Adicionar");
		adicionar.setLocation(20, 20);
		adicionar.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ev){JOptionPane.showMessageDialog(null, "Adicionar?");}});
		sair  = new JButton("Sair");
		sair.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ev){System.exit(1);}});
		
		painel = new JPanel();
		painel.add(adicionar);
		painel.add(sair);
		
		
		
		setContentPane(painel);
		setSize(200,600);
		setVisible(true);	
	}
}





/*
remover  = new JButton("Remover");
remover.setPreferredSize(new Dimension(180, 20));
pesquisar  = new JButton("Pesquisar");
pesquisar.setPreferredSize(new Dimension(180, 20));
buscar  = new JButton("Buscar");
buscar.setPreferredSize(new Dimension(180, 20));
listar  = new JButton("Listar");
listar.setPreferredSize(new Dimension(180, 20));
sair  = new JButton("Sair");
sair.setPreferredSize(new Dimension(180, 20));


painel.setLayout(new FlowLayout());
painel.add(adicionar,BorderLayout.CENTER);
painel.add(remover,BorderLayout.WEST);
painel.add(pesquisar,BorderLayout.WEST);
painel.add(buscar,BorderLayout.WEST);
painel.add(listar,BorderLayout.WEST);
painel.add(sair,BorderLayout.WEST);
*/