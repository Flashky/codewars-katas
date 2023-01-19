package com.codewars.katas.kyu7;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/56541980fa08ab47a0000040/solutions/java">Printer Errors</a>
 */
public class Printer {
    public static String printerError(String s) {
    	return new StringBuilder()
    			.append(String.valueOf(s.chars().filter(n -> n > 109).count()))
    			.append("/")
    			.append(s.length())
    			.toString();
    }
    
    // Soluciones interesantes:
    
    // - Aplicando replaceAll. Este caso elimina todos los caracteres [a-m] aplicando regex y cuenta la longitud de la cadena.
    // https://www.codewars.com/kata/reviews/56541fdbfa08ab68a2000055/groups/5654c0f82687e7202a00005b
    
    // - Filtrando directamente el char:
    // Es igual que mi solución, pero en el filtro usa directamente el char, esto es posible:
    // .filter(n -> n > 'm')
    // https://www.codewars.com/kata/reviews/56541fdbfa08ab68a2000055/groups/565f30d8aaf73926c800008b
}
