public class arrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[9];
        System.arraycopy(copyFrom, 2, copyTo, 0, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");     
        }
    }
}
