package com.tjetc.file.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferInputStream {
    /*
    BufferedInputStream
        在进行文件的拷贝时，如果一个字节的读写，效率太低，且对磁盘的访问次数过多
        则使用BufferedInputStream类，这是一个缓冲输入流，有一个缓冲数组，每次调用read()方法，从缓冲区读取数据
        若读取失败，再再从文件读取数据存到缓冲区进行显示
     */
    public static void main(String[] args) throws IOException {
        File file =  new File("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/c.txt");
        file.createNewFile();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/c.txt"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bufferedInputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));// 用数字接收，再转换成字符串的形式进行输出
        }
        bufferedInputStream.close();
    }
}
