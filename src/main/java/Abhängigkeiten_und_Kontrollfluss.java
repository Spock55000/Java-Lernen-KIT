public class Abhängigkeiten_und_Kontrollfluss {
    public static void main(String[] args){
        int Blubb = 5*10;
        int Blibb = 10*5;

        System.out.println(true && false);
        System.out.println(true && true);
        if ( 9 < 10){
            System.out.println("Zugriff gestattet.");
        }
        if (8 <= 7){
            System.out.println("Versuche es noch einmal.");

        }
        else {
            System.out.println("Erfolgreich");
        }
        int shoeSize = 10;

        if (shoeSize > 12) {
            System.out.println("Sorry, your shoe size is currently not in stock.");
        } else if (shoeSize >= 6) {
            System.out.println("Your shoe size is in stock!");
        } else {
            System.out.println("Sorry, this store does not carry shoes smaller than a size 6.");
        }

    }
}
