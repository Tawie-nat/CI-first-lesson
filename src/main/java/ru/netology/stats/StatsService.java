package ru.netology.stats;

public class StatsService {

    int sum = 0;

    public int calculateSum(int[] sales) {
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;

    }

    public int calculateAverageSales(int[] sales) {
        return calculateSum(sales) / sales.length;
    }



    public int findMonthMaxSales(int[] sales) {
        int month = 0; //переменная для индекса
        int monthMaxSales = 0;
        for (int sale : sales) {
            if (sale>=sales[monthMaxSales]) {
                monthMaxSales = month;
            }
            month = month + 1;
        }
        return monthMaxSales +1;
    }

    public int findMonthMinSales(int[] sales) {
        int month = 0; //переменная для индекса
        int monthMinSales = 0;
        for (int sale : sales) {
            if (sale<=sales[monthMinSales]) {
                monthMinSales = month;
            }
            month = month + 1;
        }
        return monthMinSales +1;
    }

    public int findAmountMonthWithSalesBellowAverageSales(int[] sales) {
        int monthBellowAverage = 0;
        int averageSales = calculateAverageSales (sales);
        for (int sale : sales) {
            if (sale<averageSales) {
                monthBellowAverage = monthBellowAverage + 1;
                }
        }
        return monthBellowAverage;
    }

    public int findAmountMonthWithSalesUpperAverageSales(int[] sales) {
        int monthUpperAverage = 0;
        int averageSales = calculateAverageSales (sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                monthUpperAverage = monthUpperAverage + 1;
            }
        }
        return monthUpperAverage;
    }


}
