
public class Ejercicio5 {
	public static void main(String[] args) {
		int A = 1;
		int B = 5;
		int C = 11;
		int D = 52;
		
		B = C;
		System.out.println("B toma el valor de C: "+B);
		
		C = A;
		System.out.println("C toma el valor de A: "+C);
		
		A = D;
		System.out.println("A toma el valor de D: "+A);
		
		D = B;
		System.out.println("D toma el valor de B: "+D);
		
	}
}
