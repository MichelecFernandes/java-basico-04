public class Main {
    public static void main(String[] args) {
        int numero = 20;
        int cont = 1;

        System.out.println("Interacao com while");
        while (cont <= numero){
            System.out.println("Valor: " + cont);
            cont += 1;
        }

        cont = 1;
        System.out.println("*******************" + "\n");
        System.out.println("Interacao com do/while" + "\n");
        do {
            System.out.println("Valor: " + cont);
            cont += 1;
        } while (cont <= numero);

        System.out.println("*******************" + "\n");
        System.out.println("Interacao com for" + "\n");
        for (cont = 1; cont <= numero; cont += 1 ){
            System.out.println("Valor: " + cont);
        }
    }
}