package com.widsons.basicapp.threading;

/**
 * Created on : September/17/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
public class SampleThread {

    public void simpleThreadTest() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello thread");
                System.out.println("thread utama");
            }
        });

        for (int i = 0; i <10; i++) {


        }
        System.out.println("");
        thread.start();
    }

}
