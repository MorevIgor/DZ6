package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void amountSale() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualAmount = service.amountSale(sale);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void avarageSale() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actualAverage = service.averageSale(sale);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxAmountSale() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxAmountSale = 8;
        long actualMaxAmountSale = service.maxAmountSale(sale);

        Assertions.assertEquals(expectedMaxAmountSale, actualMaxAmountSale);
    }

    @Test
    public void minAmountSale() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinAmountSale = 9;
        long actualMinAmountSale = service.minAmountSale(sale);

        Assertions.assertEquals(expectedMinAmountSale, actualMinAmountSale);
    }

    @Test
    public void quantityMonthBelowAcerage() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedQuantityMonthBelowAverage = 5;
        long actualQuantityMonthBelowAverage = service.quantityMonthBelowAverage(sale);

        Assertions.assertEquals(expectedQuantityMonthBelowAverage, actualQuantityMonthBelowAverage);
    }

    @Test
    public void quantityMonthHigherAverage() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedQuantityMonthHigherAverage = 5;
        long actualQuantityMonthHigherAverage = service.quantityMonthHigherAverage(sale);

        Assertions.assertEquals(expectedQuantityMonthHigherAverage, actualQuantityMonthHigherAverage);
    }
}
