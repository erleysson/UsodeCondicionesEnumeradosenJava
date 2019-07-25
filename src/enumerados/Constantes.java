package enumerados;

public enum Constantes {
    MENSAJE_CUADRO("esto es un mensaje"),
    MENSAJE_TITULO("Esto es un titulo"),
    MENSAJE_DOLAR_ALTO("el dolar esta muy caro"),
    MENSAJE_DOLAR_BAJO("el dolar esta muy barato"),
    MENSAJE_INGRESO_VALOR("ingrese un valor");

    private  String mensaje;

    Constantes(String s){
        this.mensaje = s;

    }

    public  String getMensaje(){

        return mensaje;
    }
}
