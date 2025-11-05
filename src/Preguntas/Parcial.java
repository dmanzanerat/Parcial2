package Preguntas;

public class Parcial{
	
	public String pregunta1(double a, double b, double c) {
		if (a == 0) {
			throw new ArithmeticException("denominador no puede ser cero");
		}
		double raiz = Math.pow(b, 2) - (4*a*c);
		if (raiz < 0) {
			throw new ArithmeticException("raiz negativa");
		}
		double raiz1 = ((-1)*b+Math.sqrt(raiz))/(2*a);
		double raiz2 = ((-1)*b-Math.sqrt(raiz))/(2*a);
		return "Las raices de la ecuacion son: " + raiz1 + " y " + raiz2;
	}
}