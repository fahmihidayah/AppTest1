package com.widsons.basicapp;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created on : September/10/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
public class CharacterTest extends TestCase {

    @Test
    public void test_Pisau_Print() {
        Character character = new Character();
        character.setSenjata(new Pisau());
        character.menyerang();
        character.setSenjata(new Panah());
        character.menyerang();
    }
}