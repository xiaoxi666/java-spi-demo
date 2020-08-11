package com;

public class SomeExchangeRateProvider implements ExchangeRateProvider {
 
    @Override
    public QuoteManager create() {
        return new SomeQuoteManagerImpl();
    }
}