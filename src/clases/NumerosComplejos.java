/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lorenzo
 */
public class NumerosComplejos {
    private double Real;
    private double Imaginaria;
    
    public NumerosComplejos(double real, double imag){
        this.Real = real;
        this.Imaginaria = imag;
    }

    public double getReal() {
        return Real;
    }

    public void setReal(double Real) {
        this.Real = Real;
    }

    public double getImaginaria() {
        return Imaginaria;
    }

    public void setImaginaria(double Imaginaria) {
        this.Imaginaria = Imaginaria;
    }

   
   
    public NumerosComplejos suma (NumerosComplejos c2){
        NumerosComplejos c;
        double real, imag;
        real = this.Real + c2.Real;
        imag = this.Imaginaria + c2.Imaginaria;
        c = new NumerosComplejos(real,imag);
        return c;
    }
    public NumerosComplejos resta(NumerosComplejos c2){
        NumerosComplejos c;
        double real, imag;
        real = this.Real - c2.Real;
        imag = this.Imaginaria - c2.Imaginaria;
        c = new NumerosComplejos(real,imag);
        return c;
    }
     public NumerosComplejos multiplicacion(NumerosComplejos c2){
        NumerosComplejos c;
        double real, imag;
        real = (this.Real * c2.Real) - (this.Imaginaria * c2.Imaginaria);
        imag = (this.Real * c2.Imaginaria) + (this.Imaginaria * c2.Real);
        c = new NumerosComplejos(real,imag);
        return c;
}
     public NumerosComplejos division (NumerosComplejos c2){
         NumerosComplejos c;
         double aux;
         double real, imag;
         aux = (c2.Real*c2.Real) + (c2.Imaginaria*c2.Imaginaria);
         real = (this.Real *c2.Real)- (this.Imaginaria * c2.Imaginaria)/aux;
         imag = (this.Real * c2.Imaginaria) + (this.Imaginaria * c2.Real)/aux;
         c = new NumerosComplejos (real,imag);
         return c;
     }
}
