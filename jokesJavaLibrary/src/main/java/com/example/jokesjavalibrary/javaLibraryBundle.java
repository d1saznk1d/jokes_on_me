package com.example.jokesjavalibrary;
import java.util.Random;

public class javaLibraryBundle {

    String[] tellJokesList = {"How does Bob Marley like his donuts? Wi'jam in",
            "What did Cinderella say when her photos didn't arrive? Someday my prints will come",
            "Just broke two of my dad's old Queen records Now i want to break three..." };

    public String random() {
        Random generator = new Random();
        String random = tellJokesList[generator.nextInt(tellJokesList.length)];
        return random;
    }
}
