package com.model;

public class Akun{
    String nama;
    String about;
    int noTelp;
    int jumlahChat;
    int jumlahGrup;
    int jumlahStatus;

    public Akun() {
    
    }

    public Akun(String nama, String about, int noTelp, int jumlahChat, int jumlahGrup, int jumlahStatus) {
        this.nama = nama;
        this.about = about;
        this.noTelp = noTelp;
        this.jumlahChat = jumlahChat;
        this.jumlahGrup = jumlahGrup;
        this.jumlahStatus = jumlahStatus;
    }

    public void profil() {
        System.out.println("-- Info Akun --");
        System.out.println("Nama: " + this.nama);
        System.out.println("About: " + this.about);
        System.out.println("No. Telepon: " + this.noTelp);
    }

    public void percakapan() {
        System.out.println("-------------");
        System.out.println("Jumlah Chat: " + this.jumlahChat + " Chat");
        System.out.println("Jumlah Grup: " + this.jumlahGrup + " Grup");
    }

    public void statusSaya() {
        System.out.println("-------------");
        System.out.println("Jumlah Status hari ini: " + this.jumlahStatus + " Status\n");
    }
}