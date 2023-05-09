package com.test.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기능1
		// - 서버 접속
		// - 서버 접속 성공시 서버로부터 메시지 수신대기
		// - 서버로부터 메시지 수신시 수신된 메시지 출력

		// 기능2
		// - 키보드 입력 대기
		// - 키보드 입력 발생시 입력된 메시지를 서버로 전달

		new ChattingClient();
	}

}

class ChattingClient {

	final String sERVER_IP = "127.0.0.1";
	final int SERVER_PORT = 40000;
	private Socket socket;
	private Scanner scanner;

	public ChattingClient() {
		try {
			scanner = new Scanner(System.in);

			// 서버 접속
			socket = new Socket(sERVER_IP, SERVER_PORT);
//			System.out.println(socket);

			// 서버에 닉네임 전달
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			System.out.print("닉네임 : ");
			String nickName = scanner.next();
			dos.writeUTF(nickName);

			// 메시지 수신 쓰래드 가동
			MessageInputClss messageInputClss = new MessageInputClss(socket);
			messageInputClss.start();

			// 키보드 입력 쓰래드 가동
			KeyboardInputClass keyboardInputClass = new KeyboardInputClass(socket);
			keyboardInputClass.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 메시지 수신
	class MessageInputClss extends Thread {

		private Socket socket;
		private InputStream is;
		private DataInputStream dis;

		public MessageInputClss(Socket socket) {
			try {

				this.socket = socket;
				is = socket.getInputStream();
				dis = new DataInputStream(is);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void run() {
			try {
				while (true) {
					// 서버로부터 데이터 수신 대기
					String msg = dis.readUTF();
					System.out.println(msg);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// 키보드 입력 대기
	class KeyboardInputClass extends Thread {

		private Socket socket;
		private OutputStream os;
		private DataOutputStream dos;

		public KeyboardInputClass(Socket socket) {
			try {

				this.socket = socket;
				os = socket.getOutputStream();
				dos = new DataOutputStream(os);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void run() {
			try {

				while (true) {
					// 키보드로부터 입력
					String msg = scanner.next();
					// 서버로 전송
					dos.writeUTF(msg);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
