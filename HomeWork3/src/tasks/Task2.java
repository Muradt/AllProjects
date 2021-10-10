package tasks;

import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
//Men Adnada tehsil aliram,komputerle mesgul oluram.
//" Cumlesinden herfler goturerek soz duzelt .Herfler ixtiyari goturulecek
//ve ixtiyari soz alina biler.n herfli m soz
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rr = new Random();
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		System.out.println("How many words do you want ? ");
		int numOfWord = sc.nextInt();
		System.out.println("How many letter do you want this words contain ? ");
		int numOfLetter = sc.nextInt();
		for (int i = 0; i < numOfWord; i++) {
			String newWord = "";
			int j = 0;
			while (j < numOfLetter) {
				char symbol = s1.charAt(rr.nextInt(s1.length() - 1));
				if (symbol != ' ') {
					newWord += symbol;
					j++;
				}
			}
			System.out.println((i + 1) + "." + newWord);
		}
	}
}
