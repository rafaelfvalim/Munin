package br.com.munin.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class Munin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Munin window = new Munin();
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
	public Munin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1108, 691);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 287, 630);
		frame.getContentPane().add(panel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(307, 11, 775, 630);
		frame.getContentPane().add(tabbedPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Ticket", null, panel_1, null);
		panel_1.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 231, 20);
		panel_1.add(comboBox);

		JLabel lblCliente = new JLabel("Cliente :");
		lblCliente.setBounds(10, 11, 46, 14);
		panel_1.add(lblCliente);

		JLabel lblPrioridade = new JLabel("Prioridade :");
		lblPrioridade.setBounds(251, 11, 104, 14);
		panel_1.add(lblPrioridade);
		String status[] = { " ", "Em Atendimento", "Aguarando Cliente", "Aguardando", "Encerrado" };
		JComboBox comboBox_1 = new JComboBox(status);
		comboBox_1.setBounds(251, 36, 181, 20);
		panel_1.add(comboBox_1);

		JLabel lblNumeroDoTicket = new JLabel("Numero do Ticket :");
		lblNumeroDoTicket.setBounds(10, 66, 158, 14);
		panel_1.add(lblNumeroDoTicket);

		textField = new JTextField();
		textField.setBounds(10, 91, 234, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblStatus = new JLabel("Status :");
		lblStatus.setBounds(251, 67, 46, 14);
		panel_1.add(lblStatus);

		textField_1 = new JTextField();
		textField_1.setBounds(251, 91, 181, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 178, 174, 14);
		panel_1.add(lblDescrio);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 203, 422, 73);
		panel_1.add(textPane);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 287, 89, 23);
		panel_1.add(btnSalvar);

		JButton btnCriarTrello = new JButton("Criar Trello");
		btnCriarTrello.setBounds(208, 287, 89, 23);
		panel_1.add(btnCriarTrello);

		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(10, 122, 46, 14);
		panel_1.add(lblTitulo);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 147, 422, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblQuadro = new JLabel("Quadro :");
		lblQuadro.setBounds(442, 11, 66, 14);
		panel_1.add(lblQuadro);

		textField_3 = new JTextField();
		textField_3.setBounds(442, 36, 181, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblLista = new JLabel("Lista :");
		lblLista.setBounds(442, 66, 46, 14);
		panel_1.add(lblLista);

		textField_4 = new JTextField();
		textField_4.setBounds(442, 91, 181, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(109, 287, 89, 23);
		panel_1.add(btnRefresh);
		
		JLabel lblCard = new JLabel("Card:");
		lblCard.setBounds(442, 122, 46, 14);
		panel_1.add(lblCard);
		
		textField_5 = new JTextField();
		textField_5.setBounds(442, 147, 181, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(442, 203, 181, 20);
		panel_1.add(comboBox_2);
		
		JLabel lblAtribuido = new JLabel("Atribuido \u00E1:");
		lblAtribuido.setBounds(442, 178, 96, 14);
		panel_1.add(lblAtribuido);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Lista de Tickects", null, panel_2, null);
		panel_2.setLayout(null);

		table = new JTable();
		table.setBounds(10, 48, 750, 543);
		panel_2.add(table);

		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(10, 11, 89, 23);
		panel_2.add(btnAbrir);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cadastros", null, panel_3, null);
		panel_3.setLayout(null);

		JButton btnClientes = new JButton("Clientes");
		btnClientes.setBounds(10, 29, 89, 23);
		panel_3.add(btnClientes);
	}
}
