public class Main {
    public static void main(String[] args) {
        int[] numeros = {101,201,301,401,501};
        /*for
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        while
        int i = 0;
        while (i<5){
            System.out.println(numeros[i]);
            i++;
        }

        do while*/
        int index = 0;
        do {
            System.out.println(numeros[index]);
            index++;
        } while(index<5);



    }
}