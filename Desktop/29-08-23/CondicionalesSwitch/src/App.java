import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);

        int N,suma,resta,multiplicar,n1,n2;
        double dividir;
        System.out.println("Menu de opciones");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        N=lector.nextInt();

        
        switch(N) {
             case 1:

                 System.out.println("ingrese el primer numero");
                 n1=lector.nextInt();
                 System.out.println("ingrese el segundo numero");
                 n2=lector.nextInt();

                 suma=n1+n2;

                 System.out.println("La suma es igual a:"+suma);

                 break;
            case 2:
            System.out.println("ingrese el primer numero");
                 n1=lector.nextInt();
                 System.out.println("ingrese el segundo numero");
                 n2=lector.nextInt();

                 resta=n1-n2;

                 System.out.println("La resta es igual a:"+resta);

                 break;
              case 3:
                 System.out.println("ingrese el primer numero");
                 n1=lector.nextInt();
                 System.out.println("ingrese el segundo numero");
                 n2=lector.nextInt();

                 multiplicar=n1*n2;

                 System.out.println("La suma es igual a:"+multiplicar);

                 break;
              case 4:
                   
                      System.out.println("ingrese el primer numero:");
                      n1=lector.nextInt();
                      System.out.println("ingrese el segundo numero:");
                      n2=lector.nextInt();

                       if((n1 == 0)||(n2 == 0)){
                        System.out.println("no se puede dividir entre 0");
                    }else{


                      dividir=n1/n2;

                      System.out.println("La suma es igual a:"+dividir);
                      
                    }
                    break;
              case 5:
                       System.out.println("Que te vaya bien zorra :)");
                     
                      


                    
            default:
            System.out.println("No le sabes papa vala verga");
        }         
    }
}
