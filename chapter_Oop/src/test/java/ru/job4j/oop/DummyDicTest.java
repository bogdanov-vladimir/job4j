package ru.job4j.oop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class DummyDicTest {
    @Test
    public void whenRetVal() {
        DummyDic dummyDic = new DummyDic();
        String sResultFunc = dummyDic.engToRus("Блабла");
        String sResult = "Неизвестное слово. Блабла";

        assertThat(sResult, is(sResultFunc));
    }

}