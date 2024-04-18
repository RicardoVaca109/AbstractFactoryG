package com.example.app;

import com.example.buttonsabs.ButtonAbs;
import com.example.checkboxes.Checkbox;
import com.example.factories.GUIFactory;
public class Application {

    private ButtonAbs button;
    private  Checkbox checkbox;
    public Application(GUIFactory factory){
        button = factory.createButtonAbs();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
