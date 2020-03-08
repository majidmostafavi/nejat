package security;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.GeneralSecurityException;
import java.security.Key;


public class EncryptUtil {

    private static final String ALGORITHM = "DES";
    private static final int ITERATIONS = 2;
    private static final byte[] keyValue = new byte[]{'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};
    private static final String salt = "this is a simple clear salt";

    public static String encrypt(String value) throws Exception {
        if(value == null)
            return null;
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.ENCRYPT_MODE, key);

        String valueToEnc = null;
        String eValue = value;
        for (int i = 0; i < ITERATIONS; i++) {
            valueToEnc = salt + eValue;
            byte[] encValue = c.doFinal(valueToEnc.getBytes());
            eValue = org.apache.commons.codec.binary.Base64.encodeBase64String(encValue);
        }

        if (eValue.contains("\r"))
            eValue = eValue.replace("\r", "");
        return eValue;
    }

    public static String decrypt(String value) throws Exception {
        if(value == null )
            return null;
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.DECRYPT_MODE, key);

        String dValue = null;
        String valueToDecrypt = value;
        for (int i = 0; i < ITERATIONS; i++) {
            byte[] decordedValue = org.apache.commons.codec.binary.Base64.decodeBase64(valueToDecrypt);
            byte[] decValue = c.doFinal(decordedValue);
            dValue = new String(decValue).substring(salt.length());
            valueToDecrypt = dValue;
        }
        return dValue;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

    public static SecretKey getSecretKey(String password) throws GeneralSecurityException {
        byte[] desKeyData = password.getBytes();
        DESKeySpec desKeySpec = new DESKeySpec(desKeyData);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        return keyFactory.generateSecret(desKeySpec);
    }

    public static void encryptFile(String sourceFile, String password) throws GeneralSecurityException, IOException {
        File source = new File(sourceFile);
        FileInputStream fin = new FileInputStream(source);
        ByteArrayOutputStream fout = new ByteArrayOutputStream();

        Cipher ecipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        ecipher.init(Cipher.ENCRYPT_MODE, getSecretKey(password));

        byte[] iv = ecipher.getIV();
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeInt(iv.length);
        dout.write(iv);

        byte[] input = new byte[(int) source.length()];
        while (true) {
            int bytesRead = fin.read(input);
            if (bytesRead == -1) {
                break;
            }
            byte[] output = ecipher.update(input, 0, bytesRead);
            if (output != null) {
                dout.write(output);
            }
        }

        byte[] output = ecipher.doFinal();
        if (output != null) {
            dout.write(output);
        }
        fin.close();
        dout.flush();
        dout.close();
        byte[] bs = fout.toByteArray();
        fout.flush();
        fout.close();
        FileOutputStream fileOutputStream = new FileOutputStream(source);
        fileOutputStream.write(bs);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static void decryptFile(String sourceFile, String password) throws GeneralSecurityException, IOException {
        File source = new File(sourceFile);
        FileInputStream fin = new FileInputStream(source);
        ByteArrayOutputStream fout = new ByteArrayOutputStream();

        DataInputStream din = new DataInputStream(fin);
        int ivSize = din.readInt();
        byte[] iv = new byte[ivSize];
        din.readFully(iv);
        IvParameterSpec ivps = new IvParameterSpec(iv);

        Cipher dcipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        dcipher.init(Cipher.DECRYPT_MODE, getSecretKey(password), ivps);

        byte[] input = new byte[(int) source.length()];
        while (true) {
            int bytesRead = fin.read(input);
            if (bytesRead == -1) {
                break;
            }
            byte[] output = dcipher.update(input, 0, bytesRead);
            if (output != null) {
                fout.write(output);
            }
        }

        byte[] output = dcipher.doFinal();
        if (output != null) {
            fout.write(output);
        }
        fin.close();
        din.close();
        byte[] bs = fout.toByteArray();
        fout.flush();
        fout.close();
        FileOutputStream fileOutputStream = new FileOutputStream(source);
        fileOutputStream.write(bs);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static void encryptFile(String sourceFile, String destfile, String password) throws GeneralSecurityException, IOException {
        File source = new File(sourceFile);
        File dest;
        if (destfile == null) {
            dest = new File(sourceFile + "-enc");
        } else {
            dest = new File(destfile);
        }
        FileInputStream fin = new FileInputStream(source);
        FileOutputStream fout = new FileOutputStream(dest);

        Cipher ecipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        ecipher.init(Cipher.ENCRYPT_MODE, getSecretKey(password));

        byte[] iv = ecipher.getIV();
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeInt(iv.length);
        dout.write(iv);

        byte[] input = new byte[(int) source.length()];
        while (true) {
            int bytesRead = fin.read(input);
            if (bytesRead == -1) {
                break;
            }
            byte[] output = ecipher.update(input, 0, bytesRead);
            if (output != null) {
                dout.write(output);
            }
        }

        byte[] output = ecipher.doFinal();
        if (output != null) {
            dout.write(output);
        }
        fin.close();
        fout.flush();
        fout.close();
        dout.flush();
        dout.close();
        if (destfile == null) {
            source.deleteOnExit();
        }
    }

    public static void decryptFile(String sourceFile, String destfile, String password) throws GeneralSecurityException, IOException {
        File source = new File(sourceFile);
        File dest;
        if (destfile == null) {
            dest = new File(sourceFile.replaceFirst("-enc", ""));
        } else {
            dest = new File(destfile);
        }
        FileInputStream fin = new FileInputStream(source);
        FileOutputStream fout = new FileOutputStream(dest);

        DataInputStream din = new DataInputStream(fin);
        int ivSize = din.readInt();
        byte[] iv = new byte[ivSize];
        din.readFully(iv);
        IvParameterSpec ivps = new IvParameterSpec(iv);

        Cipher dcipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        dcipher.init(Cipher.DECRYPT_MODE, getSecretKey(password), ivps);

        byte[] input = new byte[(int) source.length()];
        while (true) {
            int bytesRead = fin.read(input);
            if (bytesRead == -1) {
                break;
            }
            byte[] output = dcipher.update(input, 0, bytesRead);
            if (output != null) {
                fout.write(output);
            }
        }

        byte[] output = dcipher.doFinal();
        if (output != null) {
            fout.write(output);
        }
        fin.close();
        fout.flush();
        fout.close();
        din.close();
        if (destfile == null) {
            source.deleteOnExit();
        }
    }
}