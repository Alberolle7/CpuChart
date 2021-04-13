package com.charcpu.cpuchar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class ChartWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChartWindow frame = new ChartWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChartWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	       //Creamos el conjunto de pestañas
        JTabbedPane pestañas=new JTabbedPane();
 
        //Creamos el panel y lo añadimos a las pestañas
        JPanel panel1=new JPanel();
 
        //Componentes del panel1
        JLabel et_p1=new JLabel("Estas en el panel 1");
        panel1.add(et_p1);
 
        //Añadimos un nombre de la pestaña y el panel
        pestañas.addTab("Panel 1", panel1);
 
        //Realizamos lo mismo con el resto
        JPanel panel2=new JPanel();
        pestañas.addTab("Panel 2", panel2);
 
        //Componentes del panel2
        JLabel et_p2=new JLabel("Estas en el panel 2");
        panel2.add(et_p2);
 
        JPanel panel3=new JPanel();
 
        //Componentes del panel3
        JLabel et_p3=new JLabel("Estas en el panel 3");
        panel3.add(et_p3);
 
        pestañas.addTab("Panel 3", panel3);
 
 
 
        getContentPane().add(pestañas);
	}

}
