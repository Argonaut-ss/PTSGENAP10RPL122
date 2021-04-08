package com.example.ptsgenap10rpl122;

public class JenisBahan {

    String Bahan, Recomend;

    public JenisBahan(String nama, String nim) {
        this.Bahan = nama;
        this.Recomend = nim;
    }

    public String getNama() {
        return Bahan;
    }

    public void setNama(String nama) {
        this.Bahan = nama;
    }

    public String getNim() {
        return Recomend;
    }

    public void setNim(String nim) {
        this.Recomend = nim;
    }

}