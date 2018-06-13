package org.windfree.net.client.handler;

import java.io.DataInput;
import java.io.DataOutput;

public interface IClientHandler {
    public void execute (DataInput in, DataOutput out, byte[] buffer);
}
