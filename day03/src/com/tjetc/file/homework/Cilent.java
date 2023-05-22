package com.tjetc.file.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cilent {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
//        写给服务端
        out.write("你好，我是客户端".getBytes());
        out.flush();
//        告诉服务器已经输入完毕
        socket.shutdownInput();
//        读取服务器所返回的信息
        byte[] bytes = new byte[1024];
        int len;
        len = in.read(bytes);
        while(len != -1){
            System.out.println(new String(bytes,0,len));
        }
//        先用后关
        out.close();
        in.close();
    }

}
