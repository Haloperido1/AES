import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UTFDataFormatException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String in = "in.bin";
        String out = "out.bin";
        String key = "key.bin";
        String iv = "iv.bin";
        String out_dec = "out_dec.bin";
//        int x = 0x04;
//        System.out.println(x);
//        x = 0xef;
//        System.out.println(x);
//        x = 0xaa;
//        System.out.println(x);
//        x = 0xfb;
//        System.out.println(x);
        String text = "01bcdefghwxyz";
        byte[] textToByte = text.getBytes();
//        System.out.println(textToByte.length);
        AES.test(textToByte);

    }
}

//        try{
//
//            FileInputStream fis = new FileInputStream(in);
//            byte[] buff_text = new byte[fis.available()];
//            fis.read(buff_text, 0,fis.available());
//            fis.close();
//
//            fis = new FileInputStream(key);
//            byte[] buff_key = new byte[fis.available()];
//            fis.read(buff_key,0,fis.available());
//            fis.close();
//
//            fis = new FileInputStream(iv);
//            byte[] buff_iv = new  byte[fis.available()];
//            fis.read(buff_iv,0,fis.available());
//            fis.close();
//
//
//
////            String cryptMode;
////            cryptMode = args[0];
////            String paddingMode;
////            paddingMode = args[1];
////            byte[] enc = DES.encrypt(buff_text, buff_key, paddingMode, cryptMode, buff_iv);
////            System.out.println("Text criptat DES");
////
////            FileOutputStream fos = new FileOutputStream(out);
////            fos.write(enc, 0, enc.length);
////            fos.close();
////
////            byte[] dec = DES.decrypt(enc, buff_key, paddingMode, cryptMode, buff_iv);
////            System.out.println("Text decriptat DES");
////            fos = new FileOutputStream(out_dec);
////            fos.write(dec,0, dec.length);
////
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }

//}