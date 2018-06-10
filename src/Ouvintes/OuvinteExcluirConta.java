package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Facade;
import View.JanelaListarVagas;

public class OuvinteExcluirConta implements ActionListener{
	private int id;
	private JFrame janela;


	public OuvinteExcluirConta(JFrame janela,int id) {
		this.janela = janela;
		this.id=id;
	}

	public void actionPerformed(ActionEvent arg0) {
		int confirm=JOptionPane.showConfirmDialog(null, "Deseja excluir sua conta?");
		if(confirm==0) {
			Facade.getFacade().excluirConta(id);
			janela.dispose();
			new JanelaListarVagas();
		}else {
			
		}
	}

}
