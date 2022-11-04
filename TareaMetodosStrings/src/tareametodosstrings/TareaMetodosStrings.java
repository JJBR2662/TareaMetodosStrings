package tareametodosstrings;

import java.util.Scanner;

public class TareaMetodosStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("1.  REPLACE");
            System.out.println("2.  FACTORIAL");
            System.out.println("3.  MENSAJES");
            System.out.println("4.  PROMEDIOS");
            System.out.println("5.  APROBADO O REPROBADO");
            System.out.println("6.  CONTAINS");
            System.out.println();
            System.out.print("Ingrese el metodo que quiere utilizar [1-6]: ");
            n = sc.nextInt();
            switch(n){ 
                case 1:
                    Scanner replace = new Scanner(System.in);
                    System.out.print("Ingrese una cadena: ");
                    String cadena = replace.nextLine();
                    System.out.print("Ingrese el caracter a remplazar: ");
                    char car1 = replace.next().charAt(0);
                    System.out.print("Ingrese el nuevo caracter: ");
                    char car2 = replace.next().charAt(0);
                    String nuevacadena = replace(cadena, car1, car2);
                    System.out.println(nuevacadena);
                    System.out.println();
                    break;
                case 2:
                    Scanner factorial = new Scanner(System.in);
                    System.out.print("Ingrese un numero para sacarle la factorial: ");
                    int num = factorial.nextInt();
                    factorial(num);
                    int numfact = factorial(num);
                    System.out.println(numfact);
                    System.out.println();
                    break;
                case 3:
                    Scanner mensaje = new Scanner(System.in);
                    System.out.print("Ingrese una cadena; ");
                    String cadenamen = mensaje.nextLine();
                    mensaje(cadenamen);
                    break;
                case 4:
                    double prom = promedio();
                    System.out.print("El promedio es de: "+prom);
                    System.out.println();
                    break;
                case 5:
                    Scanner aprobo = new Scanner(System.in);
                    System.out.print("Ingrese una nota: ");
                    double nota = aprobo.nextDouble();
                    boolean pasara = aproboono(nota);
                    if (pasara){
                        System.out.println("El alumno aprobo");
                        System.out.println();
                    }else{
                        System.out.println("El alumno reprobo");
                        System.out.println();
                    }
                    break;
                case 6:
                    Scanner contain = new Scanner(System.in);
                    System.out.print("Ingrese la cadena principal: ");
                    String cadenaprin = contain.nextLine();
                    System.out.print("Ingrese la subcadena: ");
                    String subcadena = contain.nextLine();
                    boolean tendra = contain(cadenaprin, subcadena);
                    if (tendra){
                        System.out.println("La cadena principal contiene la subcadena");
                        System.out.println();
                    }else{
                        System.out.println("La subcadena no es parte de la cadena principal");
                        System.out.println();
                    }
                    break;
            }
        }while(n>0 && n<7);
        System.out.println("Solo se puede del 1 al 6");
    }
    public static String replace(String cadena,char car1, char car2){
        String nuevacadena = cadena.replace(car1, car2);
        return nuevacadena;
    }
    public static int factorial (int num){
        int numfact = 1;
        for (int i=1; i<=num;i++){
            numfact*=i;
        }
        return numfact;
    }
    public static void mensaje (String cadenamen){
        System.out.println(cadenamen);
        System.out.println();
    }
    public static double promedio(){
        Scanner promedio = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        double nota1 = promedio.nextInt();
        System.out.print("Ingrese nota 2: ");
        double nota2 = promedio.nextInt();
        System.out.print("Ingrese nota 3: ");
        double nota3 = promedio.nextInt();
        System.out.print("Ingrese nota 4: ");
        double nota4 = promedio.nextInt();
        double suma = nota1+nota2+nota3+nota4;
        double prom = suma / 4;
        return prom;
    }
    public static boolean aproboono(double nota){
        boolean sera;
        if (nota >= 60){
            sera = true;
        }else{
            sera = false;
        }
        return sera;
    }
    public static boolean contain (String cadenaprin, String subcadena){
        boolean vf;
        if (cadenaprin.contains(subcadena)){
            vf = true;
        }else{
            vf = false;
        }
        return vf;
    }
}
