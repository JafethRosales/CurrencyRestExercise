package Sesion4.Monedas.config;


import Sesion4.Monedas.exception.CurrencyAlreadyExistsException;
import Sesion4.Monedas.exception.CurrencyNotFoundException;
import Sesion4.Monedas.model.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(CurrencyNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(CurrencyNotFoundException ex){
        return  ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorResponse(ex.getName() + " was not found"));
    }

    @ExceptionHandler(CurrencyAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleAlreadyExists(){
        return  ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorResponse("Currency already exists"));
    }
}
