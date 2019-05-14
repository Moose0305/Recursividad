package com.pablo;

public class Factorial {

    int n=5;
    int res=0;
    //int resultado= factorialRecursivo(n);


    public int factorialRecursivo(int numero){

        //caso base
        if(numero==1) {
            return 1;
        }
        else{


            //recursividad, hasta llegar al caso base
            res= numero* factorialRecursivo(numero-1);
        }
        System.out.println(numero);

        return res;
    }

    public void mostrarResultado(){

       int resultado = factorialRecursivo(n);
        System.out.println(resultado);
    }
}
