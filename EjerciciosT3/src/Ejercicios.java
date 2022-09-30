public class Ejercicios {


    public static void main(String[] args){
        Coche Micoche = new Coche();
        Micoche.EnumeraPuertas();
        Micoche.EnumeraPuertas();
        Micoche.EnumeraPuertas();
        Micoche.EnumeraPuertas();
        System.out.println(Micoche.puertas);

        //----- Inico Primera Parte -----//
        suma(19, 11, 8);
    }
        public static void suma(int a, int b, int c){
            int resultado;
            resultado = a + b + c;
            System.out.println(resultado);
        }

        //----- Inicio Segunda Parte -----//
        static class Coche{
        public int puertas = 0;

        public void EnumeraPuertas(){
            this.puertas++;
            }
        }
}
