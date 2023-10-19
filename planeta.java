public class planeta {

String nombre;
int cantidadSatelites = 0;
double masa = 0;
double volumen = 0; 
double diametro = 0; 
double distanciaAlSol = 0;
boolean esObservable;


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getCantidadSatelites() {
    return cantidadSatelites;
}

public void setCantidadSatelites(int cantidadSatelites) {
    this.cantidadSatelites = cantidadSatelites;
}

public double getMasa() {
    return masa;
}

public void setMasa(double masa) {
    this.masa = masa;
}

public double getVolumen() {
    return volumen;
}

public void setVolumen(double volumen) {
    this.volumen = volumen;
}

public double getDiametro() {
    return diametro;
}

public void setDiametro(double diametro) {
    this.diametro = diametro;
}

public double getDistanciaAlSol() {
    return distanciaAlSol;
}

public void setDistanciaAlSol(double distanciaAlSol) {
    this.distanciaAlSol = distanciaAlSol;
}

public boolean isEsObservable() {
    return esObservable;
}

public void setEsObservable(boolean esObservable) {
    this.esObservable = esObservable;
}

public planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro,
        double distanciaAlSol, boolean esObservable) {
    this.nombre = nombre;
    this.cantidadSatelites = cantidadSatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diametro = diametro;
    this.distanciaAlSol = distanciaAlSol;
    this.esObservable = esObservable;
}

public double calcularDensidad() {
    return masa / volumen;
}

void imprimir (){

    System.out.println("Nombre: " + nombre);
    System.out.println("Cantidad de Satélites: " + cantidadSatelites);
    System.out.println("Masa: " + masa );
    System.out.println("Volumen: " + volumen);
    System.out.println("Diámetro: " + diametro);
    System.out.println("Distancia al Sol: " + distanciaAlSol);
    System.out.println("Es Observable: " + (esObservable ? "Sí" : "No"));
    System.out.println("Densidad: " + calcularDensidad());
    System.out.println("Kevin Añazco");

}
  public static void main(String[] args) {
    
        planeta tierra = new planeta("Tierra", 1, 5.972e24, 
        1.08321e12, 12742, 150000000, true);
        tierra.imprimir();


    }
}
