package ru.tpu.lab.lb3;

public class ComponentDecorator implements Component{

    Component component;

    public ComponentDecorator(Component component)
    {
        this.component = component;
    }
    @Override
    public String getDescription() {
        return component.getDescription();
    }
}
