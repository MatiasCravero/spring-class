package com.numerosromanostest.numerosromanostest.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NumeroRomano {
    private String valor;
    private String message;


    public NumeroRomano convertir(int numInit) throws Exception{
        System.out.print("Numero: ");
        int numero = numInit;
        if ( numero == 0 ) throw new Exception("El número ingresado es 0, no está permitido");

        if ( numero > 0 && numero < 4000 )
        {
            String resultado = "";
            for ( int copia = numero, pos = 0; copia > 0; copia /= 10 ) {
                int digito = copia % 10;
                switch (pos) {
                    case 3:
                        switch (digito) {
                            case 1:
                                resultado = "M" + resultado;
                                break;
                            case 2:
                                resultado = "MM" + resultado;
                                break;
                            case 3:
                                resultado = "MMM" + resultado;
                                break;
                        }
                        break;

                    case 2:
                        switch (digito) {
                            case 1:
                                resultado = "C" + resultado;
                                break;
                            case 2:
                                resultado = "CC" + resultado;
                                break;
                            case 3:
                                resultado = "CCC" + resultado;
                                break;
                            case 4:
                                resultado = "CD" + resultado;
                                break;
                            case 5:
                                resultado = "D" + resultado;
                                break;
                            case 6:
                                resultado = "DC" + resultado;
                                break;
                            case 7:
                                resultado = "DCC" + resultado;
                                break;
                            case 8:
                                resultado = "DCCC" + resultado;
                                break;
                            case 9:
                                resultado = "CM" + resultado;
                                break;
                        }
                        break;

                    case 1:
                        switch (digito) {
                            case 1:
                                resultado = "X" + resultado;
                                break;
                            case 2:
                                resultado = "XX" + resultado;
                                break;
                            case 3:
                                resultado = "XXX" + resultado;
                                break;
                            case 4:
                                resultado = "XL" + resultado;
                                break;
                            case 5:
                                resultado = "L" + resultado;
                                break;
                            case 6:
                                resultado = "LX" + resultado;
                                break;
                            case 7:
                                resultado = "LXX" + resultado;
                                break;
                            case 8:
                                resultado = "LXXX" + resultado;
                                break;
                            case 9:
                                resultado = "XC" + resultado;
                                break;
                        }
                        break;

                    case 0:
                        switch (digito) {
                            case 1:
                                resultado = "I" + resultado;
                                break;
                            case 2:
                                resultado = "II" + resultado;
                                break;
                            case 3:
                                resultado = "III" + resultado;
                                break;
                            case 4:
                                resultado = "IV" + resultado;
                                break;
                            case 5:
                                resultado = "V" + resultado;
                                break;
                            case 6:
                                resultado = "VI" + resultado;
                                break;
                            case 7:
                                resultado = "VII" + resultado;
                                break;
                            case 8:
                                resultado = "VIII" + resultado;
                                break;
                            case 9:
                                resultado = "IX" + resultado;
                                break;
                        }
                        break;
                }
                ++pos;
            }
            this.valor = resultado;
            return this;
        }
        else
            throw  new Exception("Ingrese un numero entre 1 y 3999 inclusive");
    }
}
