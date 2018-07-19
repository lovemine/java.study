package org.windfree.util;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.Key;

public class PemUtil {
    public static  void write(Key key, String desc, String filename) throws IOException {
        PemObject pemObj = new PemObject(desc,key.getEncoded());
        PemWriter pemWriter = new PemWriter(new OutputStreamWriter(new FileOutputStream(filename)));
        pemWriter.writeObject(pemObj);
        pemWriter.close();
    }




}
