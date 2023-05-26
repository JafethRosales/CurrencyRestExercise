package Sesion4.Monedas.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CurrencyNameValidator.class)
public @interface CurrencyName {

    String message() default "Nombre inválido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}