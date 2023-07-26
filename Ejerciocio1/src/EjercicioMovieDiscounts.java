import java.util.Scanner;

public class EjercicioMovieDiscounts {

		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.println("Ingrese su edad: ");
			float age =  in.nextInt();
			float  tp;
			if (age<=5) {
				tp =(float) (4.37);
			}else if (age>=60) {
					tp= (float) (4.51);
			} else {
				tp = 7F;
			}//  else

			System.out.println("Ticket Price: "+tp);
			in.close();

	}

}
