package p_ingreso_vehiculo;

public class Plano {
    private int x;
    private int y;
    public  int [][] m_plano;
    
    public void iniciar (){
        x = 0;
        y = 0;
    }
            
    public void crea_plano (int x1 , int y1){
        x = x1;
        y = y1;
        m_plano = new int [x][y] ;
    }
    public boolean valida_matriz(int[] punto_plano) {
        try {
            m_plano[punto_plano[0]][punto_plano[1]] = 1;
            return true;
        } catch (Exception excepcion) {
            return false;
        }
    }

}
