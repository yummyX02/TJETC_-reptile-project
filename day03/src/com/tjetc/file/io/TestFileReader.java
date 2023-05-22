package com.tjetc.file.io;

import com.sun.security.jgss.GSSUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    /*
    FileReader
        文件字符输入流，只能读取普通文本。
        读取文本内容时，比较方便，快捷。
        操作跟FileInputStream类似，将byte数组，改为char数组即可，也可以用String的方法将其装换成字符串形式。
        read()方法返回值是int类型的
     */
    public static void main1(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/a.txt");
        int read = fileReader.read();
        System.out.println((char)read);
    }

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/a.txt");
        int len;
        char[] chars = new char[1024];
        while((len = fileReader.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
    }
}
