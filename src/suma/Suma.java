package suma;

public class Suma {
    private int v1, v2, resultado;

        public  Suma (int valor1, int valor2){
                    this.v1 = valor1;
                    this.v2 = valor2;}

         public  void operaccion(){
                     resultado = v1 + v2;}

    public void imprimir (){
            operaccion();
        System.out.printf("el resultado es "+resultado);
    }
}
