package org.perscholas.exercise;

public class HomeClass {

			public static void main(String[] args) {

			question_1();
			question_2();
			question_3();
			question_4();
			question_5();
			question_6();
			question_7();

		}

		private static void question_7() {

			Object[][] cafeProduct = { { "coffee", 5 }, { "cappuccino", 3 }, { "espresso", 6 } };

			final double SALES_TAX = 0.15;

			int item1 = (int) cafeProduct[0][1] * 3;
			int item2 = (int) cafeProduct[1][1] * 4;
			int item3 = (int) cafeProduct[2][1] * 3;

			int order[] = { 3, 4, 3 };

			int subTotal = item1 + item2 + item3;
			double Total = subTotal + subTotal * SALES_TAX;

			System.out.printf("\n|%-10s | %-15s | %-5s| %5s |%n", "No", "Item", "price", "quantity");
			for (int i = 0; i < cafeProduct.length; i++) {
				System.out.printf("|%-10s | %-15s | %-5s| %5s %n", (i + 1), cafeProduct[i][0], cafeProduct[i][1],
						order[i]);
			}
			System.out.printf("%n %-40s  %-1s  %n", "sub Total ", subTotal);

			System.out.printf("%n %-40s  %-1s %-1s %n", "SALES_TAX ", SALES_TAX, "%");

			System.out.printf("%n %-40s  %-1s  %n", "TotalPrice  ", Total);

		}

		private static void question_6() {
			final double PI = 3.14159265358979323846;
			int rad = 3;

			double area = PI * rad * rad;

			System.out.println("Area of a circle with radius " + rad + "= " + area);

		}

		private static void question_5() {
			// TODO Auto-generated method stub
			int x = 5;
			int y = 6;
			int q = y / x;

			System.out.println("the result of q without  casting = " + q);

			double q2 = (double) y / x;

			System.out.println("the result of q after casting = " + q2);
		}

		private static void question_4() {

			int num7 = 8;
			int num8 = 3;

			// need to cast to double before we make any division work in the values
			double Sum4 = (double) num7 / (double) num8;

			System.out.println("  num7 / num8  after casting to double = " + Sum4);

		}

		private static void question_3() {
			int num5 = 3;
			double num6 = 4.22;
			double Sum3 = num5 + num6;

			System.out.println("the sum of double and int  values of  num5 and num6 = " + Sum3);

		}

		private static void question_2() {
			double num3 = 3.4;
			double num4 = 4.2;
			double doubleSum = num3 + num4;

			System.out.println("the sum of double values of  num3 and num4 = " + doubleSum);

		}

		private static void question_1() {
			int num1 = 3;
			int num2 = 4;
			int sum = num1 + num2;

			System.out.println("the sum of two int values of  num1 and num2 = " + sum);
		}

	}

