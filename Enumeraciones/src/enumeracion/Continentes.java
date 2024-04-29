package enumeracion;

public enum Continentes {
    AFRICA(53),//Aqui se usa el constructor, que en este caso, se pasa la cantidad de paises por continente.
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14); //Al ultimo elemento le ponemos ;
    
    private final int paises; //Este es el atributo del enum
    
    Continentes(int paises){ //Este es el constructor
        this.paises = paises;
    }
    
    //Retorna la cantidad de paises
    public int getPaises(){
        return this.paises;
    }
    
}
