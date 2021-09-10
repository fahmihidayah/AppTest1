package com.widsons.basicapp;

/**
 * Created on : September/10/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
class Character {

    private String name;

    private int age;

    private Senjata senjata;

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public void menyerang() {
        this.senjata.pakaiSenjata();
    }
}
