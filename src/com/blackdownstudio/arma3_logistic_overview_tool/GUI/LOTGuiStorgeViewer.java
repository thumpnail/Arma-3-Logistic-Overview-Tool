package com.blackdownstudio.arma3_logistic_overview_tool.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class LOTGuiStorgeViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void GuiStorge() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOTGuiStorgeViewer frame = new LOTGuiStorgeViewer();
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
	public LOTGuiStorgeViewer() {
		setTitle("LOT - Storge Viewer");
		setAlwaysOnTop(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\workspace\\arma 3 logistic overview tool (lot)\\Icons\\logo-lot.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 663, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}

}
