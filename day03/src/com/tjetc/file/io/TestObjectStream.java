package com.tjetc.file.io;

import java.io.*;

public class TestObjectStream {
    /*
    ObjectStream
        序列化（Serialize):将内存的对象数据信息存到磁盘中。（拆分对象）
        反序列化（DeSerialize）：将硬盘的数据重新恢复到内存当中，恢复成java对象。
        Serializalbe接口，只是一个标志性接口，起到标志作用，让JVM参考，JVM会为该类创建一个序列化版本号。
        序列化版本号的作用：（区分类）
        第一：Java通过类名进行比对，如果类名不一样，肯定不是同一个类。
        第二：如果类名一样，靠序列化版本号区分。
        就算两个人写了同一个类，jvm但不是同一个类，这个时候序列化版本号可以将他们区分。
     */
        public static void main1(String[] args) throws IOException {
            Student student = new Student("zhangsan",11);
            //创建对象输出流
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/序列化对象.txt"));
            //序列化对象
            stream.writeObject(student);
            stream.close();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            //创建对象输出流
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream( "D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/序列化对象.txt"));
            Student student = (Student) stream.readObject();
            System.out.println(student);
            stream.close();
    }
}
