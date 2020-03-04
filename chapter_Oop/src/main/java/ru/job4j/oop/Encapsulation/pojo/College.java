package ru.job4j.oop.encapsulation.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Иванов Иван Иваныч");
        student.setGroup("Прикладная математика");
        student.setDateReceipt(new Date());

        System.out.println("Студент: " + student.getFio()
                + ", группа:" + student.getGroup()
                + ", дата поступления: " + student.getDateReceipt().toString());
    }
}
