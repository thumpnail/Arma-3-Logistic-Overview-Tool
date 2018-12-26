package com.blackdownstudio.arma3_logistic_overview_tool.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class LOTGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void GuiMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOTGui frame = new LOTGui();
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
	public LOTGui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\workspace\\arma 3 logistic overview tool (lot)\\Icons\\logo-lot.png"));
		setTitle("LOT - Arma3 Logistics Overview Tool");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnOrderViewer = new JButton("Order Viewer");
		btnOrderViewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOTGuiOrderViewer orderViewerGui = new LOTGuiOrderViewer();
				orderViewerGui.GuiOrderViewer();
			}
		});
		btnOrderViewer.setBounds(10, 11, 378, 50);
		contentPane.add(btnOrderViewer);
		
		JButton btnStorgeViewer = new JButton("Storge Viewer");
		btnStorgeViewer.setIcon(null);
		btnStorgeViewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOTGuiStorgeViewer storgeViewerGui = new LOTGuiStorgeViewer();
				storgeViewerGui.GuiStorge();
			}
		});
		btnStorgeViewer.setBounds(416, 11, 378, 50);
		contentPane.add(btnStorgeViewer);
		
		JButton btnForcesViewer = new JButton("Forces Viewer");
		btnForcesViewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOTGuiForcesViewer forcesViewerGui = new LOTGuiForcesViewer();
				forcesViewerGui.ForcesViewerGui();
			}
		});
		btnForcesViewer.setBounds(10, 72, 378, 50);
		contentPane.add(btnForcesViewer);
		
		JButton btnVehicleViewer = new JButton("Vehicle Viewer");
		btnVehicleViewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOTGuiVehicleViewer vehicleViewerGui = new LOTGuiVehicleViewer();
				vehicleViewerGui.VehicleViewerGui();
			}
		});
		btnVehicleViewer.setBounds(416, 72, 378, 50);
		contentPane.add(btnVehicleViewer);
		
		JButton btnLiner = new JButton("5 Liner");
		btnLiner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOTGuiOrder orderGui = new LOTGuiOrder();
				orderGui.LOTGuiOrder();
			}
		});
		btnLiner.setBounds(10, 133, 240, 50);
		contentPane.add(btnLiner);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(554, 133, 240, 50);
		contentPane.add(btnExit);
		
		JButton button = new JButton("New button");
		button.setBounds(283, 133, 240, 50);
		contentPane.add(button);
	}

}
