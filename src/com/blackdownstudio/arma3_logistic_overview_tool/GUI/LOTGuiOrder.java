package com.blackdownstudio.arma3_logistic_overview_tool.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOTGuiOrder extends JFrame {

	private JPanel contentPane;
	private JTextField txtNr;
	private JTextField txtOrderFrom;
	private JTextField txtOrderTo;
	private JTextField txtWhichOrder;
	private JTextField txtNr_1;
	private JTextField txtOrderFrom_1;
	private JTextField txtOrderto;
	private JTextField txtBorder;
	private JTextField txtLogisticLeader;
	private JTextField txtAmountVehicle;
	private JTextField txtRadioChannel;
	private JTextField txtLogisticleader;
	private JTextField txtAmountvehicle;
	private JTextField txtRadiochannel;
	private JTextField txtWhere;
	private JTextField txtWhere_x;
	private JTextField txtHow;
	private JTextField txtDescription;
	private JTextField txtWhere_y;

	/**
	 * Launch the application.
	 */
	public void LOTGuiOrder() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOTGuiOrder frame = new LOTGuiOrder();
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
	public LOTGuiOrder() {
		setAlwaysOnTop(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\workspace\\arma 3 logistic overview tool (lot)\\Icons\\logo-lot.png"));
		setType(Type.POPUP);
		setTitle("LOT - Order Editor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtNr = new JTextField();
		txtNr.setEditable(false);
		txtNr.setText("Nr.:");
		txtNr.setBounds(10, 11, 86, 20);
		contentPane.add(txtNr);
		txtNr.setColumns(10);
		
		txtOrderFrom = new JTextField();
		txtOrderFrom.setEditable(false);
		txtOrderFrom.setText("Order from :");
		txtOrderFrom.setBounds(10, 42, 86, 20);
		contentPane.add(txtOrderFrom);
		txtOrderFrom.setColumns(10);
		
		txtOrderTo = new JTextField();
		txtOrderTo.setEditable(false);
		txtOrderTo.setText("Order To :");
		txtOrderTo.setBounds(10, 73, 86, 20);
		contentPane.add(txtOrderTo);
		txtOrderTo.setColumns(10);
		
		txtWhichOrder = new JTextField();
		txtWhichOrder.setEditable(false);
		txtWhichOrder.setText("Which order :");
		txtWhichOrder.setBounds(10, 104, 86, 20);
		contentPane.add(txtWhichOrder);
		txtWhichOrder.setColumns(10);
		
		txtNr_1 = new JTextField();
		txtNr_1.setBounds(106, 11, 86, 20);
		contentPane.add(txtNr_1);
		txtNr_1.setColumns(10);
		
		txtOrderFrom_1 = new JTextField();
		txtOrderFrom_1.setBounds(106, 42, 86, 20);
		contentPane.add(txtOrderFrom_1);
		txtOrderFrom_1.setColumns(10);
		
		txtOrderto = new JTextField();
		txtOrderto.setBounds(106, 73, 86, 20);
		contentPane.add(txtOrderto);
		txtOrderto.setColumns(10);
		
		txtBorder = new JTextField();
		txtBorder.setBounds(202, 11, 2, 113);
		contentPane.add(txtBorder);
		txtBorder.setColumns(10);
		
		txtLogisticLeader = new JTextField();
		txtLogisticLeader.setEditable(false);
		txtLogisticLeader.setText("Logistic Leader :");
		txtLogisticLeader.setBounds(214, 11, 115, 20);
		contentPane.add(txtLogisticLeader);
		txtLogisticLeader.setColumns(10);
		
		txtAmountVehicle = new JTextField();
		txtAmountVehicle.setEditable(false);
		txtAmountVehicle.setText("Amount Vehicle :");
		txtAmountVehicle.setBounds(214, 42, 115, 20);
		contentPane.add(txtAmountVehicle);
		txtAmountVehicle.setColumns(10);
		
		txtRadioChannel = new JTextField();
		txtRadioChannel.setEditable(false);
		txtRadioChannel.setText("Radio Channel :");
		txtRadioChannel.setBounds(214, 73, 115, 20);
		contentPane.add(txtRadioChannel);
		txtRadioChannel.setColumns(10);
		
		txtLogisticleader = new JTextField();
		txtLogisticleader.setBounds(339, 11, 86, 20);
		contentPane.add(txtLogisticleader);
		txtLogisticleader.setColumns(10);
		
		txtAmountvehicle = new JTextField();
		txtAmountvehicle.setBounds(339, 42, 86, 20);
		contentPane.add(txtAmountvehicle);
		txtAmountvehicle.setColumns(10);
		
		txtRadiochannel = new JTextField();
		txtRadiochannel.setBounds(339, 73, 86, 20);
		contentPane.add(txtRadiochannel);
		txtRadiochannel.setColumns(10);
		
		txtWhere = new JTextField();
		txtWhere.setEditable(false);
		txtWhere.setText("Where :");
		txtWhere.setBounds(214, 104, 115, 20);
		contentPane.add(txtWhere);
		txtWhere.setColumns(10);
		
		txtWhere_x = new JTextField();
		txtWhere_x.setBounds(339, 104, 36, 20);
		contentPane.add(txtWhere_x);
		txtWhere_x.setColumns(10);
		
		txtHow = new JTextField();
		txtHow.setEditable(false);
		txtHow.setText("How");
		txtHow.setBounds(310, 166, 86, 20);
		contentPane.add(txtHow);
		txtHow.setColumns(10);
		
		JCheckBox chckbxPlane = new JCheckBox("Plane");
		chckbxPlane.setBounds(310, 193, 87, 23);
		contentPane.add(chckbxPlane);
		
		JCheckBox chckbxHelicopter = new JCheckBox("Helicopter");
		chckbxHelicopter.setBounds(310, 220, 86, 23);
		contentPane.add(chckbxHelicopter);
		
		JCheckBox chckbxHmwt = new JCheckBox("hmwt");
		chckbxHmwt.setBounds(310, 246, 86, 23);
		contentPane.add(chckbxHmwt);
		
		JCheckBox chckbxBasicTransport = new JCheckBox("Basic Transport");
		chckbxBasicTransport.setBounds(310, 272, 115, 23);
		contentPane.add(chckbxBasicTransport);
		
		JCheckBox chckbxUav = new JCheckBox("uav");
		chckbxUav.setBounds(310, 298, 97, 23);
		contentPane.add(chckbxUav);
		
		txtDescription = new JTextField();
		txtDescription.setEditable(false);
		txtDescription.setText("Description");
		txtDescription.setBounds(15, 166, 86, 20);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
		JEditorPane dtrpnDescription = new JEditorPane();
		dtrpnDescription.setBounds(15, 189, 285, 179);
		contentPane.add(dtrpnDescription);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				}
		});
		btnApply.setBounds(310, 328, 115, 40);
		contentPane.add(btnApply);
		
		txtWhere_y = new JTextField();
		txtWhere_y.setColumns(10);
		txtWhere_y.setBounds(389, 104, 36, 20);
		contentPane.add(txtWhere_y);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ammo", "Repair", "Medic", "Gas", "Spec."}));
		comboBox.setBounds(106, 104, 86, 20);
		contentPane.add(comboBox);
		
	}
}