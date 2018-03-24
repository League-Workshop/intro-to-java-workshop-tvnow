package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int Butt=0;
		// 2.  Ask the user a question 
		speak("are you a butt");
		String answer=JOptionPane.showInputDialog( "are you a noob");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("no")){ 
			Butt++;
		}
		JOptionPane.showMessageDialog(null, Butt);
		speak("how are you");
		answer=JOptionPane.showInputDialog( "are you a noob");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("no")){ 
			Butt++;
		}speak("are you a butt");
		 answer=JOptionPane.showInputDialog( "are you a noob");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("no")){ 
			Butt++;
		}
		JOptionPane.showMessageDialog(null, Butt);speak("are you a butt");
		answer=JOptionPane.showInputDialog( "are you a noob");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("no")){ 
			Butt++;
		}
		JOptionPane.showMessageDialog(null, Butt);
		JOptionPane.showMessageDialog(null, Butt);
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}
