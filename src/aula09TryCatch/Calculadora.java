/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09TryCatch;

import java.util.InputMismatchException;

/**
 *
 * @author Jonathas
 */
public class Calculadora {

    private float n1, n2, res;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float somar(float n1, float n2) {
        res = n1 + n2;
        return res;
    }

    public float multiplicar(float n1, float n2) {
        res = n1 * n2;
        return res;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }

    public float subtrair(float n1, float n2) {
        res = n1 - n2;
        return res;
    }

    public float dividir(float n1, float n2) throws ArithmeticException {
        if (n2 == 0) {
            ArithmeticException e = new ArithmeticException();
            throw e;
        } else {
            res = n1 / n2;
            return res;
        }
    }
  
    
}
