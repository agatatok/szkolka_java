package pl.accenture.szkolka;

public class Main {

    public static void main(String[] args) {
        printPersonInfoV("Jan","Kowalski");
        printPersonInfoV("Jan1","Kowalski1","wiek: 14","wzrost: 170");
        printPersonInfoV("Adam","Nowak");
        printPersonInfoV("Horacy","Nowak");
    }

    static void printPersonInfoV(String name, String lastName, String ... additionalInfo){
        System.out.println("Name: "+name);
        System.out.println("Last name: "+lastName);
        System.out.println("Additional info:");

        for(String s: additionalInfo) {
            System.out.println(s);
        }
        System.out.println("########");
    }

}
