package llam.endes.calculos;

public class Calculadora {
	
	public static int restar(int num1,int num2) {
		return num1-num2;
		}
	
		public static int dividir(int num1,int num2) {
		return num1/num2;
		}
		
		public static boolean esPar(int num) {
			return(num%2==0);
			}
		
		public static String esParOImpar(int num) {
			if(num%2==0) {
				return "par";
			}
			return "impar";
			}


		

}
