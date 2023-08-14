
public class Ejercicio2 {

	public static void main(String[] args) {
		int n = 10;
		double a = 20.5;
		char c = 'a';
		
		System.out.println("El valor de cada variable:"+"\nint:"+n+"\ndouble:"+a+"\nchar:"+c);
		System.out.println("La suma de N + A:"+(n+a));
		System.out.println("La diferencia de A + N:"+(a-n));
		int valorNumerico = (int) c;
		System.out.println("Valor numero de "+c+" : "+valorNumerico);
		
		n = 5;
		a = 4.56;
		c = 'a';
		System.out.println("Variable N:"+n);
		System.out.println("Variable A:"+a);
		System.out.println("Variable C:"+c);
		System.out.println(n+" + "+a+" = "+(n+a));
		System.out.println(a+" - "+n+" = "+(a-n));
		System.out.println("Valor numero de "+c+" : "+valorNumerico);
	}

}
