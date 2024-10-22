package ru.viktorgezz.dto;

import ru.viktorgezz.model.ExchangeRate;

public class ExchangeDto {

    private ExchangeRate exchangeRate;

    private Double amount;

    private Double convertedAmount;

    public ExchangeDto() {
    }

    public ExchangeDto(ExchangeRate exchangeRate, Double amount, Double convertedAmount) {
        this.exchangeRate = exchangeRate;
        this.amount = amount;
        this.convertedAmount = convertedAmount;
    }

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    @Override
    public String toString() {
        return "ExchangeDTO{" +
                "exchangeRate=" + exchangeRate +
                ", amount=" + amount +
                ", convertedAmount=" + convertedAmount +
                '}';
    }
}
