public class Main {
    public static void main(String[] args) {
        int numero = 20;
        int cont = 1;

        System.out.println("Interacao com while");
        while (cont <= numero){
            System.out.println("Valor: " + cont + "\n");
            cont += 1;
        }

        cont = 1;
        System.out.println("*******************" + "\n");
        System.out.println("Interacao com do/while" + "\n");
        do {
            System.out.println("Valor: " + cont + "\n");
            cont += 1;
        } while (cont <= numero);

    }
}