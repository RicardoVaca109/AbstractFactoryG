package com.example.factories;

import com.example.buttonsabs.ButtonAbs;
import com.example.buttonsabs.WindowsButtonAbs;
import com.example.checkboxes.Checkbox;
import com.example.checkboxes.WindowsCheckbox;


public class WindowsFactory implements GUIFactory{
    @Override
    public ButtonAbs createButtonAbs() {
        return new WindowsButtonAbs();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
