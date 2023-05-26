package Sesion4.Monedas.model;

import Sesion4.Monedas.validation.CurrencyName;
import Sesion4.Monedas.validation.CurrencyValue;

public class Currency {

    @CurrencyName
    String name;
    @CurrencyValue
    Double value;

    public Currency(String name, Double value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


}
