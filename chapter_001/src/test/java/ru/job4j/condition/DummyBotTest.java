package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {
    @Test
    public void whereHiBot() {
        DummyBot dummyBot = new DummyBot();
        String funcResult = dummyBot.answer("Привет бот.");
        String result = "Привет умник.";

        assertThat(funcResult, is(result));

    }

    @Test
    public void whereBuyBot() {
        DummyBot dummyBot = new DummyBot();
        String funcResult = dummyBot.answer("Пока.");
        String result = "До скорой встречи.";

        assertThat(funcResult, is(result));

    }

    @Test
    public void whereUnknownBot() {
        DummyBot dummyBot = new DummyBot();
        String funcResult = dummyBot.answer("Как дела?");
        String result = "Это ставит меня в тупик, спросите другой вопрос.";

        assertThat(funcResult, is(result));

    }

}
