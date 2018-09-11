package ru.maximkulikov.calculator;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Lovely-Calculator
 *
 * @autor Maxim Kulikov
 * @since 01.09.2018
 */
@Slf4j
public class KalkulachkaService {

    private AtomicInteger result = new AtomicInteger(6);

    public int loadResult() {
        log.info("load result");
        return result.get();
    }

    public void plusOne() {
        log.info("plus one to result");
        result.incrementAndGet();
    }

    public void minusOne() {
        log.info("minis one to result");
        result.decrementAndGet();
    }
}
