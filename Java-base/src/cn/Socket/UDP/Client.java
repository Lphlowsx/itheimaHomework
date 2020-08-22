package cn.Socket.UDP;
/*
 *  @author:  CodingYoo
 *  date:     8/22/2020  8:18 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建发送对象，随机端口发出
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            String s = sc.nextLine();
            if("886".equals(s)){
                break;
            }
            byte[] bt = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10000;
            // DatagramPacket(byte[] buf, int length, InetAddress address, int port)  构造方法
            DatagramPacket dp = new DatagramPacket(bt,bt.length,address,port);
            //发送数据
            ds.send(dp);
        }
        ds.close();
    }
}
