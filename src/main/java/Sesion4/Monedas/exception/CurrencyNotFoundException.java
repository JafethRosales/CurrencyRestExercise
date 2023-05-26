package Sesion4.Monedas.exception;

public class CurrencyNotFoundException extends RuntimeException{

    private String name;

    public CurrencyNotFoundException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
