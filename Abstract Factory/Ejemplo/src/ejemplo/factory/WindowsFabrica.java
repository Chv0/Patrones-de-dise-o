/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.factory;

import ejemplo.boton.Botones;
import ejemplo.boton.WindowsButoon;
import ejemplo.checkbox.CheckBox;
import ejemplo.checkbox.WindowsCheckBox;

/**
 *
 * @author Chv0
 */
public class WindowsFabrica implements GuiFactory{

    @Override
    public Botones crearBoton() {
        return new WindowsButoon();
    }

    @Override
    public CheckBox crearCheckBox() {
        return new WindowsCheckBox();
    }
    
}
