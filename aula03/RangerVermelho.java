/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rangers;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author 202002367751
 */
public class RangerVermelho extends PowerRangers {
    
    @Override
    public void morfar() {
        this.setCor("Vermelho");
        this.setArmamento("Faca");
        this.setZord("Rex");
    }
    
    @Override
    public String chamarZord() {
        Component nulll = null;
        JOptionPane.showMessageDialog(nulll, this.getZord());
        return this.getZord();
        
    }
    
}
