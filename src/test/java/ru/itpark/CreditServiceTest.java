package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @Test
    void creditCalculator() {
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000,22,12);

            assertEquals(56_156,creditCalculator);
        }
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(0,22,12);

            assertEquals(0,creditCalculator);
        }
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000,22,0);

            assertEquals(0,creditCalculator);
        }
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000,0,12);

            assertEquals(0,creditCalculator);
        }
        {
            CreditService service = new CreditService();
            double creditCalculator = service.creditCalculator(50_000,10,12);

            assertEquals(52_749,creditCalculator);
        }
    }
}