// Main.java
public class Main {
    public static void main(String[] args) {
        MechanicalKeyboard mk = new MechanicalKeyboard("Keychron", "USB", 87, "Blue Switch");
        MembraneKeyboard mb = new MembraneKeyboard("Logitech", "Wireless", 104, true);

        mk.ketik();
        mk.infoMechanical();

        mb.ketik();
        mb.infoMembrane();
    }
}