package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
/*	int lenght = 3;
	int width = 5;
	int height = 7;
	int volue = lenght * width * height;
        System.out.println(volue);
        int area = lenght * width;
		System.out.println(area);*/


	/*	Box box = new Box(3, 55, 32);
		box.setLength(7);
		System.out.println(box);
		System.out.println(box.getVolume());

		System.out.println(box.isCube());

		Box korobka = new Box(5,5,5);
		System.out.println(korobka.isCube());
		System.out.println(korobka);*/

		Student igor = new Student("Igor","Novikov","Uriyovich",
				LocalDate.of(1995 , Month.JULY, 5), "Male",
				LocalDate.of(2015, Month.SEPTEMBER,1));
		System.out.println(igor.isAdult());

	}


}



// перевірити, являється чи коробка валідна (довжина. висота і ширина не має бути 0 )
