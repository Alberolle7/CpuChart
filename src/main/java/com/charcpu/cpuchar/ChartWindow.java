package com.charcpu.cpuchar;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class ChartWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model1;
	private ArrayList<ProgramaFcFs> listaProgramasFcFs;
	private ArrayList<ProgramaSFJ> listaProgramasSFJ;
	
	private int maxCicle;
	private JTableChart table2;
	private DefaultTableModel model2;

	
	/**
	 * Create the frame.
	 */
	public ChartWindow() {

		super("Datos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 792, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ImageIcon img = new ImageIcon("C:/Users/alber/eclipse-workspace/CpuChart/src/main/java/com/charcpu/cpuchar/icon.png");
		setIconImage(img.getImage());
		
		JTabbedPane pestanas = new JTabbedPane();

		// panel1 
		JPanel panel1 = new JPanel();
		table = new JTableChart() ;
		model1 = new DefaultTableModel();	
		table.setModel(model1);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(10, 11, 741, 372);
		sp.setVisible(true);
		
		panel1.setLayout(null);
		panel1.add(sp);
		panel1.setSize(500, 200);	
		panel1.setVisible(true);
		
		pestanas.addTab("Algoritmo FcFs", panel1);

		// panel2
		JPanel panel2 = new JPanel();
		pestanas.addTab("Panel 2", panel2);		
		table2 = new JTableChart() ;
		model2 = new DefaultTableModel();	
		table2.setModel(model2);
		JScrollPane sp2 = new JScrollPane(table2);
		sp2.setBounds(10, 11, 741, 372);
		sp2.setVisible(true);
		
		panel2.setLayout(null);
		panel2.add(sp2);
		panel2.setSize(500, 200);	
		panel2.setVisible(true);
		
		panel2.add(sp2);
		
		pestanas.addTab("Algoritmo SFJ", panel2);
		
		// panel3
		JPanel panel3 = new JPanel();

		
		JLabel et_p3 = new JLabel("Panel 3");
		panel3.add(et_p3);

		pestanas.addTab("Panel 3", panel3);

		
		getContentPane().add(pestanas);
		
		setVisible(true);

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
	
	
	}
	
	public void addSFJData(ArrayList<ProgramaSFJ> listaProgramasSFJ, int maxCicle) {

		this.listaProgramasSFJ = listaProgramasSFJ;
		this.maxCicle = maxCicle;
			
		model2.addColumn("Name");

		for (int i = 0; i < maxCicle ; i++) {
			model2.addColumn(i);
		}

		for (Iterator iterator = this.listaProgramasSFJ.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			
			Vector<String> r = new Vector<String>();
			
			r.addElement(programa.getName());
			for (int i = 0; i < maxCicle; i++) {
				r.addElement(Character.toString(programa.getCicleData(i)));
			}
		
			model2.addRow(r);

		}
	
	
	}


}
