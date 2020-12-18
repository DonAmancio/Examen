import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nro,anterior,siguiente,i;
        do{
            System.out.println("Introduzca numero: ");
            nro =sc.nextInt();
        }while(nro<=1);

        anterior=0;
        siguiente=1;

        System.out.print(anterior + " ");
        for(i=2;i<=nro;i++){
            System.out.print(siguiente + " ");
            siguiente = anterior + siguiente;
            anterior = siguiente - anterior;
        }
        System.out.println();
    }
}
