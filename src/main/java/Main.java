import Modelo.StrategyDisparo.*;
import Modelo.Celda;
import Modelo.Excepciones.InvalidDisparoException;
import Modelo.Excepciones.InvalidPosicionBarco;
import Modelo.FactoryBarcos.BarcosParaAstilleroMilitar.Submarino;
import Modelo.Tablero;

public class Main {
    public static void main(String[] args){
        Submarino s1 = new Submarino();
        Tablero t1 = new Tablero(13);
        try {
            t1.setBarco(s1,'N',6,6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t1.activarTablero();
        try {
            t1.dispararUna(6,6);
        } catch (InvalidDisparoException e) {
            e.printStackTrace();
        }
    }
}
