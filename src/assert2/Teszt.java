/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assert2;

public class Teszt {

    static void assertKVegNagyobb() {
        // 1. teszteset
        int k = 4;
        int min = 12;
        int kapott = Fuggvenyek.kVegNagyobb(k, min);
        int vart = 14;
        assert vart == kapott: "A min utolsó számjegyénél nagyobb k-ra nem működik.";
        
        // 2. teszteset
        k = 4;
        min = 0;
        kapott = Fuggvenyek.kVegNagyobb(k, min);
        vart = 4;
        assert vart == kapott: "A min 0 esetében nem működik.";
        
        // 3. teszteset
        k = 4;
        min = -12;
        kapott = Fuggvenyek.kVegNagyobb(k, min);
        vart = -4;
        assert vart == kapott: "A min negatív esetében nem működik.";
        
        // 4. teszteset
        k = 1;
        min = 12;
        kapott = Fuggvenyek.kVegNagyobb(k, min);
        vart = 21;
        assert vart == kapott: "A min utolsó számjegyénél kisebb k-ra nem működik.";
        
        // 5. teszteset
        k = 1;
        min = 11;
        kapott = Fuggvenyek.kVegNagyobb(k, min);
        vart = 21;
        assert vart == kapott: "A min utolsó számjegyénél kisebb k-ra nem működik.";
    }

    static void assertUtolsoKetJegy() {
        // 1. teszteset
        int[] sorozat = {4, 34, 234};
        int kapott = Fuggvenyek.utolsoKetjegyu(sorozat);
        int vart = 34;
        assert vart == kapott: "Egy db kétjegyű szám esetére nem működik";
        
        // 2. teszteset
        int[] sorozat2 = {4, 34, 12, 234};
        kapott = Fuggvenyek.utolsoKetjegyu(sorozat2);
        vart = 12;
        assert vart == kapott: "Két db kétjegyű szám esetére nem működik (nem az utolsót találja meg)";
        
        // 3. teszteset
        int[] sorozat3 = {4, 34, -12, 234};
        kapott = Fuggvenyek.utolsoKetjegyu(sorozat3);
        vart = -12;
        assert vart == kapott: "Kétjegyű negatív szám esetére nem működik (nem az utolsót találja meg)";
        
        // 4. teszteset
        int[] sorozat4 = {4, 534, -412, 234};
        kapott = Fuggvenyek.utolsoKetjegyu(sorozat4);
        vart = 0;
        assert vart == kapott: "Ha nincs kétjegyű szám, nem működik";
        
        // 5. teszteset
        int[] sorozat5 = {};
        kapott = Fuggvenyek.utolsoKetjegyu(sorozat5);
        vart = 0;
        assert vart == kapott: "Üres sorozat esetén nem működik";
    }
    
    static void assertKVegVanE() {
        // 1. eset
        int k = 4;
        int min = 13;
        int max = 25;
        boolean kapott = Fuggvenyek.KVegVanE(k, min, max);
        boolean vart = true;
        assert  vart == kapott: "Nem működik: Középen van ilyen az intervallumban.";
        
        // 2. eset
        k = 4;
        min = 13;
        max = 23;
        kapott = Fuggvenyek.KVegVanE(k, min, max);
        vart = true;
        assert  vart == kapott: "Nem működik: Elől van ilyen az intervallumban.";
        
                
        // 3. eset
        k = 5;
        min = 7;
        max = 15;
        kapott = Fuggvenyek.KVegVanE(k, min, max);
        vart = true;
        assert  vart == kapott: "Nem működik: Hátul van ilyen az intervallumban.";
        
        // 4. eset
        k = 5;
        min = 7;
        max = 10;
        kapott = Fuggvenyek.KVegVanE(k, min, max);
        vart = false;
        assert  vart == kapott: "Nem működik: Nincs az intervallumban ilyen szám.";
        
        // 5. eset
        k = 5;
        min = 17;
        max = 10;
        kapott = Fuggvenyek.KVegVanE(k, min, max);
        // fordított esetet is vizsgáljunk
        vart = true;
        assert  vart == kapott: "Nem működik fordított határok estén";
        
        
    }

    static void assertszomszedPrimE() {
        teszt1();
        teszt2();
        teszt3();
        teszt4();
        teszt5();
        teszt6();
        teszt7();
    }

    private static void teszt1() {
        // bemenet
        int szam = 8;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = true;
        // assert
        assert vart == kapott: "A bemenet kisebb szomszédja prím (NM).";
    }
    
    private static void teszt2() {
        // bemenet
        int szam = 6;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = true;
        // assert
        assert vart == kapott: "A bemenet nagyobb szomszédja prím (NM).";
    }
    
    private static void teszt3() {
        // bemenet
        int szam = 2;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = true;
        // assert
        assert vart == kapott: "A kettő prímszám!";
    }
    
    private static void teszt4() {
        // bemenet
        int szam = 7;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = false;
        // assert
        assert vart == kapott: "A bemenet prímszám, de nincs prím szomszédja.";
    }
    
    private static void teszt5() {
        // bemenet
        int szam = 0;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = false;
        // assert
        assert vart == kapott: "A bemenet 0.";
    }
    
    private static void teszt6() {
        // bemenet
        int szam = 1;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = false;
        // assert
        assert vart == kapott: "A kettő prímszám (1 a bemenet)!";
    }
    
    private static void teszt7() {
        // bemenet
        int szam = -10;
        // kapott - fg hívása
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        // várt
        boolean vart = false;
        // assert
        assert vart == kapott: "Prímszám csak természetes szám lehet!";
    }

    static void assertnagyobbPrim() {
        nagyteszt1();
    }

    private static void nagyteszt1() {
        // bemenet
        // kapott
        // várt
        // assert
    }
}
