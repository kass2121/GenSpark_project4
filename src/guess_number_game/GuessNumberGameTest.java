package guess_number_game;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {

    @Test
    void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        assertTrue(num ==3, String.valueOf(str.equalsIgnoreCase(" ")));

    }
}
