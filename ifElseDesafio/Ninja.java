package javaFiasco.ifElseDesafio;

public class Ninja {

    public static void main(String[] args) {

        String ninja1;

        ninja1 = "Naruto";
        int ageNinja1= 13;
        char levelDifficulty1 = 'A';
        String missionNinja1 = "Tornar-se Chunnin";
        String nameMission1 = "***Chunnin Rocks***";
        String status1;

        if (ageNinja1 < 15)
        {
            System.out.println(ninja1 + ": Pode fazer apenas missoes C e D");
            status1 = "Missão: não-concluída";
            System.out.println(status1);
        }
        else if (ageNinja1 >= 15)
        {
            System.out.println(ninja1 + ": Pode cumprir qlq missao!");
            status1 = "Missão: concluída";
            System.out.println(status1);

        }
        System.out.println(ninja1);
        System.out.println("Missão: " + missionNinja1);

        System.out.println("-------------------------------------------------------");

        String ninja2;

        ninja2 = "Sasuke";
        int ageNinja2 = 11;
        char levelDifficulty2 = 'B';
        String missionNinja2 = "Vingar a família";
        String nameMission2 = "***Vingar o clã**";
        String status2;


        System.out.println("-------------------------------------------------------");

        if (ageNinja2 < 15)
        {
            System.out.println(ninja2 + ": Pode fazer apenas missoes C e D");
            status2 = "Missão: não-concluída";
            System.out.println(status2);
        }
        else if (ageNinja2 >= 15)
        {
            System.out.println(ninja2 + ": Pode cumprir qlq missao!");
            status2 = "Missão: concluída";
            System.out.println(status2);
        }
        System.out.println(ninja2);
        System.out.println("Missão:" + missionNinja2);

        System.out.println("-------------------------------------------------------");

        String ninja3;

        ninja3 = "Rock Lee";
        int ageNinja3 = 14;
        char levelDifficulty3 = 'C';
        String missionNinja3 = "Dominar todas as artes marciais";
        String nameMission3 = "***Rock Fu**";
        String status3;

        System.out.println("-------------------------------------------------------");

        if (ageNinja3 < 15)
        {
            System.out.println(ninja3 + ": Pode fazer apenas missoes C e D");
            status3 = "Missão: não concluída";
            System.out.println(status3);
        }
        else if (ageNinja3 >= 15)
        {
            System.out.println(ninja3 + ": Pode cumprir qlq missao!");
            status3 = "Missão: concluída";
            System.out.println(status3);
        }
        System.out.println(ninja3);
        System.out.println("Missão:" + missionNinja3);

        System.out.println("-------------------------------------------------------");

    }
    }

