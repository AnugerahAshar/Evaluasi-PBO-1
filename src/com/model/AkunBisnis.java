package com.model;

public class AkunBisnis extends Akun{
    String namaBisnis;
    String alamat;

    public AkunBisnis() {

    }

    public AkunBisnis(String namaBisnis, String alamat) {
        this.namaBisnis = namaBisnis;
        this.alamat = alamat;
    }

    public void profilBisnis() {
        System.out.println("-- Info Bisnis --");
        System.out.println("Nama Bisnis: " + this.namaBisnis);
        System.out.println("Alamat: " + this.alamat);
    }
}