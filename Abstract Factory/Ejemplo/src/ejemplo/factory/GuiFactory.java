/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.factory;

import ejemplo.boton.Botones;
import ejemplo.checkbox.CheckBox;

/**
 *
 * @author Chv0
 */
public interface GuiFactory {
    Botones crearBoton();
    CheckBox crearCheckBox();
    
}
