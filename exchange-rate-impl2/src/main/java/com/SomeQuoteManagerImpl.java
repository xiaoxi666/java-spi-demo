package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SomeQuoteManagerImpl implements QuoteManager {
 
    @Override
    public List<Quote> getQuotes(String baseCurrency, LocalDate date) {
        // fetch from Yahoo API
        List<Quote> list = new ArrayList<Quote>();
        list.add(new Quote(baseCurrency + "some", date));
        return list;
    }
}