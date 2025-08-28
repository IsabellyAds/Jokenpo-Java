package jogo;

public class Jokenpo {

	public static int randInt(int min, int max) {
	    java.util.Random rand = new java.util.Random();
	    return rand.nextInt((max - min) + 1) + min;
	}

	public String determinarVencedor(int jogador, int computador) {
	    if (jogador == computador) {
	        return "Empate!";
	    } else if ((jogador == 0 && computador == 2) || 
	               (jogador == 1 && computador == 0) || 
	               (jogador == 2 && computador == 1)) {
	        return "Você venceu!";
	    } else {
	        return "Computador venceu!";
	    }
	}
}