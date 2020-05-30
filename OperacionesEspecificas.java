/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.especificas;

/**
 *
 * @author Lenin Iñacaza
 */
import java.util.Scanner;
public class OperacionesEspecificas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner objeto=new Scanner (System.in);

    System.out.println("Ingrese su color favorito:");
    String favorita=objeto.nextLine();

    System.out.println("Ingrese su comida favorita:");
    String comida=objeto.nextLine();

    System.out.println("Ingrese su pasatimepo favorito:");
    String favorito=objeto.nextLine();


   System.out.println("Ingrese que genero de musica escucha:");
    String musica=objeto.nextLine();

    System.out.println("Ingrese la marca de telefono que mas le gusta:");
    String telefono=objeto.nextLine();

    System.out.println("Ingrese la ciudad que mas le gusta del Ecuador");
    String gusta=objeto.nextLine();

    }


}
