package org.windfree.net.server;

import org.windfree.net.server.handler.DefaultHandler;
import org.windfree.net.server.handler.ByteMessageHandler;
import org.windfree.net.server.handler.IHandler;

import java.io.*;
import java.net.Socket;


public class TcpServerWorker implements  Runnable{
    private Socket socket;
    private DataInput din;
    private DataOutput dout;
    public TcpServerWorker(Socket sock) {
        this.socket = sock;
        try {
            din = new DataInputStream(new BufferedInputStream(this.socket.getInputStream()));
            dout = new DataOutputStream(new BufferedOutputStream(this.socket.getOutputStream()));
        }catch(Exception ex){}

    }

    // 데이터 전문구조
    // | Message Len(4byte) | CommandCode ( 4byte) | Body (n byte) |
    @Override
    public void run() {
        while(true) {
            try {
                while (true) {
                    /*
                    byte[] buffer = new byte[10];
                    din.readFully(buffer);
                    */
                    int messageLen = din.readInt();
                    int commandCode = din.readInt();
                    byte[] buffer = new byte[messageLen - 8];
                    din.readFully(buffer);
                    IHandler handler = getHandler(commandCode);
                    handler.execute( din, dout, buffer);
                }
            } catch (Exception ex) {

            } finally {
                try {
                    ((DataInputStream) din).close();
                    ((DataOutputStream) dout).close();
                } catch (Exception e) {
                    System.out.println("connectin is closed");
                }

            }
        }
    }


    private IHandler getHandler(int commandCode) {
        IHandler handler = null;
        switch(commandCode){
            case 100:
                handler =  new ByteMessageHandler();
                break;
            default:
                handler = new DefaultHandler();

        }
        return handler;
    }

    public void stopServer() {
        try {
            this.socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
