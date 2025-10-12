package com.simon.Assignment31;

// 31. Skapa en basklass Animal med metoden makeSound(). Låt Dog och Cat ärva och
//  överskugga metoden

import static java.lang.IO.*;

public class Main {

    void main() {

        Animal a = new Animal();
        Cat c    = new Cat();
        Dog d    = new Dog();

        a.makeSound();
        c.makeSound();
        d.makeSound();
    }
}
