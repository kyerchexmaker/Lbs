package ru.tpu.lab.lb6.filter;

import ru.tpu.lab.lb6.Chip;

public class OperationalAmplifier implements Chip {
    @Override
    public String chip() {
        return "Операционный усилитель. LM358P";
    }
}
