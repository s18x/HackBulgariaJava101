package week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ParallelMinimalPointCalculations {

	public List<Point> generatePoints() {
		List<Point> list = new LinkedList<>();
		Random random = new Random();
		for (int i = 0; i < 10_000; i++) {
			list.add(new Point(random.nextDouble() * 10_000, random.nextDouble() * 10_000));
		}
		return list;
	}

	public Map<Point, Point> getNearestPoints(List<Point> generatedPoints) {
		Map<Point, Point> pMap = new HashMap<>();
		Point nearestPoint = new Point();
		for (Point originPoint : generatedPoints) {
			for (Point fieldPoint : generatedPoints) {
				if (originPoint == fieldPoint) {
					continue;
				}
				if (Math.sqrt(((nearestPoint.getX() - originPoint.getX()) * (nearestPoint.getX() - originPoint.getX()) + 
						(nearestPoint.getY() - originPoint.getY()) * (nearestPoint.getY() - originPoint.getY()))) > 
					Math.sqrt(((fieldPoint.getX() - originPoint.getX()) * (fieldPoint.getX() - originPoint.getX()) + 
						(fieldPoint.getY() - originPoint.getY()) * (fieldPoint.getY() - originPoint.getY())))) {
					nearestPoint = fieldPoint;
				}
			}
			pMap.put(originPoint, nearestPoint);
		}
		return pMap;
	}

	public Map<Point, Point> doCalculations(List<Point> inPoints, int indexFrom, int indexTo, Map<Point, Point> outMap) {
		Point[] pointsArray = new Point[inPoints.size()];
		inPoints.toArray(pointsArray);
		return outMap;
	}

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		ParallelMinimalPointCalculations obj = new ParallelMinimalPointCalculations();
		Map<Point, Point> pMap = obj.getNearestPoints(obj.generatePoints());
		Iterator it = pMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Point, Point> pair = (Map.Entry<Point, Point>)it.next();
			System.out.println("(" + pair.getKey() + ", " + pair.getValue() + ")");
			it.remove();
		}
		long endTime = System.nanoTime();
		System.out.println("Took: " + (endTime - startTime) / 1_000_000_000 + "s");

	}

}
