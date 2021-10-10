package az.Murad.main;
//Ele bir class yaradin ki, bu class 4 class ucun 
//(student teacher lesson group) super class rolunu
//oynasin ve bu class ozunde add update delete search 
//metodlarini saxlasin . diger 4 class olan student teacher 
//lesson group oz super classinin metodlarindan istifade edecek. 
//ve elave olaraq her bir class ucun unikal bir method hazirla.bu 
//4 klassin daxilinde ozunun propertyleri olacag.
//shertler
//1.super classin obyektini yaratmaq mumkun olmasin,
//2.subclass ozunde elave metodlar saxlasin.
//3.bir basha subclassín metodlarindan superclassin metodlarina
//mudaxile etmak mumkun olsun.nezere alinki subclassin ozunun avtomatik 
//yerine yetirilen bir metodu olmalidir.
//4.esas classdan studentin melumatlarini daxil edib console-a yazmaq mumkun olsun.
import java.util.Scanner;

import az.Murad.Others.CommonFeature;
import az.Murad.Others.Lesson;
import az.Murad.Others.PerformeTask;
import az.Murad.Others.Person;
import az.Murad.Others.Students;

public class main {


	public static void main(String[] args) {
        
		PerformeTask.performProgram();
		
	}


}
