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
			// ServerSocket ��ü�� ����
			// ���α׷��� ����� ��Ʈ ��ȣ�� ����
			// ��Ʈ��ȣ�� ������ ����ϰ��ִٸ� �����߻�
			ServerSocket server = new ServerSocket(30000);
			System.out.println("���� ����");

			// ����� ���� ���
			// ������� ������ ����ϸ� ���ӿ� �����ϸ� ������ Ŭ���̳�Ʈ�� 1:1��
			// ����Ǿ� �ִ� socket�� ����
			Socket socket = server.accept();
			System.out.println(socket);

			// �����͸� ������
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("������ ���� ���ڿ�");

			// Ŭ���̾�Ʈ�� ���� �����͸� �޴´�.
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

			// Ŭ���̾�Ʈ�� ���� ����
			socket.close();

			// ���� ����
			server.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
