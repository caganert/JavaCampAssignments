public class Main {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];

        sehirler[0][0] = "İzmir";
        sehirler[0][1] = "Aydın";
        sehirler[0][2] = "Kütahya";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Eskişehir";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Gaziantep";
        sehirler[2][2] = "Şanlıurfa";

        for (int i = 0; i <=2 ; i++) {
            System.out.println("----------------");
            for (int j = 0; j <=2 ; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}