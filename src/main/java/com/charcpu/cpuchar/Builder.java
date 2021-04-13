package com.charcpu.cpuchar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Builder {

	private JFrame frame;

	private JPanel mainPanel;
	private JTable table;
	private DefaultTableModel model_table;
	private JScrollPane scroll_table;
	private JTextPane txtpnHolaQueTal;
	private JTextPane txtpnIntroduceCuantosProgramas;
	private JTextField textField;
	private JTextField textFieldQuantum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder window = new Builder();
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
	public Builder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 660, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(26, 141, 472, 438);

		txtpnHolaQueTal = new JTextPane();
		txtpnHolaQueTal.setFont(new Font("Segoe Print", Font.PLAIN, 42));
		txtpnHolaQueTal.setEditable(false);
		txtpnHolaQueTal.setText("CPU Graph");
		txtpnHolaQueTal.setBounds(26, 11, 292, 67);
		frame.getContentPane().add(txtpnHolaQueTal);

		txtpnIntroduceCuantosProgramas = new JTextPane();
		txtpnIntroduceCuantosProgramas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnIntroduceCuantosProgramas.setText("Introduce cuantos programas quieres simular:");
		txtpnIntroduceCuantosProgramas.setBounds(26, 110, 292, 20);
		frame.getContentPane().add(txtpnIntroduceCuantosProgramas);

		textField = new JTextField();
		textField.setBounds(325, 110, 65, 20);
		frame.getContentPane().add(textField);
		table = new JTable();

		model_table = new DefaultTableModel();
		model_table.addColumn("id");
		model_table.addColumn("Duracion");
		model_table.addColumn("Ciclo Entrada");

		table.setModel(model_table);

		scroll_table = new JScrollPane(table);
		scroll_table.setBounds(5, 10, 300, 150);
		scroll_table.setVisible(true);

		mainPanel.add(scroll_table);
		frame.getContentPane().add(mainPanel);

		JButton btnSendManyRows = new JButton("Validar");
		btnSendManyRows.setBounds(400, 110, 89, 23);
		frame.getContentPane().add(btnSendManyRows);

		JButton btnSendTableData = new JButton("Enviar");
		btnSendTableData.setBounds(522, 402, 89, 23);
		frame.getContentPane().add(btnSendTableData);

		JButton btnResetTableData = new JButton("Reset");
		btnResetTableData.setBounds(522, 452, 89, 23);
		frame.getContentPane().add(btnResetTableData);

		textFieldQuantum = new JTextField();
		textFieldQuantum.setBounds(522, 243, 86, 20);
		frame.getContentPane().add(textFieldQuantum);
		textFieldQuantum.setColumns(10);

		JTextPane txtpnQuantum = new JTextPane();
		txtpnQuantum.setText("Quantum");
		txtpnQuantum.setEditable(false);
		txtpnQuantum.setBounds(536, 225, 51, 20);
		frame.getContentPane().add(txtpnQuantum);
		frame.setPreferredSize(new Dimension(1000, 1000));
		btnSendManyRows.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createInputTable();
			}
		});

		btnSendTableData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadTableData();
			}
		});

	}

	private void createInputTable() {

		int inputValue = Integer.parseInt(textField.getText());

		model_table.setRowCount(0);

		for (int i = 0; i < inputValue; i++) {
			Vector<String> r = new Vector<String>();
			r.addElement(Character.toString((char) (97 + i)));
			r.addElement("");
			r.addElement("");

			model_table.addRow(r);
		}

		
	}

	private void loadTableData() {

		ArrayList<Programa> listaProgramas = new ArrayList<Programa>();

		for (int count = 0; count < model_table.getRowCount(); count++) {
			String inputName = model_table.getValueAt(count, 0).toString();
			int inputCicle = Integer.parseInt((String) model_table.getValueAt(count, 1));
			int startCicle = Integer.parseInt((String) model_table.getValueAt(count, 2));
			listaProgramas.add(new Programa(inputName, inputCicle, startCicle));
		}
		
		CpuDataGenerate CpuData = new CpuDataGenerate(listaProgramas);
		
	}
}