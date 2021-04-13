package com.charcpu.cpuchar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class ChartWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model1;
	private ArrayList<ProgramaFcFs> listaProgramasFcFs;
	private ChartWindow frame;
	private int maxCicle;

	
	/**
	 * Create the frame.
	 */
	public ChartWindow() {

		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// Creamos el conjunto de pestañas
		JTabbedPane pestañas = new JTabbedPane();

		// Creamos el panel y lo añadimos a las pestañas
		JPanel panel1 = new JPanel();

		table = new JTableChart() ;

		model1 = new DefaultTableModel();
		// table.setTableHeader(null);

		table.setModel(model1);
		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(10, 11, 741, 372);
		
		
		sp.setVisible(true);
		panel1.setLayout(null);

		panel1.add(sp);

		// Frame Size
		panel1.setSize(500, 200);
		// Frame Visible = true
		panel1.setVisible(true);

		// Añadimos un nombre de la pestaña y el panel
		pestañas.addTab("Panel 1", panel1);

		// Realizamos lo mismo con el resto
		JPanel panel2 = new JPanel();
		pestañas.addTab("Panel 2", panel2);

		// Componentes del panel2
		JLabel et_p2 = new JLabel("Estas en el panel 2");
		panel2.add(et_p2);

		JPanel panel3 = new JPanel();

		// Componentes del panel3
		JLabel et_p3 = new JLabel("Estas en el panel 3");
		panel3.add(et_p3);

		pestañas.addTab("Panel 3", panel3);

		
		getContentPane().add(pestañas);

	}

	public void addFcFsData(ArrayList<ProgramaFcFs> listaProgramasFcFs, int maxCicle) {

		this.listaProgramasFcFs = listaProgramasFcFs;
		this.maxCicle = maxCicle;
			
		model1.addColumn("Name");

		for (int i = 0; i < maxCicle ; i++) {
			model1.addColumn(i);
		}

		for (Iterator iterator = this.listaProgramasFcFs.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			
			Vector<String> r = new Vector<String>();
			
			r.addElement(programa.getName());
			for (int i = 0; i < maxCicle; i++) {
				r.addElement(Character.toString(programa.getCicleData(i)));
			}
		
			model1.addRow(r);

		}
	
		 setJTableColumnsWidth(table, 20); 
	}

	private static void setJTableColumnsWidth(JTable table, int tablePreferredWidth) {
		double total = 0;
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			total += 20;
		}

		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth((int) (20 * (20 / total)));
		}
	}
}
