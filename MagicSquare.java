import java.util.Scanner;

public class MagicSquare 
{
    public static void main (String args []) {
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ingresa un numero impar (si no te lo subire a impar):");
        int n = sc.nextInt();
        
        //subir a impar
        if (n%2==0) {
            n++;
        }
        
        //Escritura de la casilla central de arriba
        int [][] arr = new int [n][n];
        int fa=0, ca=n/2;
        arr[fa][ca] = 1;
        int fn=0, cn=0;
        
        //Escritura de las demas casillas
        for(int numero=2; numero<=n*n; numero++) {
            fn = fa-1;
            if(fn<0) {
                fn = n-1;
            }
            cn=ca+1;
            if(cn==n) {
                cn=0;
            }
            
            if(arr[fn][cn]==0) { 
                arr[fn][cn]=numero;
                fa=fn;
                ca=cn;
            } 
            else {
                fa++;
                arr[fa][ca]=numero;
            }
        }
        
        //Lectura e impresion de la matriz
        for (int f=0; f<arr.length; f++) {
            for (int c=0; c<arr[f].length; c++)  {
                if (arr[f][c]<10) {
                    System.out.print(" "+arr[f][c]+" ");
                } else {
                    System.out.print(arr[f][c]+" ");
                }
            }
            System.out.println();
        }
    }
}
