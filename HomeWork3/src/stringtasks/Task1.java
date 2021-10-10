package stringtasks;

import java.util.Scanner;

public class Task1 {
//	[Unversitet] [metro] metrosunda [küçə] 
//	küçəsində yerləşir.Cümləsində [Unversitet] 
//	[metro] və [küçə] sözlərini uyğun unversitet,
//	metro və küçə adları ilə  əvəz edin.
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String sentence = "[Unversitet], [metro] metrosunda [küçə] küçəsində yerləşir";
		System.out.println(sentence);
		System.out.println("Universiteti daxil edin : ");
		String universitet = sc.nextLine();	
		System.out.println("Metronu daxil edin : ");
		String metro = sc.nextLine();
		System.out.println("Kuceni daxil edin : ");
		String kuce = sc.nextLine();
		sentence = sentence.replace("[Unversitet]", universitet).replace("[metro]", metro).replace("[küçə]", kuce);
		System.out.println(sentence);
		sc.close();
	}
}
