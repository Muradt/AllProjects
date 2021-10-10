import java.util.Scanner;

public class ConvertNumToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] mass = new String[10001];
		String[] mass2 = new String[4];
		mass[0] = "sifir";
		mass[1] = "bir";
		mass[2] = "iki";
		mass[3] = "uc";
		mass[4] = "dord";
		mass[5] = "bes";
		mass[6] = "alti";
		mass[7] = "yeddi";
		mass[8] = "sekkiz";
		mass[9] = "doqquz";
		mass[10] = "on";
		mass[20] = "iyirmi";
		mass[30] = "otuz";
		mass[40] = "qirx";
		mass[50] = "elli";
		mass[60] = "altimish";
		mass[70] = "yetmish";
		mass[80] = "seksen";
		mass[90] = "doxsan";
		mass[100] = "yuz";
		mass[200] = "iki yuz";
		mass[300] = "uc yuz";
		mass[400] = "dord yuz";
		mass[500] = "besh yuz";
		mass[600] = "alti yuz";
		mass[700] = "yeddi yuz";
		mass[800] = "sekkiz yuz";
		mass[900] = "doqquz yuz";
		mass[1000] = "min";
		mass[2000] = "iki min";
		mass[3000] = "uc min";
		mass[4000] = "dord min";
		mass[5000] = "bes min";
		mass[6000] = "alti min";
		mass[7000] = "yeddi min";
		mass[8000] = "sekkiz min";
		mass[9000] = "doqquz min";
		mass[10000] = "on min";
		System.out.print("Please enter the number which you want to see the String version : ");
		int a = sc.nextInt();
		int count = 0;
		for (int i = 0; i < mass.length; i++) {
			if (a % 10 == i) {
				mass2[count] = mass[i];
				a = a - (a % 10);
				count++;
				break;
			}

		}
		for (int i = 0; i < mass.length; i++) {
			if (a % 100 == i) {
				mass2[count] = mass[i];
				a = a - (a % 100);
				count++;
				break;
			}

		}
		for (int i = 0; i < mass.length; i++) {
			if (a % 1000 == i) {
				mass2[count] = mass[i];
				a = a - (a % 1000);
				count++;
				break;
			}

		}
		for (int i = 0; i < mass.length; i++) {
			if (a % 10000 == i) {
				mass2[count] = mass[i];
				break;
			}

		}
		System.out.println("-----------------------------------");
		System.out.print("String version : ");
		for (int j = mass2.length - 1; j >= 0; j--) {

			System.out.print(mass2[j] + " ");

		}
		System.out.println("\n-----------------------------------");
		main(args);
	}
}
