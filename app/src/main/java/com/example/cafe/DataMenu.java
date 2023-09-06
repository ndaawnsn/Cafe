package com.example.cafe;

public class DataMenu {
    private String kode;
    private String jenis;
    private String nama;
    private String penjelasan;
    private Integer harga;

    public DataMenu(String kode, String jenis, String nama, String penjelasan, Integer harga) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.penjelasan = penjelasan;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}
