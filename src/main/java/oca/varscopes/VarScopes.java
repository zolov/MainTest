package oca.varscopes;

/**
 * VarScopes.
 *
 * @author zolov
 */
class VarScopes {
    static int x = 4;
    static int y;
    static {
        x = 44;
    }
    int a = 1;
    int b;
    {
        b = 11;
    }
    void run(int b) {
        int a = b;
        int c;
        {
            // int c = 666;
            int x = 444;
        }
        for(int d = 0; d < 3; d++) {
            // int a = 3;
            int e = 5;
            e++;
            System.out.println("e = " + e);
        }
    }

    public static void main(String[] args) {
        int a = 3;
        new VarScopes().run(a);
    }

    public void main(String arg) {

    }

    public static void main() {

    }

//    public static void main(String... args) {
//
//    }
}
