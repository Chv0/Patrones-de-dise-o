/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.app;

import ejemplo.boton.Botones;
import ejemplo.checkbox.CheckBox;
import ejemplo.factory.GuiFactory;

/**
 *
 * @author Chv0
 */
public class Cliente {
    private Botones boton;
    private CheckBox box;

    public Cliente(GuiFactory fabrica) {
        boton=fabrica.crearBoton();
        box=fabrica.crearCheckBox();
    }
    
    public void paint(){
        boton.paint();
        box.paint();
    }
}
