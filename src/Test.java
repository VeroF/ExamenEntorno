import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Introduzca un número: ");
        int num = entrada.nextInt();
        
        for(;num != 0;){
            if (num < 0 || num > 10)
                System.out.println("El número debe ser entre 1 y 10.");
            else {
                System.out.printf("Tabla del %d :\n", num);
                System.out.println("-------------");
                for(int i = 1; i <= 10; i++){
                    System.out.printf("%d x %d = %d\n", num, i, (num * i));
                }
            }
            System.out.print("Introduzca un número: ");
            num = entrada.nextInt();
        }
        System.out.println("Ha finalizado la ejecución del programa");
    }
    
}