package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(3600));
    }

    @Test
    public void when80RubleToEuroThen() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(80);
        assertThat(result, is(4800));
    }
}
