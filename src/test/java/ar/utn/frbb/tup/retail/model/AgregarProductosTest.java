package ar.utn.frbb.tup.retail.model;

import org.junit.Test;

import java.util.ArrayList;

public class AgregarProductosTest {
    @Test
        public void main(){
        RetailItem t1 = new RetailItem("Televisor", Categoria.TVAUDIOVIDEO,"Televisor 32 pulgadas", "Samsung", "3049X90", 30, 30.499);
        RetailItem t2 = new RetailItem("Televisor", Categoria.TVAUDIOVIDEO,"Televisor 56 pulgadas", "Philips", "3099X23", 5, 60.273);
        RetailItem v1 = new RetailItem("Ventilador", Categoria.ELECTRODOMESTICOS, "Ventilador de pie", "Embassy", "4089X92", 15, 20.949);
        RetailItem s1 = new RetailItem("Silla", Categoria.HOGARMUEBLES, "Silla de escritorio", "Xtrike", "5092X84", 5, 36.399);
        RetailItem m1 = new RetailItem("Monitor", Categoria.INFORMATICAELECTRONICA, "Monitor 22 pulgadas", "Samsung", "2030x39", 20, 36.599);
        RetailItem m2 = new RetailItem("Monitor", Categoria.INFORMATICAELECTRONICA, "Monitor 24 pulgadas", "Samsung", "2235x52", 10, 50.924);
        RetailItem b1 = new RetailItem("Bicicleta", Categoria.SALUDAIRELIBRE, "Bicleta rodado 29", "Fierce ", "7829X02", 15, 52.495);
        ArrayList<RetailItem> televisores = new ArrayList<>();
        ArrayList<RetailItem> ventiladores = new ArrayList<>();
        ArrayList<RetailItem> sillas = new ArrayList<>();
        ArrayList<RetailItem> monitores = new ArrayList<>();
        ArrayList<RetailItem> bicicletas = new ArrayList<>();

        televisores.add(t1);
        televisores.add(t2);
        ventiladores.add(v1);
        sillas.add(s1);
        monitores.add(m1);
        monitores.add(m2);
        bicicletas.add(b1);
        }
}