package Sesion4.Monedas.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CurrencyNameValidator implements ConstraintValidator<CurrencyName, String> {

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context){
        return name != null && name.matches("/^[A-Z]+$/i");
    }
}
