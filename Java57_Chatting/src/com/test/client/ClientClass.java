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

		// ���1
		// - ���� ����
		// - ���� ���� ������ �����κ��� �޽��� ���Ŵ��
		// - �����κ��� �޽��� ���Ž� ���ŵ� �޽��� ���

		// ���2
		// - Ű���� �Է� ���
		// - Ű���� �Է� �߻��� �Էµ� �޽����� ������ ����

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

			// ���� ����
			socket = new Socket(sERVER_IP, SERVER_PORT);
//			System.out.println(socket);

			// ������ �г��� ����
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			System.out.print("�г��� : ");
			String nickName = scanner.next();
			dos.writeUTF(nickName);

			// �޽��� ���� ������ ����
			MessageInputClss messageInputClss = new MessageInputClss(socket);
			messageInputClss.start();

			// Ű���� �Է� ������ ����
			KeyboardInputClass keyboardInputClass = new KeyboardInputClass(socket);
			keyboardInputClass.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �޽��� ����
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
					// �����κ��� ������ ���� ���
					String msg = dis.readUTF();
					System.out.println(msg);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// Ű���� �Է� ���
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
					// Ű����κ��� �Է�
					String msg = scanner.next();
					// ������ ����
					dos.writeUTF(msg);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
