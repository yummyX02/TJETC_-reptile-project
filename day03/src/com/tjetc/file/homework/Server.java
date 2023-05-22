package com.tjetc.file.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        //此时服务端停止，一直等待链接的客户端
        Socket socket = serverSocket.accept();
        byte[] bytes = new byte[1024];
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        int len;
        while((len = in.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        out.write("你好！我是服务端".getBytes());
        out.close();
        in.close();
    }

}
