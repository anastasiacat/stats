package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldSumAllSales() { //сумма всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageAllSales() { //средняя сумма продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAvg = 15;
        double actualAvg = service.avgSales(sales);
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void shouldFindMaxSales() { //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinSales() { //номер месяца, в котором был пик продаж, то есть осуществлены продажи на минимальную сумму
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthsCountBelowAverage() { //количество месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.monthsCountBelowAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void shouldFindMonthsCountUnderAverage() { //количество месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.monthsCountUnderAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
