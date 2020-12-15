package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / getType().getRate();
        //currencyType.getrate / CurrentcyType.getTypeofcurrency(this.(.getrate
    }

    CurrencyType getType();
}
