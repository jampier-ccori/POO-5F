import java.util.Arrays;
import java.util.Scanner;

public class EJ02PC02 {
    public static void WriteLine(String mensaje){
        System.out.println(mensaje);
    }
    public static void  Write(String mensaje){
        System.out.print(mensaje);
    }
    public static  int []B;

    public static int pedir_num()

    {
        int a=0;
        boolean flag = true;

        do {
            try {
                Scanner readint= new Scanner(System.in);
                a = readint.nextInt();
                flag = false;
            }catch (Exception e){
                e.getMessage();
                Write("\033[31merror: el dato ingresado no es un número\u001B[0m \n Digile el número nuevamente: ");
                flag = true;
            }
        } while (flag);
        return a;
    }

    public static int[] poblarPares( int tam){
        int[] a = new int[tam];
        for (int i = 1; i < tam+1; i++) {
            int numero=i*2;
            a[i-1] = numero;
            WriteLine("["+numero+"]");
        }
        return a;
    }
    public static void poblarInpares(int tam2){

         B= new int[tam2];
        int numero=1;
        for (int i = 0; i < tam2; i++) {

            B[i] = numero;
            WriteLine("["+numero+"]");
            numero+=2;
        }//1,3,5,7,9//0,2,4,8
    }
    public static void mostrarArreglo( int[] list){//c
        Write("lista ordenada = { ");
        for (int i = 0; i < list.length; i++) {//11
            if ( i == list.length-1 )
                Write(list[i]+"");
            else
                Write(list[i] + ", ");
        }
        WriteLine(" }");
    }


    public static void main(String[] args) {
        WriteLine("\n########CREANDO ARREGLOS#######\n");
        Write("Ingrese el tamaño del primer arreglo ");
        int tam1=pedir_num();

        int []A=poblarPares(tam1);
        Write("Ingrese el tamaño del segundo arreglo ");
        int tam2=pedir_num();

       poblarInpares(tam2);
        int []C=new int[tam2+tam1];
        for(int i=0;i<(tam1);i++){
            C[i]=A[i];
        }
        int j=0;
        for(int i=tam1;i<(tam1+tam2);i++){
            C[i]=B[j];
            j++;
        }
        Arrays.sort(C);
        mostrarArreglo(C);


    }
}
