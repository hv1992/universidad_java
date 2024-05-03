package domain;

//Cuando implementas como clase padre una clase abstracta, es necesario que implementes todos sus metodos abstractos.
public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
