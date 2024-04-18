package com.example.factories;

import com.example.buttonsabs.ButtonAbs;
import com.example.checkboxes.Checkbox;

public interface GUIFactory {
    ButtonAbs createButtonAbs();
    Checkbox createCheckbox();

}
