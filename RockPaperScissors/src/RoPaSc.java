import java.util.Random;
import java.util.Scanner;

public class RoPaSc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("This is a rock, paper, scissors game. \nYou will be playing aganist the computer.");
		System.out.println("choose \n1.for rock \n2.for paper \n3.for scissors");
		int computer = 0;
		int you = 0;
		
		
		for(int i = 0; i<3; i++) {
			
		System.out.println(+i+ " of three");
		
		System.out.println("rock paper scissors:");
		int chosen = scanner.nextInt();
		int compChosen = r.nextInt(3) +1;
		if(chosen == 1 && compChosen == 2) {
			System.out.println(" you chose rock the computer chose paper  \ncomputer wins");
			computer++;
		}
		else if(chosen == 2 && compChosen == 3) {
			System.out.println(" you chose paper the computer chose scissors  \ncomputer wins");
			computer++;
		}
		else if(chosen == 3 && compChosen == 1) {
			System.out.println(" you chose scissors the computer chose rock  \ncomputer wins");
			computer++;
		}
		else if(compChosen == 1 && chosen == 2) {
			System.out.println(" you chose paper the computer chose rock  \nyou win");
			you++;
		}
		else if(compChosen == 2 && chosen == 3) {
			System.out.println(" you chose scissors the computer chose paper  \nyou win");
			you++;
		}
		else if(compChosen == 3 && chosen == 1) {
			System.out.println(" you chose rock the computer chose scissors \nyou win");
			you++;
		}
		else {
			System.out.println("you chose the same, it is a draw ");
			computer++;
			you++;
		}
	}	
		
		if(computer > you) {
			int fin = computer - you;
			System.out.println("computer wins by" +fin);
		}
		else if(you > computer ) {
			int fin = you - computer;
			System.out.println("you win by " +fin);
		}
		else {
			System.out.println("it is a "+computer + " - " +you+" draw");
		}
	}

}
