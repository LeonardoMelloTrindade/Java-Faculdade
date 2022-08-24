package com.mycompany.rangers;

import java.awt.Component;
import javax.swing.JOptionPane;

public class RangerAzul extends PowerRangers {

    public RangerAzul() {
        morfar();
    }

    @Override
    public void morfar() {
        
        this.setCor("Azul");
        this.setArmamento("Espada");
        this.setZord("Dinossauro");
    }

    @Override
    public String chamarZord() {
        Component nulll = null;
        JOptionPane.showMessageDialog(nulll, this.getZord());
        return this.getZord();
        
    }
    @Override
    public String toString(){
        return this.getCor();
    }
}
