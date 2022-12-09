
package singleton;

import singleton.Impresora;
/**@author Dany
 */
public class Empleado {
    private final String name;
	private final String position;
	private final String role;
	public Empleado(String name, String position, String role) {
		this.name = name;
		this.position = position;
		this.role = role;
	}
	public void printCurrentfuncion (){
        Impresora impresora = Impresora.getInstance();
		impresora.print("Empleado: " + name + "\n" +
			"Posición: " + position + "\n" +
			" Función: " + role + "\n");
	}
}













