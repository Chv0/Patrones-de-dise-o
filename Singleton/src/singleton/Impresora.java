/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/*@author Dany
 */
public class Impresora {
    
	private static Impresora impresora;
	private int NumeroPaginas;
	private Impresora() {
	}
	public static Impresora getInstance() {
		return impresora == null? 
				impresora = new Impresora() : impresora;
	}
	public void print(String text){
		System.out.println(text +
				"\n" + "Número de páginas impresas hoy: " + " " + ++ NumeroPaginas +
				"\n" + "---------"+
                                "\n");
	}
}
