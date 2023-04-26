import javax.xml.transform.SourceLocator;

public class operadores{
    public static void main(String args[]) {

        String nomeCompleto = "lingu" + "java";

        System.out.println(nomeCompleto);

        int a, b,c,d;
        a= 5;
        b= 8;
        c=8;
        d=6;
        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);
        String resu2 = c>d ?"verdadeiro" :"falso"; // espreçao booleana se retorna um true ou false
        System.out.println(resu2);
        // ==/igual
        //!= /diferente

        String nom1 ="mag";
        String nom2 ="mag";
        System.out.println(nom1.equals(nom2));
    /// equals usado pra comparar
    // operadores logicos 
    //&& = E
    // || = ou
    boolean cond = false;
    boolean cond1 = true ;
    if(cond || cond1){
        System.out.println("verdadeiro");
    } 
    System.out.println("fim");

    if (cond && cond1){
        System.out.println("false");
    }
     System.out.println("deu ruim");
       
    }


}
