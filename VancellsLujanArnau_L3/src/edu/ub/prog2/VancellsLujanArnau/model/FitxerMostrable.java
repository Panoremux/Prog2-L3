/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.VancellsLujanArnau.model;
import edu.ub.prog2.VancellsLujanArnau.controlador.ReproductorVisor;
import edu.ub.prog2.utils.AplicacioException;

/**
 *
 * @author arnau
 */
public abstract class FitxerMostrable extends FitxerMultimedia{
    int heigth;
    int width;
    ReproductorVisor repVis;
    public FitxerMostrable(String path,String nom, int alcada, int amplada,ReproductorVisor repVis) {
        super(path);
        heigth=alcada;
        width=amplada;
        super.setNom(nom);
    }
    
    protected abstract void mostrar() throws AplicacioException;
}