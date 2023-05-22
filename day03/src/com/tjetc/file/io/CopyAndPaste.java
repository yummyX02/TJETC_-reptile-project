package com.tjetc.file.io;

import java.io.*;

public class CopyAndPaste {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/b.txt"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/a.txt"));
        byte[] bytes = new byte[1024];
        int len;
        bufferedOutputStream.write("这是从a.txt粘贴的数据:".getBytes());
        while((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
