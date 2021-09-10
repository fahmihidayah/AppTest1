package com.widsons.basicapp.presenter;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created on : September/10/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
public class OperasiAritmatikaPresenterTest extends TestCase {

    @Test
    public void testJumlah() {
        OperasiAritmatikaPresenter presenter = new OperasiAritmatikaPresenter();
        assertEquals(2, presenter.jumlah(1, 1));
    }

    @Test
    public void testKurangi() {
        OperasiAritmatikaPresenter presenter = new OperasiAritmatikaPresenter();
        assertEquals(0, presenter.kurangi(1, 1));
    }
}