package org.windfree.net.client.handler;

import java.io.DataInput;
import java.io.DataOutput;

public class StringMessageClientHandler implements  IClientHandler{
    @Override
    public void execute(DataInput in, DataOutput out, byte[] buffer) {
        String s = new String(buffer);
        System.out.println(("I got replied message from Server."));
    }
}
