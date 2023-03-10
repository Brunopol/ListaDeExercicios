package atividade2;

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

public class Atividade2 extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jpanel = new JPanel(new GridBagLayout());

	private JLabel lbl_num1 = new JLabel("Numero 1:");
	private JTextField txt_num1 = new JTextField();

	private JLabel lbl_num2 = new JLabel("Numero 2:");
	private JTextField txt_num2 = new JTextField();

	private JLabel lbl_resSoma = new JLabel("Resultado soma:");
	private JTextField txt_resSoma = new JTextField();

	private JLabel lbl_resSubtracao = new JLabel("Resultado subtração:");
	private JTextField txt_resSubtracao = new JTextField();

	private JLabel lbl_resMultiplicacao = new JLabel("Resultado multiplicação:");
	private JTextField txt_resMultiplicacao = new JTextField();

	private JLabel lbl_resDivisao = new JLabel("Resultado Divisão:");
	private JTextField txt_resDivisao = new JTextField();

	private JButton btn_calcular = new JButton("Calcular");

	private static final DecimalFormat df = new DecimalFormat("0.00");

	public Atividade2() {

		setSize(new Dimension(550, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Atividade 2");

		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		// labels e os editbox

		// num1
		lbl_num1.setPreferredSize(new Dimension(100, 25));
		jpanel.add(lbl_num1, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_num1.setPreferredSize(new Dimension(100, 25));
		jpanel.add(txt_num1, gridBagConstraints);

		// num2
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy++;
		lbl_num2.setPreferredSize(new Dimension(100, 25));
		jpanel.add(lbl_num2, gridBagConstraints);
		gridBagConstraints.gridx = 2;
		txt_num2.setPreferredSize(new Dimension(100, 25));
		jpanel.add(txt_num2, gridBagConstraints);

		// resultado soma
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 4;
		lbl_resSoma.setPreferredSize(new Dimension(150, 25));
		jpanel.add(lbl_resSoma, gridBagConstraints);
		gridBagConstraints.gridx = 6;
		txt_resSoma.setPreferredSize(new Dimension(100, 25));
		txt_resSoma.setEditable(false);
		jpanel.add(txt_resSoma, gridBagConstraints);

		// resultado subtração
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 4;
		lbl_resSubtracao.setPreferredSize(new Dimension(150, 25));
		jpanel.add(lbl_resSubtracao, gridBagConstraints);
		gridBagConstraints.gridx = 6;
		txt_resSubtracao.setPreferredSize(new Dimension(100, 25));
		txt_resSubtracao.setEditable(false);
		jpanel.add(txt_resSubtracao, gridBagConstraints);

		// resultado multiplicação
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 4;
		lbl_resMultiplicacao.setPreferredSize(new Dimension(150, 25));
		jpanel.add(lbl_resMultiplicacao, gridBagConstraints);
		gridBagConstraints.gridx = 6;
		txt_resMultiplicacao.setPreferredSize(new Dimension(100, 25));
		txt_resMultiplicacao.setEditable(false);
		jpanel.add(txt_resMultiplicacao, gridBagConstraints);
		
		// resultado Divisão
				gridBagConstraints.gridy = 3;
				gridBagConstraints.gridx = 4;
				lbl_resDivisao.setPreferredSize(new Dimension(150, 25));
				jpanel.add(lbl_resDivisao, gridBagConstraints);
				gridBagConstraints.gridx = 6;
				txt_resDivisao.setPreferredSize(new Dimension(100, 25));
				txt_resDivisao.setEditable(false);
				jpanel.add(txt_resDivisao, gridBagConstraints);

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
					double resSoma = num1 + num2;
					double resSubtracao = num1 - num2;
					double resMultiplicacao = num1 * num2;
					double resDivisao = num1 / num2;

					txt_resSoma.setText(String.valueOf(df.format(resSoma)));
					txt_resSubtracao.setText(String.valueOf(df.format(resSubtracao)));
					txt_resMultiplicacao.setText(String.valueOf(df.format(resMultiplicacao)));
					txt_resDivisao.setText(String.valueOf(df.format(resDivisao)));
				} catch (Exception e2) {
					
					if (txt_num1.getText().contains(",") || txt_num2.getText().contains(",")) {
						
						txt_resDivisao.setText("não usa , usa .");
						txt_resMultiplicacao.setText("não usa , usa .");
						txt_resSoma.setText("não usa , usa .");
						txt_resSubtracao.setText("não usa , usa .");
						
					}
					else {
						txt_resDivisao.setText("Digite numeros!");
						txt_resMultiplicacao.setText("Digite numeros!");
						txt_resSoma.setText("Digite numeros!");
						txt_resSubtracao.setText("Digite numeros!");
					}
					
				}

			}
		});

		add(jpanel, BorderLayout.WEST);
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Atividade2 atividade2 = new Atividade2();
	}

}
