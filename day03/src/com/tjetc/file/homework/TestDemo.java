package com.tjetc.file.homework;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/homework/w.txt");
        file.createNewFile();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/homework/a.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/homework/w.txt"));
        byte[] bytes = new byte[1024];
        int len ;
        while((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
