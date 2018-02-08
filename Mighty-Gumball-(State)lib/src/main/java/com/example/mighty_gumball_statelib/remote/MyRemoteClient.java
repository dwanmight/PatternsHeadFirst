package com.example.mighty_gumball_statelib.remote;

import java.rmi.Naming;

/**
 * Created by ilya on 08.02.2018.
 */

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {e.printStackTrace();}
    }
}
