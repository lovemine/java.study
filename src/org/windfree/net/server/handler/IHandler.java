package org.windfree.net.server.handler;

import java.io.DataInput;
import java.io.DataOutput;

public interface IHandler {
    public void execute (DataInput in, DataOutput out, byte[] buffer);
}
