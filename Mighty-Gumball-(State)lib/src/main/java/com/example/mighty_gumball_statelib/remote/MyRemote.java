package com.example.mighty_gumball_statelib.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ilya on 06.02.2018.
 */

public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;
}
