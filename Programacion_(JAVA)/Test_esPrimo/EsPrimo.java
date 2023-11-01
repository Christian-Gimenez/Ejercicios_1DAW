package org.villablanca.primo;

public class EsPrimo {
	public static boolean esPrimo (String args[])
			throws FaltaParametroException,
			Solo1ParametroException,
			NoNumeroPositivoException {
		if (args.length == 0) {
			throw new FaltaParametroException();
		} else if (args.length > 1) {
			throw new Solo1ParametroException();
		} else {
			try {
				float numF = Float.parseFloat(args[0]);
				int num = (int) numF;
				if (num<=0) {
					throw new NoNumeroPositivoException();
				} else {
					for (int i = 2; i < num; i++) {
						if (num % i == 0) {
							return false;
						}
					}
					return true;
				}
			} catch (NumberFormatException e) {
				throw new NoNumeroPositivoException();
			}
		}
		
	}
}
