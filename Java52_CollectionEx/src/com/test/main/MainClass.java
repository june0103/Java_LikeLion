package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java39 AbstractEx 예제에서 배열부분을 ArrayList로 변경

		// Factory 객체 생성
		Factory factory = new Factory();

		// 자동차 종류
		int carType = 0;

		do {
			// 자동차 종류 입력
			carType = factory.inputCarType();

			if (carType != 0) {
				// 자동차 정보 입력
				factory.inputCarInfo(carType);
			}
		} while (carType != 0);

		factory.printCarInfo();

	}

}
