package com.numerosromanostest.numerosromanostest.Controllers;

import com.numerosromanostest.numerosromanostest.Entities.NumeroRomano;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {
    @GetMapping("/numerosromanos")
    public NumeroRomano convertir(@RequestParam(value = "numero", defaultValue = "0") int numInit){
        NumeroRomano numeroRomano = new NumeroRomano();
        try {
            numeroRomano.convertir(numInit);
            numeroRomano.setMessage("OK");
            return numeroRomano;
        }
        catch (Exception e){
            return new NumeroRomano("Not found",e.getMessage());
        }
    }
}
