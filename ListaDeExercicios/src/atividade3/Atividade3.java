package atividade3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Atividade3 extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel jpanel = new JPanel(new GridBagLayout());

	private JLabel lbl_distanciaTotal = new JLabel("Distância Total (Quilometro):");
	private JTextField txt_distanciaTotal = new JTextField();

	private JLabel lbl_combustivoGasto = new JLabel("Combustivel Gasto (Litros):");
	private JTextField txt_combustivoGasto = new JTextField();

	private JLabel lbl_res = new JLabel("Consumo médio:");
	private JTextField txt_res = new JTextField();

	private JButton btn_calcular = new JButton("Calcular");

	private static final DecimalFormat df = new DecimalFormat("0.00");

	public Atividade3() {

		setSize(new Dimension(370, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Atividade 3");

		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		// labels e os editbox

		lbl_distanciaTotal.setPreferredSize(new Dimension(200, 25));
		jpanel.add(lbl_distanciaTotal, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_distanciaTotal.setPreferredSize(new Dimension(125, 25));
		jpanel.add(txt_distanciaTotal, gridBagConstraints);

		gridBagConstraints.gridy = 1;

		gridBagConstraints.gridx = 1;
		lbl_combustivoGasto.setPreferredSize(new Dimension(200, 25));
		jpanel.add(lbl_combustivoGasto, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_combustivoGasto.setPreferredSize(new Dimension(125, 25));
		jpanel.add(txt_combustivoGasto, gridBagConstraints);

		gridBagConstraints.gridy = 2;

		gridBagConstraints.gridx = 1;
		lbl_res.setPreferredSize(new Dimension(200, 25));
		jpanel.add(lbl_res, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_res.setPreferredSize(new Dimension(125, 25));
		txt_res.setEditable(false);
		jpanel.add(txt_res, gridBagConstraints);

		// buttons

		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;

		btn_calcular.setPreferredSize(new Dimension(125, 25));
		jpanel.add(btn_calcular, gridBagConstraints);
		btn_calcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					double distanciaTotal = Double.parseDouble(txt_distanciaTotal.getText());
					double combustivoGasto = Double.parseDouble(txt_combustivoGasto.getText());

					double res = distanciaTotal / combustivoGasto;

					txt_res.setText(String.valueOf(df.format(res)) + "km/L");

				} catch (Exception e2) {

					if (txt_distanciaTotal.getText().contains(",") || txt_combustivoGasto.getText().contains(",")) {

						txt_res.setText("não usa , usa .");

					} else {

						txt_res.setText("Digite numeros!");

					}

				}
			}
		});

		add(jpanel, BorderLayout.WEST);
		setVisible(true);

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Atividade3 atividade3 = new Atividade3();
	}

}
