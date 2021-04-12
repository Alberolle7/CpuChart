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

public class WindowBuilder {

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
					WindowBuilder window = new WindowBuilder();
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
	public WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1280, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		  mainPanel = new JPanel();
		  mainPanel.setBounds(99, 160, 472, 390);

		  
		    
		    txtpnHolaQueTal = new JTextPane();
		    txtpnHolaQueTal.setFont(new Font("Segoe Print", Font.PLAIN, 42));
		    txtpnHolaQueTal.setEditable(false);
		    txtpnHolaQueTal.setText("CPU Graph");
		    txtpnHolaQueTal.setBounds(162, 22, 292, 67);
		    frame.getContentPane().add(txtpnHolaQueTal);
		    
		    txtpnIntroduceCuantosProgramas = new JTextPane();
		    txtpnIntroduceCuantosProgramas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    txtpnIntroduceCuantosProgramas.setText("Introduce cuantos programas quieres simular:");
		    txtpnIntroduceCuantosProgramas.setBounds(99, 106, 292, 20);
		    frame.getContentPane().add(txtpnIntroduceCuantosProgramas);
		    
		    textField = new JTextField();
		    textField.setBounds(385, 106, 73, 20);
		    frame.getContentPane().add(textField);
		    textField.setColumns(10);
		    
		    JButton btnNewButton = new JButton("Validar");
		    btnNewButton.setBounds(468, 103, 89, 23);
		    
		    btnNewButton.addActionListener(new ActionListener() {

		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	createInputTable();
		        }
		    });
		    
		    frame.getContentPane().add(btnNewButton);
		    frame.setPreferredSize(new Dimension(1000,1000)); 
		    

	}
	
	private void createInputTable() {
		
		
		    table = new JTable();
		    model_table = new DefaultTableModel();
		    model_table.addColumn("id");
		    model_table.addColumn("Entrada");
		    model_table.addColumn("Duración");
		 
		    table.setModel(model_table);
		    
		    
		    
		   int inputNumber = Integer.parseInt(textField.getText());


		    for(int i=0;i<inputNumber;i++){                             
		           Vector<String> r  = new Vector<String>();
		            r.addElement( Character.toString((char)(97 + i)));
		            r.addElement("");
		            r.addElement("");
		            
		            model_table.addRow(r);
		    } 

		    scroll_table = new JScrollPane(table);            
		    scroll_table.setBounds(5, 10, 300, 150);
		    scroll_table.setVisible(true);
	
		   
		    mainPanel.add(scroll_table);
		    frame.getContentPane().add(mainPanel);
	}
	
	private void testMetodo() {
		
	}
}
