package repetitivas;
public class Cronometro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seg, min, horas;
		
		for (horas = 0; horas < 24; horas++) {
			for(min = 0; min < 60; min++) {
				for(seg = 0; seg < 60; seg++) {
					if (horas < 10) {
						System.out.print("0" + horas);
					} else {
						System.out.print(horas);
					}
					
					if (min < 10) {
						System.out.print(":0" + min);
					} else {
						System.out.print(":" + min);
					}
					
					if (seg < 10) {
						System.out.println(":0" + seg);
					} else {
						System.out.println(":" + seg);
					}
				}
			}
		}
		System.out.println("00:00:00");
	}

}
