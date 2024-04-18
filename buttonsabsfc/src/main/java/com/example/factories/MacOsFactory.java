package com.example.factories;
import com.example.buttonsabs.ButtonAbs;
import com.example.buttonsabs.MacOsButtonAbs;
import com.example.checkboxes.Checkbox;
import com.example.checkboxes.MacOSCheckbox;

public class MacOsFactory implements GUIFactory{
    @Override
    public ButtonAbs createButtonAbs() {
        return new MacOsButtonAbs();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
