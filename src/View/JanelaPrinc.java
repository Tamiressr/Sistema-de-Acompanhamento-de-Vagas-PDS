package View;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;

import Ouvintes.OuvinteJanelaListarTurma;
import Ouvintes.OuvinteJanelaLogin;
import Ouvintes.OuvinteListaTurma;

import javax.swing.ImageIcon;
import java.awt.Color;

public class JanelaPrinc {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new BernsteinLookAndFeel());
					JanelaPrinc window = new JanelaPrinc();

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrinc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.getContentPane().setBackground(new Color(255, 153, 51));
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		frame.setTitle("Acompanhamento de Vagas");
		frame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.setBounds(100, 100, 550, 550);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setJMenuBar(Janela.setMenuBar(frame));
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton();
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.setText("Acesso\r\n\r\n");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.addActionListener(new OuvinteJanelaLogin(this.frame));
		btnLogin.setBounds(33, 416, 169, 70);
		frame.getContentPane().add(btnLogin);
		
		JButton btnVisualizarVagas = new JButton("Visualizar Vagas");
		btnVisualizarVagas.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnVisualizarVagas.setIcon(new ImageIcon(JanelaPrinc.class.getResource("/icons8-Search.png")));
		btnVisualizarVagas.setBounds(335, 416, 169, 70);
		btnVisualizarVagas.addActionListener(new OuvinteJanelaListarTurma(this.frame));
		frame.getContentPane().add(btnVisualizarVagas);
		
		JLabel lblBemvindo = new JLabel("Bem-Vindo!");
		lblBemvindo.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblBemvindo.setBounds(167, 60, 169, 46);
		frame.getContentPane().add(lblBemvindo);
		
		JLabel lblSistemaDeAcompanhamneto = new JLabel("SISTEMA DE ACOMPANHAMENTO DE VAGAS");
		lblSistemaDeAcompanhamneto.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblSistemaDeAcompanhamneto.setBounds(25, 11, 490, 49);
		frame.getContentPane().add(lblSistemaDeAcompanhamneto);
		
		JLabel lblEscola = new JLabel("ESCOLA");
		lblEscola.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEscola.setBounds(85, 117, 85, 30);
		frame.getContentPane().add(lblEscola);
		
		JLabel lblPais = new JLabel("PAIS");
		lblPais.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPais.setBounds(403, 119, 46, 42);
		frame.getContentPane().add(lblPais);
		
		JLabel lblIconescola = new JLabel("iconescola");
		lblIconescola.setIcon(new ImageIcon(JanelaPrinc.class.getResource("/if_School_65795.png")));
		lblIconescola.setBounds(0, 196, 258, 209);
		frame.getContentPane().add(lblIconescola);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(JanelaPrinc.class.getResource("/if_user_accounts_67352.png")));
		label.setBounds(309, 159, 225, 248);
		frame.getContentPane().add(label);

	}
	public JFrame getFrame() {
		return frame;
	}
	
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	private JFrame frame;
}