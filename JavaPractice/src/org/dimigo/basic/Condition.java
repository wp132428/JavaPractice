package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int Distance = 25;
		String Model = "고속버스";

		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.printf("거리 : %dkm\n", Distance);
		System.out.printf("차종 : %s\n", Model);
		if (Distance <= 10) {
			switch (Model) {
			case "고속버스":
				System.out.println("통행료 : 850원\n");
				break;
			case "경차":
				System.out.println("통행료 : 300원\n");
				break;
			default:
				System.out.println("통행료 : 600원\n");
				break;
			}
		} else {
			int High = 0;
			int Other = 0;
			while (true) {
				if (Distance > 10) {
					switch (Model) {
					case "고속버스":
						++High;
						Distance -= 10;
					default:
						++Other;
						Distance -= 10;
					}
				} else {
					break;
				}
			}

			switch (Model) {
			case "고속버스":
				System.out.printf("통행료 : %d원\n", 850 + (High * 300));
				break;
			case "경차":
				System.out.printf("통행료 : %d원\n", 300 + (Other * 200));
				break;
			default:
				System.out.printf("통행료 : %d원\n", 600 + (Other * 200));
				break;
			}
		}
	}
}
