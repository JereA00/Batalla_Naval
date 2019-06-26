package Modelo.FactoryBarcos.BarcosParaAstilleroMilitar;

import Modelo.Celda;
import Modelo.Barco;
import Modelo.FactoryBarcos.TipoDeBarco;

public class Canionero extends Barco {

    private static final int CANIONERO_SIZE = 4;

    public Canionero() {
        super(CANIONERO_SIZE, TipoDeBarco.CANIONERO);
    }

    @Override
    public int[][] generarFilasColumnas(char orientacion, Celda celdaCabeza) {
        return super.barcosRectos(orientacion,celdaCabeza,getCanioneroSize());
    }
    public static int getCanioneroSize() {
        return CANIONERO_SIZE;
    }
}
