package Sesion4.Monedas.model;

import Sesion4.Monedas.validation.CurrencyValue;

public class UpdatedCurrency {

    @CurrencyValue
    private Double value;

    UpdatedCurrency(){
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
