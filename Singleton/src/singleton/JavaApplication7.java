
package singleton;

/**
 *
 * @author Dany
 */
public class JavaApplication7 {

    
    public static void main(String[] args) {
        
        
        Empleado andreas = new Empleado ("Andreas",
		"Jefe",
		"Gestiona la sucursal");
	Empleado julia = new Empleado ("Julia",
		"Consultor",
		"Asesora a los clientes sobre las quejas");
	Empleado tom = new Empleado ("Tom",
		"Venta",
		"Vende los productos");
	Empleado stefanie = new Empleado ("Stefanie",
		"Desarrollador",
		" Mantenimiento informático en la sucursal.");
	Empleado matthias = new Empleado ("Matthias",
		"Contable",
		"contabilidad financiera de la sucursal.");
	andreas.printCurrentfuncion();
	julia.printCurrentfuncion();
	tom.printCurrentfuncion();
	stefanie.printCurrentfuncion();
	matthias.printCurrentfuncion();
    }

}
