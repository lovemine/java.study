package org.windfree.net.client.handler;

import java.io.DataInput;
import java.io.DataOutput;

public class ByteMessageClientHandler implements  IClientHandler{
    @Override
    public void execute(DataInput in, DataOutput out, byte[] buffer) {
        String message = new String(buffer);
        System.out.println("Received from Server :" + message);
    }
}
