public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
		calcularArea();
		calcularPerimetro();
	}

	protected void calcularArea() {
		area = Math.PI * Math.pow(radio, 2);
	}

	protected void calcularPerimetro() {
		perimetro = 2 * Math.PI * radio;
	}

}
