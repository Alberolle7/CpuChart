package com.charcpu.cpuchar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
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

public class Builder {

	private JFrame frame;

	
	private JPanel mainPanel;
	private JTable table;
	private DefaultTableModel model_table;
	private JScrollPane scroll_table;
	private JTextPane txtpnHolaQueTal;
	private JTextPane txtpnIntroduceCuantosProgramas;
	private JTextField textField;

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
		  mainPanel.setBounds(80, 119, 472, 438);

		    
		    
		    txtpnHolaQueTal = new JTextPane();
		    txtpnHolaQueTal.setFont(new Font("Segoe Print", Font.PLAIN, 42));
		    txtpnHolaQueTal.setEditable(false);
		    txtpnHolaQueTal.setText("CPU Graph");
		    txtpnHolaQueTal.setBounds(162, 11, 292, 67);
		    frame.getContentPane().add(txtpnHolaQueTal);
		    
		    txtpnIntroduceCuantosProgramas = new JTextPane();
		    txtpnIntroduceCuantosProgramas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    txtpnIntroduceCuantosProgramas.setText("Introduce cuantos programas quieres simular:");
		    txtpnIntroduceCuantosProgramas.setBounds(95, 89, 292, 20);
		    frame.getContentPane().add(txtpnIntroduceCuantosProgramas);
		    
		    textField = new JTextField();
		    textField.setBounds(397, 89, 73, 20);
		    frame.getContentPane().add(textField);
			table = new JTable();
		    
		    model_table = new DefaultTableModel();
		    model_table.addColumn("id");
		    model_table.addColumn("Duracion");
		    model_table.addColumn("Ciclo Entrada");
		   
		    table.setModel(model_table);

		
		    for(int i=0;i<1000;i++){                             
		           Vector<String> r  = new Vector<String>();
		            r.addElement(Character.toString((char)(97 + i)));
		            r.addElement("");
		            r.addElement("");
		           
		            model_table.addRow(r);
		    } 

		    scroll_table = new JScrollPane(table);            
		    scroll_table.setBounds(5, 10, 300, 150);
		    scroll_table.setVisible(true);

		   
		    mainPanel.add(scroll_table);
		    frame.getContentPane().add(mainPanel);
		    
		    JButton btnNewButton = new JButton("Validar");
		    btnNewButton.setBounds(486, 89, 89, 23);
		    frame.getContentPane().add(btnNewButton);
		    frame.setPreferredSize(new Dimension(1000,1000));
		    btnNewButton.addActionListener(new ActionListener() {

		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	createInputTable();
		        }
		    });

	}
	
	private void createInputTable() {
		

	}
	
	
	private void testMetodo() {
		
	}
}