package com;

public class GoogleFinanceExchangeRateProvider implements ExchangeRateProvider {
 
    @Override
    public QuoteManager create() {
        return new GoogleQuoteManagerImpl();
    }
}