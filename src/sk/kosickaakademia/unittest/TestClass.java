package sk.kosickaakademia.unittest;

public class TestClass {

    public double terminovanyVklad(double value, double interest, int period, boolean tax){
        if(value<0 || period<0 || interest<0)
            return 0;
        if(interest==0 || period==0)
            return value;

        int i;
        for(i=0; i<period; i++){
            double profit = (interest/100.0)*value;
            if(tax){
                profit = 0.8 * profit;
            }
            double roundProfit = Math.round(profit*100)/100.0;
            value = value + roundProfit;

        }

        return value;
    }

}
