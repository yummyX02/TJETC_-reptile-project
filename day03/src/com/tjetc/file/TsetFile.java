package com.tjetc.file;

import java.io.File;
import java.io.IOException;

public class TsetFile {
    /*
    文件操作
        相对路径指的是当前项目的根目录
        注意在创建新文件或目录时不能重名 重名的话不创建
     IO流
        所有的流都是可关闭的，都有close（）方法，流是一个管道，是内存和硬盘之间的管道，用完后一定要关闭，不然会浪费很多资源。
        所有的输出流：都实现了java.io.Flushiable接口，都是可刷新的，都有flush方法，输出流最后输出之后，一定要记得flush()
        表示将管道中剩余为输出的数据强行输出完（清空管道），刷新就是为了清空管道。如果没有flush()肯能会造成数据丢失。

     */
    public static void main(String[] args) throws IOException {
        // 文件对象的创建
//        File file = new File("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/b.txt");
        File file = new File("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/b.txt");
        // 文件名创建
        file.createNewFile();
        // 目录创建
//        file.mkdir();
        // 文件删除
//        file.delete();
        // 查看当前文件夹的内容
//        String[] flieList = file.list();
//        for (String s : flieList) {
//            System.out.println(s);
//        }
//        获取所有文件对象
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            // 获取文件对象名字
//            System.out.println(file1.getName());
//        }

    }
}
