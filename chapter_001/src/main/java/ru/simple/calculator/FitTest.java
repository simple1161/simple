package ru.simple.calculator;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class FitTest {
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}