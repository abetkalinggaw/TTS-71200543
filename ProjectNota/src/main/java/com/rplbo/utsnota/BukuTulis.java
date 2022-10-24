package com.rplbo.utsnota;

public class BukuTulis extends Barang {
    private String merk;

    public BukuTulis(String kodeBarang, int harga, int berat, String deskripsi, String merk) {
        super(deskripsi, kodeBarang, harga, berat, merk);
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void getInformasi() {
        super.getInformasi();
    }
}
