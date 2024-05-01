package paquete1;

//Cuando una clase no esta definido su nivel de acceso, en realidad toma por defecto el nivel de acceso default o package
//El mismo significa que la clase solamente va a poder ser acceso dentro del paquete.
//Dicho nivel de acceso tambien se aplica a constructores, atributos y metodos.
class Clase1 {
    
    //Los private son variables y clases que pueden ser accedido solamente dentro de dicha clase.
    private String atributoPrivado = "Valor atributo privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    } 
    
    //El public puede ser accedido por cualquier clase.
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    
    //Se puede usar el constructor a nivel protected
    //Este constructor solamente puede ser accedido por las clases que estan en el mismo paquete
    protected Clase1(int numero) {
        System.out.println("Constructor protected");
    }
    
    //Podes usar private a nivel de metodo.
    //Este constructor puede ser accedido dentro de la clase, y no pueden ser accedidos por la clase hijos.
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }
    
     //Podes usar protected a nivel de metodo.
    protected void metodoProtected(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
