package com;

import java.time.LocalDate;

public class Quote {
    private String currency;
    private LocalDate date;

    public Quote(String currency, LocalDate date) {
        this.currency = currency;
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quote{");
        sb.append("currency='").append(currency).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}