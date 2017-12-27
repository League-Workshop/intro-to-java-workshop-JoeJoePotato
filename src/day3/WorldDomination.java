package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String name=JOptionPane.showInputDialog("What is your name?");
		
		
		String answer=JOptionPane.showInputDialog("do you know how to write code,"+name);
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equals("yes")) {JOptionPane.showConfirmDialog(null, "Then you will rule the world. All hail "+name+"!");
		// 3. Otherwise, wish them good luck washing dishes.
}else {JOptionPane.showConfirmDialog(null,"Good luck washing dishes,"+name);}
}
}

