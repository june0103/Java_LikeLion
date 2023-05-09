package com.test.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// ServerSocket 객체를 생성
			// 프로그램이 사용할 포트 번호를 지정
			// 포트번호를 기존에 사용하고있다면 오류발생
			ServerSocket server = new ServerSocket(30000);
			System.out.println("서버 가동");

			// 사용자 접속 대기
			// 사용자의 접속을 대기하며 접속에 성공하면 접속한 클라이너트와 1:1로
			// 연결되어 있는 socket이 생성
			Socket socket = server.accept();
			System.out.println(socket);

			// 데이터를 보낸다
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("서버가 보낸 문자열");

			// 클라이언트가 보낸 데이터를 받는다.
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			boolean data3 = dis.readBoolean();
			String data4 = dis.readUTF();

			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			System.out.println(data4);

			// 클라이언트와 연결 해제
			socket.close();

			// 서버 종료
			server.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
