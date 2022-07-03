public class Main {
    public static void main(String[] args) {
	int operacion=suma(1,2,3);
	System.out.println("operación="+operacion);
	Coche coche = new Coche();
	coche.incrementarPuertas();
	System.out.println("numPuertas = "+coche.numPuertas);
    }

    public static int suma(int p1, int p2, int p3){
	return p1 + p2+ p3;
    }
}