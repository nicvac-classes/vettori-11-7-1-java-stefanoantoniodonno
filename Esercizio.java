//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String nome;

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );

        
        int n, g, i;

        g = 0;
        do {
            System.out.println("quanti animali arriveranno al lago?");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Inserire un valore valido");
            }
        } while (n <= 0);
        int[] animali = new int[n * 10];

        g = inserisci(animali, g, 0);
        for (i = 1; i <= n - 1; i++) {
            g = inserisci(animali, g, i);
            visualizza(animali, g);
            if (animali[i] > animali[i - 1]) {
                g = rimuovi(animali, g, i - 1);
            }
        }
        g = rimuoviDuplicati(animali, g);
        visualizza(animali, g);
    }
    
    public static int inserisci(int[] v, int n, int ie) {
        int n2;
        int elemento, i;

        elemento = random.nextInt(7) + 3 * 10;
        n2 = n + 1;
        for (i = n; i >= ie + 1; i--) {
            v[i] = v[i - 1];
        }
        v[ie] = elemento;
        
        return n2;
    }
    
    public static int rimuovi(int[] v, int n, int ie) {
        int n2;
        int i;

        n2 = n - 1;
        for (i = ie; i <= n2 - 1; i++) {
            v[i] = v[i + 1];
        }
        
        return n2;
    }
    
    public static int rimuoviDuplicati(int[] v, int n) {
        int i, j;

        i = 0;
        while (i < n - 1) {
            j = i + 1;
            while (j < n) {
                if (v[i] == v[j]) {
                    n = rimuovi(v, n, j);
                } else {
                    j = j + 1;
                }
            }
            i = i + 1;
        }
        
        return n;
    }
    
    public static void visualizza(int[] v, int n) {
        int i;

        System.out.println("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(" " + i + 1 + "° Animale: " + v[i]);
        }
        System.out.println(" ]");
    }
 }