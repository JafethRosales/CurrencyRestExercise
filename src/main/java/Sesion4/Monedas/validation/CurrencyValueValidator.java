package Sesion4.Monedas.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CurrencyValueValidator implements ConstraintValidator<CurrencyValue, Double> {

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context){
        return value != null && value > 0;
    }
}

