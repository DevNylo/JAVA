package com.emojicombate;

public class EmojiCombat {

	public static void main(String[] args) {
		
		Luta show = new Luta();
		
		Lutador lutadorArr[] = new Lutador[6];
		lutadorArr[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 3, 1);
		lutadorArr[1] =	new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		lutadorArr[2] = new Lutador("SnapShadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		lutadorArr[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		lutadorArr[4] = new Lutador("UFO Cobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		lutadorArr[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		
		show.marcarLuta(lutadorArr[1], lutadorArr[2]);
		show.lutar();
		
	
		
		
	}

}