package com.blackdownstudio.arma3_logistic_overview_tool.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOTGuiForcesViewer extends JFrame {

	private JPanel contentPane;
	private JTextField txtWhite;
	private JTextField txtRed;
	private JTextField txtBlue;
	private JTextField txtGreen;
	private JTextField txtYellow;
	private JTextField txtWhite_1;
	private JTextField txtWhite_2;
	private JTextField txtWhite_3;
	private JTextField txtWhite_4;
	private JTextField txtWhite_5;
	private JTextField txtRed_1;
	private JTextField txtRed_2;
	private JTextField txtRed_3;
	private JTextField txtRed_4;
	private JTextField txtRed_5;
	private JTextField txtBlue_1;
	private JTextField txtBlue_2;
	private JTextField txtBlue_3;
	private JTextField txtBlue_4;
	private JTextField txtBlue_5;
	private JTextField txtGreen_1;
	private JTextField txtGreen_2;
	private JTextField txtGreen_3;
	private JTextField txtGreen_4;
	private JTextField txtGreen_5;
	private JTextField txtYellow_1;
	private JTextField txtYellow_2;
	private JTextField txtYellow_3;
	private JTextField txtYellow_4;
	private JTextField txtYellow_5;
	private JButton btnSave;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public void ForcesViewerGui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOTGuiForcesViewer frame = new LOTGuiForcesViewer();
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
	public LOTGuiForcesViewer() {
		setTitle("LOT - Forces Viewer");
		setAlwaysOnTop(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\workspace\\arma 3 logistic overview tool (lot)\\Icons\\logo-lot.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 495, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtWhite = new JTextField();
		txtWhite.setEditable(false);
		txtWhite.setText("White");
		txtWhite.setBounds(10, 11, 86, 20);
		contentPane.add(txtWhite);
		txtWhite.setColumns(10);
		
		txtRed = new JTextField();
		txtRed.setEditable(false);
		txtRed.setText("Red");
		txtRed.setBounds(106, 11, 86, 20);
		contentPane.add(txtRed);
		txtRed.setColumns(10);
		
		txtBlue = new JTextField();
		txtBlue.setEditable(false);
		txtBlue.setText("Blue");
		txtBlue.setBounds(202, 11, 86, 20);
		contentPane.add(txtBlue);
		txtBlue.setColumns(10);
		
		txtGreen = new JTextField();
		txtGreen.setEditable(false);
		txtGreen.setText("Green");
		txtGreen.setBounds(298, 11, 86, 20);
		contentPane.add(txtGreen);
		txtGreen.setColumns(10);
		
		txtYellow = new JTextField();
		txtYellow.setEditable(false);
		txtYellow.setText("Yellow");
		txtYellow.setBounds(394, 11, 86, 20);
		contentPane.add(txtYellow);
		txtYellow.setColumns(10);
		
		txtWhite_1 = new JTextField();
		txtWhite_1.setBounds(10, 42, 86, 20);
		contentPane.add(txtWhite_1);
		txtWhite_1.setColumns(10);
		
		txtWhite_2 = new JTextField();
		txtWhite_2.setBounds(10, 73, 86, 20);
		contentPane.add(txtWhite_2);
		txtWhite_2.setColumns(10);
		
		txtWhite_3 = new JTextField();
		txtWhite_3.setBounds(10, 104, 86, 20);
		contentPane.add(txtWhite_3);
		txtWhite_3.setColumns(10);
		
		txtWhite_4 = new JTextField();
		txtWhite_4.setBounds(10, 135, 86, 20);
		contentPane.add(txtWhite_4);
		txtWhite_4.setColumns(10);
		
		txtWhite_5 = new JTextField();
		txtWhite_5.setBounds(10, 166, 86, 20);
		contentPane.add(txtWhite_5);
		txtWhite_5.setColumns(10);
		
		txtRed_1 = new JTextField();
		txtRed_1.setBounds(106, 42, 86, 20);
		contentPane.add(txtRed_1);
		txtRed_1.setColumns(10);
		
		txtRed_2 = new JTextField();
		txtRed_2.setBounds(106, 73, 86, 20);
		contentPane.add(txtRed_2);
		txtRed_2.setColumns(10);
		
		txtRed_3 = new JTextField();
		txtRed_3.setBounds(106, 104, 86, 20);
		contentPane.add(txtRed_3);
		txtRed_3.setColumns(10);
		
		txtRed_4 = new JTextField();
		txtRed_4.setBounds(106, 135, 86, 20);
		contentPane.add(txtRed_4);
		txtRed_4.setColumns(10);
		
		txtRed_5 = new JTextField();
		txtRed_5.setBounds(106, 166, 86, 20);
		contentPane.add(txtRed_5);
		txtRed_5.setColumns(10);
		
		txtBlue_1 = new JTextField();
		txtBlue_1.setBounds(202, 42, 86, 20);
		contentPane.add(txtBlue_1);
		txtBlue_1.setColumns(10);
		
		txtBlue_2 = new JTextField();
		txtBlue_2.setBounds(202, 73, 86, 20);
		contentPane.add(txtBlue_2);
		txtBlue_2.setColumns(10);
		
		txtBlue_3 = new JTextField();
		txtBlue_3.setBounds(202, 104, 86, 20);
		contentPane.add(txtBlue_3);
		txtBlue_3.setColumns(10);
		
		txtBlue_4 = new JTextField();
		txtBlue_4.setBounds(202, 135, 86, 20);
		contentPane.add(txtBlue_4);
		txtBlue_4.setColumns(10);
		
		txtBlue_5 = new JTextField();
		txtBlue_5.setBounds(202, 166, 86, 20);
		contentPane.add(txtBlue_5);
		txtBlue_5.setColumns(10);
		
		txtGreen_1 = new JTextField();
		txtGreen_1.setBounds(298, 42, 86, 20);
		contentPane.add(txtGreen_1);
		txtGreen_1.setColumns(10);
		
		txtGreen_2 = new JTextField();
		txtGreen_2.setBounds(298, 73, 86, 20);
		contentPane.add(txtGreen_2);
		txtGreen_2.setColumns(10);
		
		txtGreen_3 = new JTextField();
		txtGreen_3.setBounds(298, 104, 86, 20);
		contentPane.add(txtGreen_3);
		txtGreen_3.setColumns(10);
		
		txtGreen_4 = new JTextField();
		txtGreen_4.setBounds(298, 135, 86, 20);
		contentPane.add(txtGreen_4);
		txtGreen_4.setColumns(10);
		
		txtGreen_5 = new JTextField();
		txtGreen_5.setBounds(298, 166, 86, 20);
		contentPane.add(txtGreen_5);
		txtGreen_5.setColumns(10);
		
		txtYellow_1 = new JTextField();
		txtYellow_1.setBounds(394, 42, 86, 20);
		contentPane.add(txtYellow_1);
		txtYellow_1.setColumns(10);
		
		txtYellow_2 = new JTextField();
		txtYellow_2.setBounds(394, 73, 86, 20);
		contentPane.add(txtYellow_2);
		txtYellow_2.setColumns(10);
		
		txtYellow_3 = new JTextField();
		txtYellow_3.setBounds(394, 104, 86, 20);
		contentPane.add(txtYellow_3);
		txtYellow_3.setColumns(10);
		
		txtYellow_4 = new JTextField();
		txtYellow_4.setBounds(394, 135, 86, 20);
		contentPane.add(txtYellow_4);
		txtYellow_4.setColumns(10);
		
		txtYellow_5 = new JTextField();
		txtYellow_5.setBounds(394, 166, 86, 20);
		contentPane.add(txtYellow_5);
		txtYellow_5.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(298, 197, 182, 40);
		contentPane.add(btnSave);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(7, 197, 185, 36);
		contentPane.add(btnCancel);
	}

}
