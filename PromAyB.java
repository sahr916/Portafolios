import java.util.Scanner;
/**
 * 3. Se tienen las notas del primer parcial de los alumnos de dos materias, la materia A y la materia B, 
   cada materia cuenta con 15 alumnos.
    a) Realizar un programa que muestre la materia que obtuvo el mayor promedio.
 */
public class Act20c
{
    public static void main (String args[])
    {
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        int alumnos = 15;
        float sumaA = 0, sumaB=0;
        
        System.out.println("Escriba las calif. de MATERIA A: ");
        float materiaA[] = new float [alumnos];
        for (int i=0; i<alumnos; i++)
        {
            materiaA[i] = sc.nextInt();
            sumaA = sumaA+materiaA[i];
        }
        
        System.out.println("Escriba las calif. de MATERIA B: ");
        float materiaB[] = new float [alumnos];
        for (int i=0; i<alumnos; i++)
        {
            materiaB[i] = sc.nextInt();
            sumaB = sumaB+materiaB[i];
        }
        
        if (sumaA/alumnos > sumaB/alumnos)
        System.out.println("\nLa materia que obtuvo el mayor promedio es la materia A");
        else if (sumaA/alumnos == sumaB/alumnos)
        System.out.println("\nAmbas materias tienen el mismo promedio");
        else
        System.out.println("\nLa materia que obtuvo el mayor promedio es la materia B");
    }
}
