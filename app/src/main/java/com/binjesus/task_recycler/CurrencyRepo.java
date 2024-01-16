package com.binjesus.task_recycler;

import java.util.ArrayList;

public class CurrencyRepo {
    private static CurrencyRepo instance;

    private CurrencyRepo(){}
    public static CurrencyRepo getInstance(){
        if (instance == null)
            instance = new CurrencyRepo();
        return instance;
    }

    public ArrayList<Currency> generateDummyCurrencyList(){
        ArrayList<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency("KWD","Kuwaiti Dinar",1));
        currencies.add(new Currency("USD","US Dollar",0.3));
        currencies.add(new Currency("AUS","Australian Dollar",0.2));
        currencies.add(new Currency("JPY"," Japanese Yen",0.0021));
        currencies.add(new Currency("SAR"," Saudi Riyal",0.082));
        currencies.add(new Currency("QAR","Qatari Riyal",0.084));
        currencies.add(new Currency("MXN","Mexican Peso",0.018));
        currencies.add(new Currency("CHF","Swiss Franc",0.36));
        currencies.add(new Currency("ZAR","South African Rand",0.016));
        currencies.add(new Currency("MAD","Moroccan Dirham",0.031));


return currencies;
}
    }
