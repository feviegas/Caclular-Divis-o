package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.JanelaCalculadora;

public class DivisaoControle implements ActionListener {

	private JanelaCalculadora janelaCalculadora;
	
	DivisaoControle(JanelaCalculadora janelaCalculadora){
		this.janelaCalculadora = janelaCalculadora;
		registraListenerAcao();
	}

	private void registraListenerAcao() {
		janelaCalculadora.getButtonDividir().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String strPrimeiroNumero = janelaCalculadora.getFieldPrimeiroNumero().getText();
			double primeiroNumero = Double.parseDouble(strPrimeiroNumero);

			String strSegundoNumero = janelaCalculadora.getFieldSegundoNumero().getText();
			double segundoNumero = Double.parseDouble(strSegundoNumero);
			
			if (segundoNumero == 0) {
				throw new ArithmeticException("Nao existe divisao por zero");
			} else {
				double resultado = primeiroNumero / segundoNumero;
				janelaCalculadora.getResultados().setText(""+resultado);
			}
		} catch (NumberFormatException exception) {
			System.out.println("Formato invalido: " + exception.getMessage());
		} catch (ArithmeticException exception) {
			System.out.println("Erro no calculo: " + exception.getMessage());
		}

	}
	
}
