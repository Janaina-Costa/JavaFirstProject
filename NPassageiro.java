package carrodepalhaco;
import java.util.Scanner;

public class NPassageiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nPassageiros;
        System.out.println("Quantas pessoas entraram no carro?");
        nPassageiros = input.nextInt();
        if(nPassageiros>5){
            var reduz = nPassageiros - 5;
            System.out.printf("%s é gente demais. Isso não é carro de palhaço. Favor descer %s.", nPassageiros, reduz);
        }else{
            System.out.println("Sigam e paz e boa viajem");
        }
    }
}
