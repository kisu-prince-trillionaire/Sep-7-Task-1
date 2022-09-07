package com.enumt.week;

import java.util.Scanner;

public class WeekDayMain {
	enum Days{
		SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
		private int num;
		private Days(int num) {
			this.num = num;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(Days day: Days.values()) {
			if(n==day.num)
				System.out.println(day);
		}

	}

}
