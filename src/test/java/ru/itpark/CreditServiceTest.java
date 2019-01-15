package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @Test
    @DisplayName("Credit 50_000")
    void creditCalculator() {
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000, 22, 12);

            assertEquals(56_156, creditCalculator);
        }
    }
    @Test
    @DisplayName("Creditdata 0")
    void creditCalculatorWithZeroCreditdata() {
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000, 22, 0);

            assertEquals(0, creditCalculator);
        }
    }

    @Test
    @DisplayName("IntrestRate 0")
    void creditCalculatorWithZeroIntrestRate() {
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000, 0, 12);

            assertEquals(0, creditCalculator);
        }
    }
    @Test
    @DisplayName("Credit 0")
    void creditCalculatorWithZeroSumm() {
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(0, 22, 12);

            assertEquals(0, creditCalculator);
        }
    }
    @Test
    @DisplayName("Credit 10% IntrestRate ")
    void creditCalculatorWithIntrestRate() {
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000, 10, 12);

            assertEquals(52_749, creditCalculator);
        }
    }
}