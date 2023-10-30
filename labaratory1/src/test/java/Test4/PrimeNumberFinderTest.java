package Test4;

import task4.PrimeNumberFinder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class PrimeNumberFinderTest {
    @Test
    public void testFindPrimeIndexes() {
        PrimeNumberFinder finder = new PrimeNumberFinder();
        int[] arr = {2, 4, 7, 11, 15, 19, 20, 23};
        List<Integer> primeIndexes = finder.findPrimeIndexes(arr);

        Assertions.assertEquals(5, primeIndexes.size()); // Ожидаем, что есть 5 простых чисел
        Assertions.assertEquals(0, primeIndexes.get(0)); // Первое простое число находится в индексе 0
        Assertions.assertEquals(2, primeIndexes.get(1)); // Второе простое число находится в индексе 2
        Assertions.assertEquals(3, primeIndexes.get(2)); // Третье простое число находится в индексе 3
        Assertions.assertEquals(5, primeIndexes.get(3)); // Четвертое простое число находится в индексе 5
        Assertions.assertEquals(7, primeIndexes.get(4)); // Пятое простое число находится в индексе 7
    }

    @Test
    public void testIsPrime() {
        PrimeNumberFinder finder = new PrimeNumberFinder();
        Assertions.assertTrue(finder.isPrime(2)); // 2 - простое число
        Assertions.assertTrue(finder.isPrime(11)); // 11 - простое число
        Assertions.assertTrue(finder.isPrime(17)); // 17 - простое число
        Assertions.assertFalse(finder.isPrime(1)); // 1 не является простым числом
        Assertions.assertFalse(finder.isPrime(4)); // 4 не является простым числом
        Assertions.assertFalse(finder.isPrime(15)); // 15 не является простым числом
    }
}
