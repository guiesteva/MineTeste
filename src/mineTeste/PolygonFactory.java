package mineTeste;

public class PolygonFactory {

	public static Polygon createPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangulo();
		} else if (numberOfSides == 4) {
			return new Quadrado();
		} else if (numberOfSides == 5) {
			return new Pentagono();
		}

		return null;

	}

}
