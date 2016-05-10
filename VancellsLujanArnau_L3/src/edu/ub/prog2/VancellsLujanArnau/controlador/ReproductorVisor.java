/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.VancellsLujanArnau.controlador;


import edu.ub.prog2.VancellsLujanArnau.model.Audio;
import edu.ub.prog2.VancellsLujanArnau.model.FitxerMostrable;
import edu.ub.prog2.VancellsLujanArnau.model.FitxerReproduible;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;
import edu.ub.prog2.utils.ReproductorVisorBasic;

/**
 *
 * @author arnau
 */
public class ReproductorVisor extends ReproductorVisorBasic{
    
    public ReproductorVisor(EscoltadorReproduccioBasic controlador) {
        super(controlador);
    }
    
    public void mostra(FitxerMostrable fmo,int secs) throws AplicacioException{
        super.show(fmo,secs);
    }
}

