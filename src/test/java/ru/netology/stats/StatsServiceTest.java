package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void amountSale() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.amountSale(sale);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void avarageSale() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSale(sale);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxAmountSale() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAmountSale = 8;
        int actualMaxAmountSale = service.maxAmountSale(sale);

        Assertions.assertEquals(expectedMaxAmountSale, actualMaxAmountSale);
    }

    @Test
    public void minAmountSale() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAmountSale = 9;
        int actualMinAmountSale = service.minAmountSale(sale);

        Assertions.assertEquals(expectedMinAmountSale, actualMinAmountSale);
    }

    @Test
    public void quantityMonthBelowAcerage() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMonthBelowAverage = 5;
        int actualQuantityMonthBelowAverage = service.quantityMonthBelowAverage(sale);

        Assertions.assertEquals(expectedQuantityMonthBelowAverage, actualQuantityMonthBelowAverage);
    }

    @Test
    public void quantityMonthHigherAverage() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonthHigherAverage = 5;
        int actualQuantityMonthHigherAverage = service.quantityMonthHigherAverage(sale);

        Assertions.assertEquals(expectedQuantityMonthHigherAverage, actualQuantityMonthHigherAverage);
    }
}
