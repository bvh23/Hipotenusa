
package hipotenusa.operacion;



public class operacion {
 int C1,C2,rsultado;
  double res;
   public double enviar(String c1, String c2){
       C1= Integer.parseInt(c1);
       C2= Integer.parseInt(c2);
       res=Math.sqrt((C1*C1+C2*C2));
       
return res;

} 
}
