// Keyboard.java
public class Keyboard {
    private String merk;
    private String tipeKoneksi;
    private int jumlahTombol;

    public Keyboard(String merk, String tipeKoneksi, int jumlahTombol) {
        this.merk = merk;
        this.tipeKoneksi = tipeKoneksi;
        this.jumlahTombol = jumlahTombol;
    }

    public void ketik() {
        System.out.println("Keyboard " + merk + " sedang digunakan untuk mengetik.");
    }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getTipeKoneksi() { return tipeKoneksi; }
    public void setTipeKoneksi(String tipeKoneksi) { this.tipeKoneksi = tipeKoneksi; }

    public int getJumlahTombol() { return jumlahTombol; }
    public void setJumlahTombol(int jumlahTombol) { this.jumlahTombol = jumlahTombol; }
}