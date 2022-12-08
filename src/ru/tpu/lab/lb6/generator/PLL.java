package ru.tpu.lab.lb6.generator;

import ru.tpu.lab.lb6.Chip;

public class PLL implements Chip {
    @Override
    public String chip() {
        return "Тактовый генератор с ФАПЧ. 74HC4046A";
    }
}
