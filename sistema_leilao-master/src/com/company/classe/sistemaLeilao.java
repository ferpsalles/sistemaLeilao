package com.company.classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sistemaLeilao implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sistemaLeilao window = new sistemaLeilao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sistemaLeilao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow][grow]", "[][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Nome do bem:");
		frame.getContentPane().add(lblNewLabel, "cell 0 0,alignx left,aligny center");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor inicial:");
		frame.getContentPane().add(lblNewLabel_1, "cell 0 1,alignx left");
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 1 1 2 1,growx");
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton, "cell 0 2 3 1,grow");
		
		JLabel lblNewLabel_2 = new JLabel("Itens cadastrados");
		frame.getContentPane().add(lblNewLabel_2, "cell 0 3 2 1,alignx center");
		
		JLabel lblNewLabel_3 = new JLabel("Bem Leiloado");
		frame.getContentPane().add(lblNewLabel_3, "flowx,cell 2 3,alignx left");
		
		JList list = new JList();
		frame.getContentPane().add(list, "cell 0 4 2 1,grow");
		
		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 2 3,growx");
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 2 4,grow");
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Cliente:");
		panel.add(lblNewLabel_4, "cell 0 0,alignx left");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 1 0,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor do Lance:");
		panel.add(lblNewLabel_5, "cell 0 1,alignx left");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "cell 1 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Aberto:");
		panel.add(lblNewLabel_6, "cell 0 2,alignx left");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sim");
		panel.add(rdbtnNewRadioButton, "flowx,cell 1 2");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("N\u00E3o");
		panel.add(rdbtnNewRadioButton_1, "cell 1 2,alignx right");
		
		JButton btnNewButton_1 = new JButton("REGISTRAR");
		panel.add(btnNewButton_1, "cell 0 3 2 1,grow");
	}

	public void actionPerformed(ActionEvent e) {
	}
}
