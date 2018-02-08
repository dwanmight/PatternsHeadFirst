package com.example.mighty_gumball_statelib.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by ilya on 08.02.2018.
 */

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override public String sayHello() throws RemoteException {
        return "Server says, 'hey'";
    }
}
