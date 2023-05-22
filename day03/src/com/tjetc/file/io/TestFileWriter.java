package com.tjetc.file.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    /*
    FileWriter
        文件字符输出流，写。只能输出普通文本。
        例子：char[] chars = {’我‘，’是‘,'中’}
        write(chars)
        writer（chars,0,2);
        writer("我是中国人“）
        不想被清空再创建输出流对象时，在文件名后面的第二个可填项，添加true)
        bufferedWriter.newLine() 换行独有方法
     */
        public static void main(String[] args) throws IOException {
            FileWriter out = new FileWriter("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/b.txt");
            char[] chars = "我试试".toCharArray();
            out.write( '我');
            out.write( "我是");
            //写入字符数组
            out.write(chars);
            //换行
            out.write(" \n");
            out.close();
    }
}
