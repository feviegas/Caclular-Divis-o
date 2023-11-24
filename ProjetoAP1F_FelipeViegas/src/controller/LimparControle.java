package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.JanelaCalculadora;

public class LimparControle implements ActionListener {

	private JanelaCalculadora janelaCalculadora;
	
	LimparControle(JanelaCalculadora janelaCalculadora){
		this.janelaCalculadora = janelaCalculadora;
		registraListenerAcao();
	}

	private void registraListenerAcao() {
		janelaCalculadora.getButtonLimpar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		janelaCalculadora.getFieldPrimeiroNumero().setText("");
		janelaCalculadora.getFieldSegundoNumero().setText("");
		janelaCalculadora.getResultados().setText("");
	}
	
}
