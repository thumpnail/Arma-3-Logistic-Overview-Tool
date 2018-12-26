package com.blackdownstudio.arma3_logistic_overview_tool.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOTGuiOrderViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void GuiOrderViewer() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOTGuiOrderViewer frame = new LOTGuiOrderViewer();
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
	public LOTGuiOrderViewer() {
		setTitle("LOT - Order Viewer");
		setAlwaysOnTop(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\workspace\\arma 3 logistic overview tool (lot)\\Icons\\logo-lot.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setShowsRootHandles(true);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Order") {
				{
					add(new DefaultMutableTreeNode("order.000001.xml"));
					add(new DefaultMutableTreeNode("order.000002.xml"));
					add(new DefaultMutableTreeNode("order.000003.xml"));
				}
			}
		));
		tree.setBounds(10, 11, 424, 249);
		contentPane.add(tree);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOTGuiOrder orderGui = new LOTGuiOrder();
				orderGui.LOTGuiOrder();
			}
		});
		btnApply.setBounds(238, 271, 196, 23);
		contentPane.add(btnApply);
		
		JButton btnCancle = new JButton("Cancel");
		btnCancle.setBounds(10, 271, 196, 23);
		contentPane.add(btnCancle);
	}

}
