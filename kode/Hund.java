public class Hund{

String navn;
String farve;
int alder;
double vaegt;
   
public Hund(){
   System.out.println("Hund in the making!");
   navn = "Fido";
   farve = "Hvid";
   alder = 0;
   vaegt = 10.0;
}

public Hund(String navn, String farve, int alder, double vaegt){
   this.navn = navn;
   this.farve = farve;
   this.alder = alder;
   this.vaegt = vaegt;
}

//metode til udskrift af hunde
public void hundeInfo(){

   System.out.println("Navn:\t\t" + navn);
   System.out.println("Farve:\t" + farve);
   System.out.println("Alder:\t" + alder + " år");
   System.out.println("Vaegt:\t" + vaegt + " kg\n");
}

public String hundeInfoToString(){
   
   String hundeText = "";
   hundeText = hundeText + "Navn:\t\t" + navn + "\n";
   hundeText = hundeText + "Farve:\t" + farve + "\n";
   hundeText = hundeText + "Alder:\t" + alder + " år\n";
   hundeText = hundeText + "Vaegt:\t" + vaegt + " kg\n\n";
   return hundeText;
}

public String toString(){

   String hundeText = "";
   hundeText = hundeText + "Navn:\t\t" + navn + "\n";
   hundeText = hundeText + "Farve:\t" + farve + "\n";
   hundeText = hundeText + "Alder:\t" + alder + " år\n";
   hundeText = hundeText + "Vaegt:\t" + vaegt + " kg\n";
   return hundeText;
}

}