import java.util.Scanner;

public class EJ02PC01 {
    public static int[] A;
    public static int tam1;
    public static int numero;
    public static void WriteLine(String mensaje){
        System.out.println(mensaje);
    }
    public static void  Write(String mensaje){
        System.out.print(mensaje);
    }
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
    public static void poblarArreglo(){
         A = new int[tam1];//5
        for (int i = 0; i < tam1; i++) {
            int num=i*numero;//2
            A[i] = num;
            WriteLine("["+num+"]");
        }

    }

    public static int buscarElemento(int elemento){//4
        int posicion=0;
        for (int i=0;i<A.length;i++)//0,2,4,6,8
        {
            if (elemento==A[i])
            {
                posicion=i+1;
            }

        }


        return posicion;
    }

    public static int[] getPares(int tam, int[] list){
        int [] a= new int [tam];//4
        int j=0;
        for (int i = 0; i < list.length; i++) {//0,2,4,6,8
            if(list[i]!=0)
            {
                if (list[i]%2==0){
                    a[j]=list[i];
                    j++;//1,2
                }
            }
            if(j==tam)break;
        }
       return a;
    }

    public static void mostrarElementos( int[] list){
        Write(" = { ");
        for (int i = 0; i < list.length; i++) {//4
            if ( i == list.length-1 )//3
                Write(list[i]+"");
            else
                Write(list[i] + ", ");
        }
        WriteLine(" }");
    }
    public static void main(String[] args) {
        WriteLine("\n########CREANDO LISTAS#######\n");

        Write("Ingrese el tamaño de la lista: ");
        tam1=pedir_num();//5
        Write("Ingrese un numero: ");
        numero=pedir_num();//2
        poblarArreglo();
        Write("La lista 1 ");
        mostrarElementos(A);
        Write("Ingrese un elemento de la lista que decea buscar: ");
        int elemento=pedir_num();//4
        int posicion=buscarElemento(elemento);//3
        if (posicion==0)WriteLine("\nELEMENTO NO ENCONTRADO\n");
        else WriteLine("El elemento "+elemento+" se encuentra en la posicion: "+posicion+" de indice: "+(posicion-1)+"\n");

        int tam2=0;
        for (int i = 0; i < tam1; i++) {
            if(A[i]!=0)//0,2,4,6,8
            {
                if (A[i]%2==0){
                    tam2++;//1,2,3,4
                }
            }
        }
        int[]B=getPares(tam2,A);//2,4,6,8

        Write("ELEMENTOS  DE LA LISTA PARES");
        mostrarElementos(B);





    }
}
