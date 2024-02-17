package Entornos4;

public class Main { 

    public static void main(String[] args) {

        eCesta bag;

        bag = new eCesta("Apellidos del alumno",100, "dni del alumno");

        try 

        {

            bag.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }

        try

        {

            System.out.println("Solicitar actualización de bono");

            bag.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }

        double bactual = bag.bonificacion();

        System.out.println("Su bono actual es  "+ bactual );

    }

}