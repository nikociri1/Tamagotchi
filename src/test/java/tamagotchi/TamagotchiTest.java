package tamagotchi;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {

    @Test
    public void testQuePruebaQuePuedoCrearUnTama(){

        Tamagotchi tama= new Tamagotchi();

        Assert.assertNotNull(tama);

    }

    @Test
    public void testQuePruebaQuePuedoCrearUnTamaConNombre(){

        //Pasos para resolver los test
        //1. Declaramos los objetos y atributos necesarios
        //2. Ejecutamos el metodo a probar
        //3. Validamos mediante el metodo assert

        Tamagotchi tama= new Tamagotchi("Nico");

        String obtenido= tama.getNombre();

        String esperado = "Nico";

        Assert.assertEquals(obtenido, esperado);

    }
    @Test
    public void testParaCrearDosTamasConDistintosNombres(){

        Tamagotchi tama= new Tamagotchi("Nico");
        Tamagotchi tama2= new Tamagotchi("Cleo");


        String obtenido1= tama.getNombre();

        String esperado1 = "Nico";

        String obtenido2= tama2.getNombre();

        String esperado2 = "Cleo";


        Assert.assertEquals(obtenido1, esperado1);
        Assert.assertEquals(obtenido2, esperado2);


    }

    @Test
    public void testQuePruebaQuePuedoConocerElNivelDeUnTama(){

        Tamagotchi tama= new Tamagotchi();

        Integer nivelEsperado= 0;
        Integer nivelObtenido = tama.getNivel();

        Assert.assertEquals(nivelEsperado,nivelObtenido);

    }

    @Test
    public void testParaCrearDosTamaConDiferentesNivel(){
        Tamagotchi tama1= new Tamagotchi(0);
        Tamagotchi tama2= new Tamagotchi(1);

        Integer nivelEsperado1 =0;

        Integer nivelEsperado2= 1;

        Integer nivelObtenido1= tama1.getNivel();
        Integer nivelObtenido2 = tama2.getNivel();

        Assert.assertEquals(nivelEsperado1,nivelObtenido1);
        Assert.assertEquals(nivelEsperado2, nivelObtenido2);

    }

    @Test
    public void testQuePruebaQueAlComerElTamaHambrientoPasaAEstarContento(){
        Tamagotchi tama= new Tamagotchi();
        tama.setEstado("Hambriento");
        tama.comer();
        String estadoEsperado="Contento";

        Assert.assertEquals(estadoEsperado,tama.getEstado());

    }

    @Test
    public void testQuePruebaQueElTamaAlComerSuNivelSeIncrementaEnUno(){
        Tamagotchi tama= new Tamagotchi();
        tama.setEstado("Contento");
        tama.comer();
        Integer nivelEsperado= 1;
        Assert.assertEquals(nivelEsperado,tama.getNivel());
    }

    @Test
    public void testQuePruebaSiElTamaPasaDeAburridoAContentoSiPasaMasDe80Mins(){
        Tamagotchi tama= new Tamagotchi();
        //Pasaje de estado a Aburrido
        tama.setEstado("Aburrido");
        String estadoEsperado="Contento";
        tama.comer();

        Assert.assertEquals(estadoEsperado,tama.getEstado());


    }

    @Test
    public void testQuePruebaQueUnaMascotaAlJugarEstandoContentaIncrementaSuNivelen2(){
        Tamagotchi tama= new Tamagotchi();
        tama.setEstado("Contento");
        tama.jugar();
        Integer nivelEsperado=2;

        Assert.assertEquals(nivelEsperado,tama.getNivel());

    }

    @Test
    public void testQuePruebaQueAljugarUnTamaAburridoPasaAEstarContento(){
        Tamagotchi tama= new Tamagotchi();
        tama.setEstado("Aburrido");
        tama.jugar();
        String estadoEsperado= "Contento";

        Assert.assertEquals(estadoEsperado,tama.getEstado());

    }

    @Test
    public void testQuePruebaQueElTamaNoPuedeJugarSiEstaAburrido(){
        Tamagotchi tama= new Tamagotchi();
        //Pasaje al estado Hambriento
        tama.setEstado("Hambrienta");
        tama.jugar();
        String estadoRequeridoParaJugar= "Contento" + "Aburrido";

        Assert.assertNotEquals(estadoRequeridoParaJugar,tama.getEstado());


    }
}
