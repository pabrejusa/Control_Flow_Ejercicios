//import java.util.Scanner; 
//public class SwitchDemo {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Escribe el mes del 1 al 12: ");
//		int month= in.nextInt();
//		String monthString= "";
//		switch (month) {
//		case 1:
//			monthString= "31";
//			break;
//		case 2:
//			monthString= "28";
//			break;
//		case 3:
//			monthString= "31";
//			break;
//		case 4:
//			monthString= "30";
//			break;
//		case 5:
//			monthString= "31";
//			break;
//		case 6:
//			monthString= "30";
//			break;
//		case 7:
//			monthString= "31";
//			break;
//		case 8:
//			monthString= "31";
//			break;
//		case 9:
//			monthString= "30";
//			break;
//		case 10:
//			monthString= "31";
//			break;
//		case 11:
//			monthString= "30";
//			break;
//		case 12:
//			monthString= "31";
//			break;
//			default:
//				monthString="Mes invalido";
//				break;
//		}//Switch
//		System.out.println(monthString);
//		in.close();
//	}
//
//}

//OTRA FORMA 
import java.util.Scanner; 
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe el mes del 1 al 12: ");
		int month= in.nextInt();
		String monthString= "";
		switch (month) {
		case 1,3,5,7,8,10,12:
			monthString= "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			monthString= "30";
			break;
		case 2:
			monthString= "28/29";
			break;
			default:
				monthString="Mes invalido";
				break;
		}//Switch
		System.out.println(monthString);
		in.close();
	}

}
