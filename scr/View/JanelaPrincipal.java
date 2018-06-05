package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Cursor;


import Ouvintes.OuvinteJanelaCadastro;
import Ouvintes.OuvinteJanelaLogin;
import Ouvintes.OuvinteListaEscolas;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
<<<<<<< HEAD
=======
>>>>>>> 68d62452ec5efd5aec2a63989072d31d80bb09d9
=======
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;

import Controllers.EscolaController;
import Controllers.TurmaController;
import Model.Escola;
import Model.Facade;
import Model.Turma;
<<<<<<< HEAD

=======
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753

public class JanelaPrincipal {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel modelo;
	private JComboBox escolaComboBox = null;
	private JComboBox TurmacomboBox = null;
	private JComboBox TurnocomboBox = null;
<<<<<<< HEAD
	private String[] turnos = { "","MANHA", "TARDE", "INTEGRAL", "NOITE" };
=======
	private String[] turnos = { "","MANHÃ", "TARDE", "INTEGRAL", "NOITE" };
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
	private List<Escola> escolas;
	private String[] arrayturmas = { "","1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°",
			"9°" };
	private List<Turma> turma;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					// UIManager.setLookAndFeel(new AeroLookAndFeel());
					 UIManager.setLookAndFeel(new BernsteinLookAndFeel());
<<<<<<< HEAD
=======
				UIManager.setLookAndFeel(new BernsteinLookAndFeel());

>>>>>>> 68d62452ec5efd5aec2a63989072d31d80bb09d9
=======
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753

					JanelaPrincipal window = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
<<<<<<< HEAD
//		frame.getContentPane().setBackground(new Color(255, 127, 39));
=======
		frame.getContentPane().setBackground(new Color(255, 153, 51));
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
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

		JLabel lblEscola = new JLabel("Escola:");
		lblEscola.setFont(new Font("Arial", Font.BOLD, 14));
		lblEscola.setBounds(10, 49, 77, 14);
		frame.getContentPane().add(lblEscola);

		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setFont(new Font("Arial", Font.BOLD, 14));
		lblTurma.setBounds(10, 74, 60, 14);
		frame.getContentPane().add(lblTurma);

		escolaComboBox = new JComboBox<>();
<<<<<<< HEAD
		escolaComboBox.setBounds(63, 47, 283, 20);
=======
		escolaComboBox.setToolTipText("Selecione o nome da escola desejada");
		escolaComboBox.setBounds(72, 175, 301, 20);
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
		frame.getContentPane().add(escolaComboBox);

		escolas = EscolaController.getEscolaController().listar();

		for (Escola e : escolas) {
			escolaComboBox.addItem(e.getNome());
		}
		TurmacomboBox = new JComboBox(arrayturmas);
<<<<<<< HEAD
=======
		String[] arrayturmas = { "1° ano", "2° ano", "3° ano", "4° ano", "5° ano", " 6° ano", "7° ano", "8° ano",
				"9° ano" };
		JComboBox TurmacomboBox = new JComboBox(arrayturmas);
>>>>>>> 68d62452ec5efd5aec2a63989072d31d80bb09d9
=======
		TurmacomboBox.setBackground(Color.WHITE);
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753

		TurmacomboBox.setBounds(65, 72, 129, 20);
		frame.getContentPane().add(TurmacomboBox);

		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setFont(new Font("Arial", Font.BOLD, 14));
		lblTurno.setBounds(204, 74, 46, 14);
		frame.getContentPane().add(lblTurno);
		TurnocomboBox = new JComboBox(turnos);
<<<<<<< HEAD
		TurnocomboBox.setBounds(262, 72, 84, 20);
=======
		TurnocomboBox.setBounds(289, 212, 84, 20);
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
		frame.getContentPane().add(TurnocomboBox);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
<<<<<<< HEAD
		btnPesquisar.setBounds(396, 49, 109, 42);
=======
		btnPesquisar.setBounds(425, 177, 109, 42);
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
		OuvintePesquisar1 pesquisar = new OuvintePesquisar1(this.frame);
		btnPesquisar.addActionListener(pesquisar);
		frame.getContentPane().add(btnPesquisar);
		frame.setVisible(true);

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
		modelo = new DefaultTableModel();

		modelo.addColumn("Turmas");
		
//		List<Turma> list = TurmaController.getTurmaController().listar();
//		for (Turma e : list) {
//			Object[] array = new Object[1];
//			array[0] = e.toStringPrincipal();
//			modelo.addRow(array);
//		}

		table = new JTable(modelo);

		JScrollPane painelTabela = new JScrollPane(table);
<<<<<<< HEAD
		painelTabela.setBounds(50, 150, 450, 250);
		painelTabela.setBackground(new Color(255, 127, 39));
		frame.getContentPane().add(painelTabela);
=======
		painelTabela.setBounds(10, 239, 524, 250);
		frame.getContentPane().add(painelTabela);
		
		JLabel lblBemVindo = new JLabel("BEM- VINDO!");
		lblBemVindo.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblBemVindo.setBackground(Color.BLACK);
		lblBemVindo.setBounds(170, 58, 233, 35);
		frame.getContentPane().add(lblBemVindo);
		
		JLabel lblSistemaDeAcompanhamento = new JLabel("Sistema de Acompanhamento de Vagas nas Escolas");
		lblSistemaDeAcompanhamento.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblSistemaDeAcompanhamento.setBounds(10, 0, 524, 66);
		frame.getContentPane().add(lblSistemaDeAcompanhamento);
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753

	} 
	public ArrayList<String> retornaValores(){
		ArrayList<String> array=new ArrayList<>();
		array.add(arrayturmas[TurmacomboBox.getSelectedIndex()]);
		array.add(turnos[TurnocomboBox.getSelectedIndex()]);
		array.add(escolas.get(escolaComboBox.getSelectedIndex()).getNome());
		return array;
		
	}
	public String[] getTurnos() {
		return turnos;
	}

	public void setTurnos(String[] turnos) {
		this.turnos = turnos;
	}

	
	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

	public List<Escola> getEscolas() {
		return escolas;
	}

	public void setEscolas(List<Escola> escolas) {
		this.escolas = escolas;
	}

	public String[] getArrayturmas() {
		return arrayturmas;
	}
	

	public void setArrayturmas(String[] arrayturmas) {
		this.arrayturmas = arrayturmas;
<<<<<<< HEAD
=======

>>>>>>> 68d62452ec5efd5aec2a63989072d31d80bb09d9
=======
>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	public JComboBox getEscolaComboBox() {
		return escolaComboBox;
	}

	public void setEscolaComboBox(JComboBox escolaComboBox) {
		this.escolaComboBox = escolaComboBox;
	}

	public JComboBox getTurmacomboBox() {
		return TurmacomboBox;
	}

	public void setTurmacomboBox(JComboBox turmacomboBox) {
		TurmacomboBox = turmacomboBox;
	}

	public JComboBox getTurnocomboBox() {
		return TurnocomboBox;
	}

	public void setTurnocomboBox(JComboBox turnocomboBox) {
		TurnocomboBox = turnocomboBox;
	}

	public class OuvintePesquisar1 implements ActionListener {
		private JFrame janela;

		public OuvintePesquisar1(JFrame janela) {
			this.janela = janela;
		}

		public void actionPerformed(ActionEvent e) {

			List<Turma> list = TurmaController.getTurmaController().listar();
			ArrayList<String> resul=retornaValores();

//			System.out.println(resul.get(1));
//			System.out.println(resul.get(2));
			Object[] array = new Object[1];
			for (Turma es : list) {
				//System.out.println(es.getNome().substring(0, 1));
				
				//System.out.println(es.getEscola().getNome());
				//System.out.println(resul.get(0).substring(0,1));
				//System.out.println(es.getNome().substring(0, 1)) ;
				//System.out.println(resul.get(1).substring(0,1).equals(es.getTurno().substring(0,1) ));
				System.out.println(resul.get(2).equals(es.getEscola().getNome() ));
				//selecionando com todos os campos 
				if(resul.get(2).equalsIgnoreCase(es.getEscola().getNome())) {
					if(resul.get(1).equalsIgnoreCase(es.getTurno()) && resul.get(0).substring(0,1).equals(es.getNome().substring(0,1))){
						System.out.println(
								"vbdbçf"+resul.get(0));
						array[0] = "Escola : "+es.getEscola().getNome()+es.toString();
						modelo.addRow(array);
					}	
//				}else if((resul.get(1).equalsIgnoreCase(es.getTurno()))){
//					 
//						array[0] = "Escola: "+es.getEscola().getNome()+es.toString();
//						modelo.addRow(array);
					
				}
				}
				
				
			}

		}
	}
<<<<<<< HEAD
}
=======

>>>>>>> 93c1ea970f902be2327c385a4fc70ad97040e753
