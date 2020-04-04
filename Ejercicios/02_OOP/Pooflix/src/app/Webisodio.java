package app;

public class Webisodio extends Episodio {

    public String url;

    @Override
    public void reproducir() {

        System.out.println("Reproduciendo episodio " + this.nombre + " " + this.url);
    }
    
    }    

}