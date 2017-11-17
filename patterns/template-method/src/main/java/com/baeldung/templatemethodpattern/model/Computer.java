package com.baeldung.templatemethodpattern.model;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    
    private Map<String, String> computerParts = new HashMap<>();
    
    public Computer(Map<String, String> computerParts) {
        this.computerParts = computerParts;
    }
    
    public Map<String, String> getComputerParts() {
        return computerParts;
    }
}