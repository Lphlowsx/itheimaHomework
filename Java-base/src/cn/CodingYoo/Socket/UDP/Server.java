package cn.CodingYoo.Socket.UDP;
/*
 *  @author:  CodingYoo
 *  date:     8/22/2020  8:18 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        //设置接收端口10000
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            ds.receive(dp);

            byte[] data = dp.getData();
            int length = dp.getLength();

            System.out.println(new String(data,0,length));
        }
    }
}
