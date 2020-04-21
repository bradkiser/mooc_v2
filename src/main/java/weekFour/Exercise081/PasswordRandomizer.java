package weekFour.Exercise081;

import java.util.Random;

public class PasswordRandomizer {
    private final Random random;
    private final int length;

    public PasswordRandomizer(int length) {
        this.random = new Random();
        this.length = length;
    }

    public String createPassword() {
        String base = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        for (int i = 0; i < this.length; i++) {
            password += base.charAt(random.nextInt(this.length));
        }
        return password;
    }
}
