package gragon_casve_game;

import com.sun.tools.javac.Main;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

class DragonCaveGameTest {
    private Object main;

    @BeforeTest

    void mainTest() {
        Main  main;

    }

    @Test
     void displayIntro() {
        assertTrue("You are in a land full of dragons.\" + \" In front of you,you see two caves.\"\n" +
                "                + \" In one cave, the dragon is friendly and will share his treasure with you.\"\n" +
                "                + \" The other dragons greedy and hungry, and will eat you on sight.\"",true);

    }

}
