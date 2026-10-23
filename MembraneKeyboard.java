// MembraneKeyboard.java
public class MembraneKeyboard extends Keyboard {
    private boolean tahanAir;

    public MembraneKeyboard(String merk, String tipeKoneksi, int jumlahTombol, boolean tahanAir) {
        super(merk, tipeKoneksi, jumlahTombol);
        this.tahanAir = tahanAir;
    }

    public void infoMembrane() {
        System.out.println("Membrane Keyboard tahan air: " + (tahanAir ? "Ya" : "Tidak"));
    }

    public boolean isTahanAir() { return tahanAir; }
    public void setTahanAir(boolean tahanAir) { this.tahanAir = tahanAir; }
}