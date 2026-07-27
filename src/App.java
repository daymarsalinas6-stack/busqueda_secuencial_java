import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int[]v= {45,50,30,65,80,20,90,15,70,55};
int dato; 
        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a buscar: ")) ;
int posicion = secuencial(v, dato );
if(posicion!= -1 ){
       JOptionPane.showMessageDialog(null, "el valor a sido encontradoen "+ posicion); 
}
else{
    JOptionPane.showMessageDialog(null, "no se encontro el valor buscado");
}
    }
    
    public static int secuencial( int []v , int dato){
        for ( int i = 0 ; i < v.length ; i++){
            if(v[i]== dato){
                return i; // encontrar el dato muestre la posicion i     
            }
        } 
        return -1;
    }
}