package ru.job4j.condition;

/**
 * Глупый бот
 */
public class DummyBot {
    /**
     * Ответы на вопрос
     * @param question вопрос
     * @return ответ
     */
    public String answer(String question) {

        if ("Привет бот.".equals(question)) {
            return "Привет умник.";
        } else if ("Пока.".equals(question)) {
            return "До скорой встречи.";
        } else {
            return "Это ставит меня в тупик, спросите другой вопрос.";
        }
    }
}
