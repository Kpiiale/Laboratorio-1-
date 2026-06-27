package com.clase.indexcontroller.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumaTest {
    Suma suma = new Suma();

    @BeforeEach
    void before() {
        System.out.println("Before: Iniciando Test Suma");
    }

    @Test
    void sumaPositivosTest() {
        System.out.println("SumaPositivosTest: Iniciando Test Suma");
        assertEquals(6, suma.suma(3, 3));
    }

    @Test
    void sumaNegativosTest() {
        assertEquals(-8, suma.suma(-3, -5));
    }

    @Test
    void sumaCeroTest() {
        assertEquals(5, suma.suma(0, 5));
    }

    @AfterEach
    void after() {
        System.out.println("After: Finalizando Test Suma");
    }

}
