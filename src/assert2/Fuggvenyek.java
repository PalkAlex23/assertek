package assert2;

public class Fuggvenyek {

    static int kVegNagyobb(int k, int min) {
        min = min + 1;
        while (Math.abs(min % 10) != k) {
           min++;
        }
        return min;
    }

    static int utolsoKetjegyu(int [] sorozat) {
        return 0;
    }
    
    static boolean KVegVanE(int k, int min, int max) {
        // fordított esetben
        if (max < min) {
            int seged = min;
            min = max;
            max = seged;
        }
        // kezdő érték - pipa
        // while ciklus
        while (min <= max && min % 10 != k) {
            min++;
        }
        // léptetés
        // visszatérési érték meghatározása
        return min <= max;
    }

    static boolean szomszedPrimE(int szam) {
        // alsó szomszéd prím-e?
        if (primE(szam - 1)) {
            return true;
        }
        // felső szomszéd prím-e?
        else if (primE(szam + 1)) {
            return true;
        }
        return false;
    }

    private static boolean primE(int bem) {
        if (bem < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(bem) && bem % i != 0) {
            i++;
        }
        return i > Math.sqrt(bem);
    }
    
}
