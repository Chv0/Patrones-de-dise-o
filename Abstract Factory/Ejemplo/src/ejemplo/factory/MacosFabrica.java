/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.factory;

import ejemplo.boton.Botones;
import ejemplo.boton.MacOsButton;
import ejemplo.checkbox.CheckBox;
import ejemplo.checkbox.MacOsCheckBox;

/**
 *
 * @author Chv0
 */
public class MacosFabrica implements GuiFactory{

    @Override
    public Botones crearBoton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox crearCheckBox() {
        return new MacOsCheckBox();
    }
    
}
