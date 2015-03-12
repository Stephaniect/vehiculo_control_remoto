package p_ingreso_vehiculo;

public class Movimientos {

    public String[] movi_1;
    public String[] movi_2;
    public int[] punto_plano = new int[2];
    public int punto;

    public boolean valida_tipo(String coordenada) {
        movi_1 = coordenada.split(";");
        for (int i = 0; i < movi_1.length; i++) {
            if (movi_1[i].length() < 3) {
                return false;
            } else {
                movi_2 = movi_1[i].split(",");
                if (valida_num(movi_2[1])) {
                    return false;
                } else if (!valida_num(movi_2[0])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean valida_formato(String coordenada) {
        
        movi_1 = coordenada.split(";");
        for (int i = 0; i < movi_1.length; i++) {
            movi_2 = movi_1[i].split(",");
            if (!movi_2[1].equals("N") && !movi_2[1].equals("S")
                    && !movi_2[1].equals("E") && !movi_2[1].equals("O")
                    && !movi_2[1].equals("n") && !movi_2[1].equals("s")
                    && !movi_2[1].equals("e") && !movi_2[1].equals("o")) {
                return false;
            }
        }
        return true;
    }

    public boolean valida_num(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (Exception excepcion) {
            return false;
        }
    }

    public void crea_punto(String coordenada) throws Exception {

        movi_1 = coordenada.split(";");
        for (int i = 0; i < movi_1.length; i++) {
            movi_2 = movi_1[i].split(",");
            punto = Integer.parseInt(movi_2[0]);
            if (punto_plano[0] == 0 && punto_plano[1] == 0) {
                punto = punto - 1;
            }
            if (punto_plano[1] > 0 && punto_plano[0] > 0) {
            }
            if (movi_2[1].equals("N") || movi_2[1].equals("n")) {
                punto_plano[1] = punto_plano[1] + punto;
                if (punto_plano[1] < 0) {
                    throw new Exception("Se ha detenido el avance por salir de los límites.");
                }
            } else if (movi_2[1].equals("S") || movi_2[1].equals("s")) {
                punto_plano[1] = punto_plano[1] - punto;
                if (punto_plano[1] < 0) {
                    throw new Exception("Se ha detenido el avance por salir de los límites.");
                }
            } else if (movi_2[1].equals("E") || movi_2[1].equals("e")) {
                punto_plano[0] = punto_plano[0] - punto;
                if (punto_plano[0] < 0) {
                    throw new Exception("Se ha detenido el avance por salir de los límites.");
                }
            } else if (movi_2[1].equals("O") || movi_2[1].equals("o")) {
                punto_plano[0] = punto_plano[0] + punto;
                if (punto_plano[0] < 0) {
                    throw new Exception("Se ha detenido el avance por salir de los límites.");
                }
            }
        }

    }
}
