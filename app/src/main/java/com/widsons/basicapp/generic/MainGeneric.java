package com.widsons.basicapp.generic;

import com.widsons.basicapp.Murid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on : September/17/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
public class MainGeneric {

    private List<String> names;

    private List<Murid> murids;

    private ArrayList<String> others;

    private Map<String, String> parameters;

    private HashMap<String, String> contacts;

    public void test() {
        names.add("fahmi");
        names.add("budi");

        murids.add(new Murid());
        contacts.put("fahmi", "123098430");
        contacts.get("fahmi");

    }
}
