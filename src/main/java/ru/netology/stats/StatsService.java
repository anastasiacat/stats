package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) { //сумма всех продаж
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public double avgSales(long[] sales) { //средняя сумма продаж
        long sumSales = sumSales(sales);
        int lengthArray = sales.length;
        return (double) sumSales / lengthArray;
    }

    public int maxSales(long[] sales) { //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //номер месяца, в котором был пик продаж, то есть осуществлены продажи на минимальную сумму
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monthsCountBelowAverage(long[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int count = 0;
        double avgSum = avgSales(sales);
        for (long sale : sales) {
            if (sale < avgSum) {
                count++;
            }
        }
        return count;
    }

    public int monthsCountUnderAverage(long[] sales) { //количество месяцев, в которых продажи были выше среднего
        int count = 0;
        double avgSum = avgSales(sales);
        for (long sale : sales) {
            if (sale > avgSum) {
                count++;
            }
        }
        return count;
    }
}
