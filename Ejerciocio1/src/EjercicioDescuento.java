import java.util.Scanner;

public class EjercicioDescuento {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Ingresa el monto de tus ventas en número: ");
	float com =  in.nextInt();
	double  res1;
	if (com>=10000) {
		res1 =(float) (com*0.30);
	}else if (com>=5001) {
			res1= (float) (com*0.20);
	}else if (com>=1001) {
			res1= (float) (com*0.10);
	} else {
		res1 = 0;
	}//  else

	System.out.println("Tu comisión es de: "+res1);
	in.close();
}
	}

