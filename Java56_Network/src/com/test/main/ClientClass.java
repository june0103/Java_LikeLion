package com.test.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// ������ ����
			// IP�ּҿ� ��Ʈ ��ȣ�� ����
			// 127.0.0.1 : �ڱ� �ڽ� ��ǻ�͸� ����Ű�� IP�ּ�
			// ������ Ŭ���̾�Ʈ�� ���� ��ǻ�Ϳ��� ������ �� ����ϴ� �׽�Ʈ�� IP�ּ�

			Socket socket = new Socket("127.0.0.1", 30000);
			System.out.println(socket);

			// �����͸� �޴´�
			// ��Ʈ�� ����
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

			// ������ �����͸� ������
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			dos.writeInt(200);
			dos.writeDouble(22.22);
			dos.writeBoolean(false);
			dos.writeUTF("Ŭ���̾�Ʈ�� ���� ���ڿ�");

			// ��������
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
