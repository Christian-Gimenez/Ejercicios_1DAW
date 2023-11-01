package repetitivas;
import java.util.Scanner;
public class EjAmp2 {

	public static void main(String[] args) {
		/*Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X)
		 * que muestre los números del 0-0-0-0-0 al 9-9-9-9-9
		 * con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
		 */
		
		int d1, d2, d3, d4, d5;
		String uno, dos, tres, cuatro, cinco;
		
		for(d1 = 0; d1 < 10; d1++) {
			if (d1 == 3) {
				uno = "E";
			} else {
				uno = "" + d1;
			}
			for(d2 = 0; d2 < 10; d2++) {
				if (d2 == 3) {
					dos = "E";
				} else {
					dos = "" + d2;
				}
				for(d3 = 0; d3 < 10; d3++) {
					if (d3 == 3) {
						tres = "E";
					} else {
						tres = "" + d3;
					}
					for(d4 = 0; d4 < 10; d4++) {
						if (d4 == 3) {
							cuatro = "E";
						} else {
							cuatro = "" + d4;
						}
						for(d5 = 0; d5 < 10; d5++) {
							if (d5 == 3) {
								cinco = "E";
							} else {
								cinco = "" + d5;
							}
							System.out.println(uno + "-" + dos + "-" + tres + "-" + cuatro + "-" + cinco);
						}
					}
				}
			}
		}

	}

}
