package Models;

import java.util.ArrayList;

public class Operaciones {
    ArrayList<LeerDatos> listanumero = new ArrayList<LeerDatos>();

    public Operaciones(){}
    public void agregar(int num){
        int numero = num;
        listanumero.add(new LeerDatos(numero));
    }
    public void visualizar(){
        for (LeerDatos leerDatos: listanumero) {
            System.out.println(LeerDatos.getNum());
        }
    }
    public void sumar(){
        int suma =0;
        for (LeerDatos leerDatos: listanumero) {
            suma += LeerDatos.getNum();
        }
        Imprimir imprimir= new Imprimir();
        imprimir.resultado(suma);
    }
}
