package com.test.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���1
		// - ����� ���� ���
		// - ����� ���ӽ� �г��� �Է�
		// - �Է¹��� �г��Ӱ� ������ ������ ��ü�� ��� �ش簴ü�� ArrayList�� ����ش�
		// - �ٽ� ����� ���� ���

		// ���2
		// - ����� �޽����� ���� ���
		// - �޽����� ���޵Ǹ� �̸� �޴´�
		// - ArrayList�� �ִ� ��� ����ڿ��� �޽��� ����

		new ChattingServer();

	}

}

// ä�� ����
class ChattingServer {

	private ServerSocket server;
	final int SERVER_PORT = 40000;
	private ArrayList<UserClass> userList;

	public ChattingServer() {
		try {
			// ����� ��ü�� ���� ArrayList ��ü ������
			userList = new ArrayList<UserClass>();

			// ���� ����
			server = new ServerSocket(SERVER_PORT);
			// ����� ���� ó�� ������ ����
			AccessUserClass accessUserClass = new AccessUserClass();
			accessUserClass.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ε�ĳ���� �޼���
	public synchronized void broadCastingMethod(String userNickName, String msg) {

		try {
			// �޽��� ����
			String sendMsg = userNickName + " : " + msg;

			// ArrayList�� ��ü �� ��ŭ �ݺ�
			for (UserClass userClass : userList) {

				// ���� n��°�� ������Ǵг����� �����´�
				String targetUserNickname = userClass.getUserNickName();

				// �޽����� ���� ����� ������ �������� �ʴ´�.
				if (userNickName == targetUserNickname) {
					continue;
				}

				// �޽����� ������.
				userClass.sendMessage(sendMsg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ����� ���� ó��
	class AccessUserClass extends Thread {

		public void run() {
			try {
				while (true) {
					System.out.println("����� ���� ���");
					Socket socket = server.accept();
					// System.out.println(socket);

					// ����� ��ü ����
					UserClass userClass = new UserClass(socket);
					userClass.start();

					// ����� ��ü�� ArrayList�� ��´�
					userList.add(userClass);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// ����� ���� Ŭ����
	class UserClass extends Thread {

		private String userNickName;
		private Socket socket;
		private InputStream is;
		private OutputStream os;
		private DataInputStream dis;
		private DataOutputStream dos;

		public UserClass(Socket socket) {
			try {
				this.socket = socket;
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void run() {

			try {

				// �г��� �Է�
				userNickName = dis.readUTF();
				System.out.printf("%s ����\n", userNickName);
				// Ŭ���̾�Ʈ���� ȯ�� �޽���
				dos.writeUTF(userNickName + "�� ȯ���մϴ�.");
				// �ٸ� Ŭ���̾�Ʈ���� ȯ�� �޽���
				broadCastingMethod("����", userNickName + "���� �����Ͽ����ϴ�.");

				// ����ڰ� ������ �޽����� ���� ���
				while (true) {
					// ����ڰ� ������ �޽��� ����
					String msg = dis.readUTF();
					// �ٸ� ����ڵ鿡�� ������
					broadCastingMethod(userNickName, msg);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void sendMessage(String msg) {
			try {

				// Ŭ���̾�Ʈ���� ����
				dos.writeUTF(msg);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// �г��� ��ȯ �޼���
		public String getUserNickName() {
			return userNickName;
		}

	}
}
