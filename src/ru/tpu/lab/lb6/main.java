package ru.tpu.lab.lb6;

import ru.tpu.lab.lb6.filter.FilterScheme;
import ru.tpu.lab.lb6.generator.GeneratorScheme;

public class main {
    public static void main(String[] args) {
        System.out.println("Схема фильтра. Необходимые компоненты:");
        SchemeGenerator scheme = new FilterScheme();
        Diode diode = scheme.getDiode();
        Transistor transistor = scheme.getTransistor();
        Chip chip = scheme.getChip();
        System.out.println(diode.diode());
        System.out.println(transistor.transistor());
        System.out.println(chip.chip());
        System.out.println("Схема генератора. Необходимые компоненты:");
        SchemeGenerator scheme1 = new GeneratorScheme();
        Diode diode1 = scheme1.getDiode();
        Transistor transistor1 = scheme1.getTransistor();
        Chip chip1 = scheme1.getChip();
        System.out.println(diode1.diode());
        System.out.println(transistor1.transistor());
        System.out.println(chip1.chip());

    }
}
