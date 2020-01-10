package ru.job4j.oop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CatTest {
    @Test
    public void whenNameFood() {
        String catName = "Sema";
        String catFood = "Fish";
        Cat cat = new Cat();
        cat.giveNick(catName);
        cat.eat(catFood);

        String sResultFunc = cat.show();
        String sResult = "I`m "+ catName +", my food: "+ catFood;

        assertThat(sResult, is(sResultFunc));
    }
}
