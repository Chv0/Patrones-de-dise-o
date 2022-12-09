/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import ejemplo.app.Cliente;
import ejemplo.factory.GuiFactory;
import ejemplo.factory.MacosFabrica;
import ejemplo.factory.WindowsFabrica;

/**
 *
 * @author Chv0
 */
public class Ejemplo {
    
    
    private static Cliente configureApplication() {
        Cliente cliente;
        GuiFactory fabrica;
           String osName = System.getProperty("os.name").toLowerCase();
           if(osName.contains("mac")){
               fabrica=new MacosFabrica();
           }else{
               fabrica=new WindowsFabrica();
           }
           
           cliente = new Cliente(fabrica);
           return cliente;
       }
            
    public static void main(String[] args) {
        Cliente cliente=configureApplication();
        cliente.paint();
    }
    
}
