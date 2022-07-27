package ru.netology.stats;
public class StatsService {


        public int amountSale(int[] sale) {
            int amount = 0;
            for (int i = 0; i < sale.length; i++) {
                amount = amount + sale[i];
            }
            return amount;
        }

        public int averageSale(int[] sale) {
            int amount = 0;
            for (int i = 0; i < sale.length; i++) {
                amount = amount + sale[i];
            }
            int average = amount / sale.length;
            return average;
        }

        public int maxAmountSale(int[] sale) {
            int maxMonth = 0;
            int month = 0;
            for (int saleMax : sale) {
                if (saleMax >= sale[maxMonth]) {
                    maxMonth = month;
                }
                month = month + 1;
            }
            return maxMonth + 1;
        }

        public int minAmountSale(int[] sale) {
            int minMonth = 0;
            int month = 0;
            for (int saleMin : sale) {
                if (saleMin <= sale[minMonth]) {
                    minMonth = month;
                }
                month = month + 1;
            }
            return minMonth + 1;
        }

        public int quantityMonthBelowAverage(int[] sale) {
            int below = 0;
            int amount = 0;
            for (int i = 0; i < sale.length; i++) {
                amount = amount + sale[i];

            }
            int average = amount / sale.length;
            for (int i = 0; i < sale.length; i++) {
                if (sale[i] < average) {
                    below = below + 1;
                }
            }
            return below;
        }

        public int quantityMonthHigherAverage(int[] sale) {
            int higher = 0;
            int amount = 0;
            for (int i = 0; i < sale.length; i++) {
                amount = amount + sale[i];
            }
            int average = amount / sale.length;
            for (int i = 0; i < sale.length; i++) {
                if (sale[i] > average) {
                    higher = higher + 1;
                }
            }
            return higher;
        }

}
