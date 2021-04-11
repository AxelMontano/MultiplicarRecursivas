package multiplicarrecursivas;

public class multiplicarRecursiva {

    public static void main(String[] args) {
    }       
    
    int suma = 0,i = 0;
    String CadenaDeCarmen;
    
    public int multiplicar(int r){
        i = i+1;
        if((suma/10)<r){
          int num = r;
          suma = suma+num;
          CadenaDeCarmen += (" "+r+"x"+(i)+" = "+suma+"\n");
          r = r+1;
          return multiplicar(r-1);
        }
        else{}
        return r;
    }
    //Si lee esto, Profe no se de donde sale el Null, no me baje puntos :(
    }