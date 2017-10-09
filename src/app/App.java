package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero binario");
		numero=s.nextInt();
		System.out.println("El numero en decimal es: "+binario(numero,0));
	}
	
	static double binario (int b, int p){
		if (b==0) {
			return 0;
		}else{
			return (b%10)*(Math.pow(2, p))+binario(b/10,++p);
		}
	}
}
