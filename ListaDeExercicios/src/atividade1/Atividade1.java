package atividade1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Atividade1 extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jpanel = new JPanel(new GridBagLayout());

	private JLabel lbl_num1 = new JLabel("Numero 1:");
	private JTextField txt_num1 = new JTextField();

	private JLabel lbl_num2 = new JLabel("Numero 2:");
	private JTextField txt_num2 = new JTextField();

	private JLabel lbl_res = new JLabel("Resultado");
	private JTextField txt_res = new JTextField();

	private JButton btn_calcular = new JButton("Calcular");

	public Atividade1() {

		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Atividade 1");

		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		// labels e os editbox

		lbl_num1.setPreferredSize(new Dimension(100, 25));

		jpanel.add(lbl_num1, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_num1.setPreferredSize(new Dimension(100, 25));
		jpanel.add(txt_num1, gridBagConstraints);

		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy++;
		lbl_num2.setPreferredSize(new Dimension(100, 25));
		jpanel.add(lbl_num2, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_num2.setPreferredSize(new Dimension(100, 25));
		jpanel.add(txt_num2, gridBagConstraints);

		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy++;
		lbl_res.setPreferredSize(new Dimension(100, 25));
		jpanel.add(lbl_res, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_res.setPreferredSize(new Dimension(100, 25));
		txt_res.setEditable(false);
		jpanel.add(txt_res, gridBagConstraints);

		// buttons
		gridBagConstraints.gridy++;
		btn_calcular.setPreferredSize(new Dimension(95, 25));
		jpanel.add(btn_calcular, gridBagConstraints);

		btn_calcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					double num1 = Double.parseDouble(txt_num1.getText());
					double num2 = Double.parseDouble(txt_num2.getText());
					double res = num1 + num2;
					txt_res.setText(String.valueOf(res));
				} catch (Exception e2) {

					if (txt_num1.getText().contains(",") || txt_num2.getText().contains(",")) {
						txt_res.setText("Não usa , usa .");
						txt_num1.requestFocus();
					} else {
						txt_res.setText("Digite numeros!");
						txt_num1.requestFocus();
					}

				}

			}
		});

		add(jpanel, BorderLayout.WEST);
		setVisible(true);
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Atividade1 atividade1 = new Atividade1();

	}

}
