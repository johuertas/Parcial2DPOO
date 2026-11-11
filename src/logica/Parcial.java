package logica;

public class Parcial {
	
	private double a;
	private double b;
	private double c;
	private double resultado;
	
	public String cuadratica(double a, double b, double c) throws Exception {
		if (a == 0) {
			throw new Exception("División sobre cero");
		} 
		else if ((Math.pow(b, 2) - 4*a*c) < 0) {
			throw new Exception("Raiz compleja");
		}
		else {
			double raiz_positiva = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/ 2*a;
			double raiz_negativa = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/ 2*a;
			
			if (raiz_positiva == raiz_negativa)
				return "x=" + raiz_positiva;
			else {
				return "x=" + raiz_positiva + ", " + "x=" + raiz_negativa;
			}
		}
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	public void setResultado(String res) {
		this.resultado = res;
	}
}
