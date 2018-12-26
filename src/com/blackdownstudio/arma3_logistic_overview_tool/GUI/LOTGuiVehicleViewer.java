package com.blackdownstudio.arma3_logistic_overview_tool.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class LOTGuiVehicleViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void VehicleViewerGui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOTGuiVehicleViewer frame = new LOTGuiVehicleViewer();
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
	public LOTGuiVehicleViewer() {
		setTitle("LOT - Vehicle Viewer");
		setAlwaysOnTop(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\workspace\\arma 3 logistic overview tool (lot)\\Icons\\logo-lot.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}

}
