package com.heee;
import com.model.Akun;
import com.model.AkunBisnis;

public class Main{

    public static void main(String[] args) {
        Akun pengguna1 = new Akun("pengguna1", "Laptop Enjoyer", 001, 2, 3, 9);
        Akun pengguna2 = new Akun("pengguna2", "Komputer Enjoyer", 002, 4, 2, 5);

        pengguna1.profil();
        pengguna1.percakapan();
        pengguna1.statusSaya();

        pengguna2.profil();
        pengguna2.percakapan();
        pengguna2.statusSaya();
    }

}