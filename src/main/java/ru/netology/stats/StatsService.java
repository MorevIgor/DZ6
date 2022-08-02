package ru.netology.stats;

public class StatsService {


    public long amountSale(long[] sale) {
        long amount = 0;
        for (int i = 0; i < sale.length; i++) {
            amount = amount + sale[i];
        }
        return amount;
    }

    public long averageSale(long[] sale) {

        long average = amountSale(sale) / sale.length;
        return average;
    }

    public long maxAmountSale(long[] sale) {
        int maxMonth = 0;
        int month = 0;
        for (long saleMax : sale) {
            if (saleMax >= sale[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth++;
    }

    public long minAmountSale(long[] sale) {
        int minMonth = 0;
        int month = 0;
        for (long saleMin : sale) {
            if (saleMin <= sale[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth++;
    }

    public long quantityMonthBelowAverage(long[] sale) {
        int below = 0;
        long averageSale = averageSale(sale);

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSale) {
                below++;
            }
        }
        return below;
    }

    public long quantityMonthHigherAverage(long[] sale) {
        int higher = 0;
        long averageSale = averageSale(sale);

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSale) {
                higher++;
            }
        }
        return higher;
    }

}
