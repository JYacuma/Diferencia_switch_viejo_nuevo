//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---DIAS DE LA SEMANA----");
        System.out.println(" ");

        int dia = 3;

        String nombreDelDia;

        switch (dia) {
                case 1:
                    nombreDelDia = "Lunes";
                    break;
                case 2:
                    nombreDelDia = "Martes";
                    break;
                case 3:
                    nombreDelDia = "Miércoles";
                    break;
                case 4:
                    nombreDelDia = "Jueves";
                    break;
                case 5:
                    nombreDelDia = "Viernes";
                    break;
                case 6:
                    nombreDelDia = "Sábado";
                    break;
                case 7:
                    nombreDelDia = "Domingo";
                    break;
                default:
                    nombreDelDia = "Día inválido";
                    break;
            }

            System.out.println("El día es: " + nombreDelDia);


    }
}