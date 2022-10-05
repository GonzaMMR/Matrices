
package test;

/**
 *
 * @author Alumno Mañana
 */
public class Matriz {
    
    static int [][] tbBid = new int [3][3];
    
   public static int alea(int li, int ls){//función de JAVA
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
    static int i;
    static int j;
    
    public static void main(String[] args) {
         
         //cargar tabla
         for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                tbBid[i][j]=alea(0,9);
            }
        }
        System.out.println("TABLA BIDIMENSIONAL");
        System.out.println("");
        visualizar();
    }
    
    public static void visualizar(){
        //visualizar la tabla
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("\t"+tbBid[i][j]);
            }
            System.out.println("");
        }
    }
}
