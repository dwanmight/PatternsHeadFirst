package com.example.mighty_gumball_statelib.remote;

import java.rmi.Naming;

/**
 * Created by ilya on 08.02.2018.
 */

public class TestRemote {

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {e.printStackTrace();}

    }
}
