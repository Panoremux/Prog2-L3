/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.VancellsLujanArnau.controlador;

import edu.ub.prog2.VancellsLujanArnau.model.CarpetaFitxers;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;
/**
 *
 * @author Arnau
 */
public class EscoltadorReproduccio extends EscoltadorReproduccioBasic{
    
    boolean Premium=true;
    
    
    @Override
    protected void onEndFile() {
        if(hasNext()&&Premium){
            next();
        }else if(hasNext()&&Premium){
            nextPubli();
        }else{
            
        }
    }

    @Override
    protected void next() {
        
    }

    @Override
    protected boolean hasNext() {
        return true;
    }

    @Override
    protected void nextPubli() {
        
    }
    
    public void iniciarReproduccio(CarpetaFitxers llistaReproduint, boolean reproduccioCiclica){
        
    }
    
    public void disablePremium(){
        Premium=false;
    }
}