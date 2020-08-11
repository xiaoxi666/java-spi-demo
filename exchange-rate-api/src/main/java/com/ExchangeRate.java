package com;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ExchangeRate {
 
    public Iterator<ExchangeRateProvider> providers(boolean refresh) {
        ServiceLoader<ExchangeRateProvider> loader =
            ServiceLoader.load(ExchangeRateProvider.class);

        if (refresh) {
            loader.reload();
        }
        return loader.iterator();
    }
}