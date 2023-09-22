package com.codewithmosh.B_Structural.e_flyweight.lecture;

import java.util.ArrayList;
import java.util.List;

public class PointService {

	private PointIconFactory icon;
	
	public PointService(PointIconFactory icon) {
		this.icon = icon;
	}
	
	public List<Point> getPoints(){
		List<Point> points = new ArrayList<>();
		var point = new Point(12, 43, icon.getPointIcons(PointType.CAFE));
		points.add(point);
		return points;
	}
	
}
