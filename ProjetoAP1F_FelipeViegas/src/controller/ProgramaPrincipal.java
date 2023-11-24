package controller;

import visao.JanelaCalculadora;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		JanelaCalculadora janela = new JanelaCalculadora();
		janela.setTitle("Atividade Prática I - FELIPE VIEGAS");
		janela.setVisible(true);
		
		DivisaoControle divisaoControle = new DivisaoControle(janela);
		LimparControle limparControle = new LimparControle(janela);
	}


}
