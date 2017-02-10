package javaa.alvaro;
public class QueHaceJava 
{ 
 
    int a = 0;		// por estar declarada aquí, fuera de cualquier método; a es un 
				// atributo de la clase. Por lo tanto, es accesible y visible desde 
				// todos los métodos de la clase 
 
    void metodo()
	{ 
        System.out.println(a);
        a++;
    } 
 
    	@SuppressWarnings("null")
	public static void main(String args[])
	{ 
        QueHaceJava qh1 = null; 	//creas la variable String qh1
        QueHaceJava qh2 = null;		//creas la variable	String qh2
 
        qh1 = new QueHaceJava();	//permites que la variable qh1 pueda almacenar datos
 
        qh1.metodo();		//ejecuta el metodo para qh1,   imprime 0 y suma 1 a "a" 	-> a = 1
        qh1.metodo();		//de nuevo ejecuta el metodo para qh1,	imprime 1 y suma + 1... -> a = 2
        qh1.a = 33;			//almacena 33 en qh1
        qh1.metodo(); 				//imprime a = 33, a+1 .. 	-> a = 34
        System.out.println(qh1.a); 	// imprime el metodo qh1, que es = a 33
        qh2.metodo();			//ejecuta el metodo para qh2 pero vale NULL
    } 
}