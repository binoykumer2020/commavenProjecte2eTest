package argosFunctionality.utility;

import java.util.Random;

public class UtilityHelper {

    public int generateRandom (int size){
        Random random = new Random();
        int value = random.nextInt(size);
        return value;

    }
}
