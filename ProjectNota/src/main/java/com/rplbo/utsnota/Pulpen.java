package com.rplbo.utsnota;

public class Pulpen extends Barang {
    private String warna;

    public Pulpen(String deskripsi, int harga, int berat, String kodeBarang, String warna) {
        super(deskripsi, kodeBarang, harga, berat, warna);
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void getInformasi() {
        super.getInformasi();
    }
}
