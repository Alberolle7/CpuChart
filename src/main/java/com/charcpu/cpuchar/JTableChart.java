package com.charcpu.cpuchar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class JTableChart extends JTable {
	

	public JTableChart() {
		super();
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//table.getTableHeader().setUI(null);
		//table.setBounds(30, 40, 200, 300);
		this.setShowGrid(false);
		this.setIntercellSpacing(new Dimension(0, 0));
		
	}

	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
		Component comp = super.prepareRenderer(renderer, row, col);
		Object value = getModel().getValueAt(row, col);
		if(value == null)
			return comp;
		if (value.equals("x")) {
			comp.setBackground(Color.red);
		} else if (value.equals("_")) {
			comp.setBackground(Color.gray);
		} else {
			comp.setBackground(Color.white);
		}
		return comp;
	}
}
