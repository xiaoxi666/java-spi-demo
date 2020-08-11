package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class YahooQuoteManagerImpl implements QuoteManager {
 
    @Override
    public List<Quote> getQuotes(String baseCurrency, LocalDate date) {
        // fetch from Yahoo API
        List<Quote> list = new ArrayList<Quote>();
        list.add(new Quote(baseCurrency + "yahoo", date));
        return list;
    }
}