package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class JanelaCalculadora extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldPrimeiroNumero;
	private JTextField fieldSegundoNumero;
	private JTextField resultados;
	private JButton buttonDividir;
	private JButton buttonLimpar;

	/**
	 * Create the frame.
	 */
	public JanelaCalculadora() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelMostraResultado = new JPanel();
		panelMostraResultado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelMostraResultado.setBackground(Color.PINK);
		FlowLayout fl_panelMostraResultado = (FlowLayout) panelMostraResultado.getLayout();
		fl_panelMostraResultado.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelMostraResultado, BorderLayout.NORTH);

		resultados = new JTextField();
		resultados.setFont(new Font("Tahoma", Font.BOLD, 30));
		resultados.setPreferredSize(new Dimension(600, 70));
		panelMostraResultado.add(resultados);
		resultados.setColumns(19);
		resultados.setEditable(false);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.PINK);
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(25);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.CENTER);

		JLabel labelPrimeiroNumero = new JLabel("Primeiro Número");
		panel_1.add(labelPrimeiroNumero);

		fieldPrimeiroNumero = new JTextField();
		fieldPrimeiroNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(fieldPrimeiroNumero);
		fieldPrimeiroNumero.setColumns(10);

		JLabel labelSegundoNumero = new JLabel("Segundo Número");
		panel_1.add(labelSegundoNumero);

		fieldSegundoNumero = new JTextField();
		fieldSegundoNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(fieldSegundoNumero);
		fieldSegundoNumero.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(Color.PINK);
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2, BorderLayout.SOUTH);

		this.buttonDividir = new JButton("Dividir");
		buttonDividir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(buttonDividir);

		this.buttonLimpar = new JButton("Limpar");
		buttonLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(buttonLimpar);
		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fieldPrimeiroNumero.setText("");
				fieldSegundoNumero.setText("");
				resultados.setText("");				
			}
			
		});
	}

	public final JTextField getFieldPrimeiroNumero() {
		return fieldPrimeiroNumero;
	}

	public final JTextField getFieldSegundoNumero() {
		return fieldSegundoNumero;
	}

	public final JTextField getResultados() {
		return resultados;
	}

	public final JButton getButtonDividir() {
		return buttonDividir;
	}

	public final JButton getButtonLimpar() {
		return buttonLimpar;
	}



}
