package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] invitatiFerragnez = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner scanner = new Scanner(System.in);
		
		   System.out.print("Mi dica il suo nome gentilmente:");
		   
		   String name = scanner.nextLine();
		   
		   
		   boolean invitato = true;
		   
		   for (int i = 0; i < invitatiFerragnez.length; i++) {
			   if (name.equals(invitatiFerragnez[i])) {
				   invitato = true;
			   }
		   }
		   
		   if (invitato) {
			   System.out.println("Benvenuto/a, si prenda un drink e si goda la festa");
		   }
		   else 
			   System.out.println("Lei non è invitato, torni a casa o chiamo la sicurezza");
		   
		   scanner.close();
		 
	}
	

}
