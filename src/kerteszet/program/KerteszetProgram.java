
package kerteszet.program;

public class KerteszetProgram {

    public static void main(String[] args) {
        
        /*
            Egy Kertészet Növényeket tárol. Minden Növényről tudjuk a nevét. 
            Ezen kívül speciális Növényeket, Fákat is tárol, amelyekről a nevén kívül a korukat is tudjuk.
            A Kertészet meg tudja adni a jelenlegi készletét, illetve el tud adni Növényeket.

            A Kertészet létrejöttekor rendelkezik néhány Növénnyel, Fával, de a program használata során le is éghet.
            Ekkor minden elpusztul, és nem tud a továbbiakban értékesíteni.
            A korábban eladott Növényekről, Fákról viszont minden infót lekérhetünk!
        */
        
        
        Kerteszet kerteszet = new Kerteszet();
        
        System.out.println(kerteszet.toString());
        
    }
    
}
