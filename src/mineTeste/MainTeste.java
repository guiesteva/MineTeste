package mineTeste;

public class MainTeste {

	public static void main(String[] args) {
		
		Polygon triangulo = PolygonFactory.createPolygon(3);
		System.out.println(triangulo.getDescricao());
		
		Polygon quadrado = PolygonFactory.createPolygon(4);
		System.out.println(quadrado.getDescricao());
		
		Polygon pentagono = PolygonFactory.createPolygon(5);
		System.out.println(pentagono.getDescricao());
	}

}
