package Services;
import java.lang.Math;

public class Operacoes {
	// private double num1, num2, num3;

	// public Operacao(double num1, double num2) {
	// 	this.num1 = num1;
	// 	this.num2 = num2;
	// }
	
	public double Adicionar (double num1, double num2) {
		double num3 = num1 + num2;		
		return num3;
	}	
	
	public double Multiplicar (double num1, double num2) {
		double num3 = num1 * num2;	
		return num3;
	}
	
	public double Subtrair (double num1, double num2) {
		double num3 = num1 - num2;		
		return num3;
	}
	
	public double Dividir (double num1, double num2) {
		double num3 = num1 / num2;		
		return num3;
	}
	
	public double ExpoenteRaiz (double num1, double num2) {
		if (num2 == 0) {
			double num3 = Math.sqrt(num1);
			return num3;
		}else {
			double num3 = Math.pow(num1, num2);
			return num3;
		}
		//return num3;
	}
}
