package com.codewithmosh.B_Structural.e_flyweight;

import com.codewithmosh.B_Structural.e_flyweight.lecture.PointIconFactory;
import com.codewithmosh.B_Structural.e_flyweight.lecture.PointService;

public class MainLecture {

	public static void main(String[] args) {
		PointService pointService = new PointService(new PointIconFactory());
		for (var point : pointService.getPoints()) {
			point.draw();
		}
	}
}
