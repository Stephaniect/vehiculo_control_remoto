package p_ingreso_vehiculo;

import java.util.Scanner;

public class P_ingreso_vehiculo {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int x1 = 0, y1 = 0;
            String continuar = "", coordenada, aux;
            Plano plano = new Plano();
            Movimientos movimientos = new Movimientos();
            System.out.println("¡Buen Dia!");
            System.out.println("Digite la cantidad de filas para la superficie de desplazamiento :");
            aux = in.next();
            if (!movimientos.valida_num(aux)) {
                throw new Exception("No se ha digitado un numero");
            } else {
                x1 = Integer.parseInt(aux);
                continuar = "Y";
            }
            System.out.println("Digite la cantidad de columnas para la superficie de desplazamiento  :");
            aux = in.next();
            if (!movimientos.valida_num(aux)) {
                throw new Exception("No se ha digitado un numero");
            } else {
                y1 = Integer.parseInt(aux);
                continuar = "Y";
            }
            plano.iniciar();
            plano.crea_plano(x1, y1);

            while (continuar.equals("y") || continuar.equals("Y")) {
                System.out.println("Por favor digite los movimientos del vehiculo");
                coordenada = in.nextLine();
                coordenada = in.nextLine();
                coordenada = coordenada.replace(" ", "");
                boolean validacion_1 = movimientos.valida_tipo(coordenada);
                if (validacion_1) {
                    boolean validacion_2 = movimientos.valida_formato(coordenada);
                    if (validacion_2) {
                        movimientos.crea_punto(coordenada);
                        if (plano.valida_matriz(movimientos.punto_plano)) {
                            System.out.println("A el desplazarse hacia las coordenadas : " + coordenada + " , el Vehiculo quedo en la posición : (" + (movimientos.punto_plano[0]) + "," + (movimientos.punto_plano[1]) + ") de la superficie de desplazamiento : " + x1 + " x " + y1);
                            System.out.println("¿Desea continuar a partir del punto(" + (movimientos.punto_plano[0]) + "," + (movimientos.punto_plano[1]) + ") ? (Y/N))");
                            continuar = in.next();
                        } else {
                            throw new Exception("Se ha detenido el avance por salir de los límites.");
                        }
                    } else {
                        throw new Exception(" Error en formato de comando");
                    }
                } else {
                    throw new Exception(" Error en formato de comando");
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}
