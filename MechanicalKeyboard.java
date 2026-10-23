// MechanicalKeyboard.java
public class MechanicalKeyboard extends Keyboard {
    private String tipeSwitch;

    public MechanicalKeyboard(String merk, String tipeKoneksi, int jumlahTombol, String tipeSwitch) {
        super(merk, tipeKoneksi, jumlahTombol);
        this.tipeSwitch = tipeSwitch;
    }

    public void infoMechanical() {
        System.out.println("Mechanical Keyboard dengan switch: " + tipeSwitch);
    }

    public String getTipeSwitch() { return tipeSwitch; }
    public void setTipeSwitch(String tipeSwitch) { this.tipeSwitch = tipeSwitch; }
}