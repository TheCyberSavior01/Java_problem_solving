package org.limon;

public class TwoFer {
    public String twofer(String name) {
        name = name == null || name.isEmpty()  ? "You" : name;
        return "One for " + name + ", one for me.";
    }
}
