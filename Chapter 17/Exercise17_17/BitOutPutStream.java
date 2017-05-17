 import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//全部使用位运算。

public class BitOutPutStream implements AutoCloseable {
    FileOutputStream out;
    int bits = 0;
    int bitsPosition = 0;

    public BitOutPutStream(File file) throws IOException {
        out = new FileOutputStream(file);
    }

    public void writeBit(char bit) throws IOException {
        bits = bits << 1;

        if (bit == '1') {
            bits = bits | 1;   //如果bit是1，自然会改第一位，如果是0，那正好无需修改。
        }

        if (++bitsPosition == 8) {    //没经过一次都会+1，进行判断的时候正好等于目前的位数。
            out.write(bits);    //输出！
            bitsPosition = 0;    //输出后，位数重设为0.
        }
    }

    public void writeBit(String bit) throws IOException {
        for (int i = 0; i < bit.length(); i++) {
            writeBit(bit.charAt(i));
        }
    }

    //补足8个bit并且输出，然后关闭。。
    @Override
    public void close() throws IOException {
        if (bitsPosition < 8 && bitsPosition != 0) {
            bits = bits << (8 - bitsPosition);
        }
        out.write(bits);
        bitsPosition = 0;
        out.close();
    }
}