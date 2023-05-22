package com.tjetc.file.io;

import java.io.*;

public class TestBuffedOutStream {
    /*
    注意使用close()和flush()方法，避免造成数据的丢失和资源的占用
     */
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/b.txt"));
        byte[] bytes = new byte[1024];
        bufferedOutputStream.write("this is TestBuffedOutStream".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
    public static void main1(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/a.txt"));
        byte[] bytes = new byte[1024];
        bytes[0] = '9';
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
