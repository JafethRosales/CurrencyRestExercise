package Sesion4.Monedas.service;


import Sesion4.Monedas.exception.CurrencyAlreadyExistsException;
import Sesion4.Monedas.exception.CurrencyNotFoundException;
import Sesion4.Monedas.model.Currency;
import Sesion4.Monedas.model.UpdatedCurrency;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class CurrencyService {

    private Map<String, Currency> banco;

    public CurrencyService() {

        banco = new HashMap<>();

        banco.put("peso", new Currency("Peso", 1.0));
        banco.put("yen", new Currency("Yen", 0.13));
        banco.put("dollar", new Currency("Dollar", 17.83));
    }

    public boolean exists(String name) {
        return banco.containsKey(name.toLowerCase());
    }

    public List<Currency> getAll() {
        return new LinkedList<Currency>(banco.values());
    }

    public Currency getOne(String name) {
        if (!exists(name)) {
            throw new CurrencyNotFoundException(name);
        }

        return banco.get(name.toLowerCase());
    }

    public Currency add(Currency coin) {
        if (exists(coin.getName())) {
            throw new CurrencyAlreadyExistsException();
        }

        banco.put(coin.getName().toLowerCase(), coin);
        return coin;
    }

    public void update(String name, UpdatedCurrency coin) {
        Currency current = banco.get(name);
        current.setValue(coin.getValue());
    }

    public void remove(String name) {
        banco.remove(name);
    }

    public Double equivalence(String coin1, Currency coin2){
        return banco.get(coin1).getValue()/banco.get(coin2).getValue();
    }
}