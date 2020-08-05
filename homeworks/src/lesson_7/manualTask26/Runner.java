package lesson_7.manualTask26;

import lesson_7.manualTask26.floorCleaning.RobotVacuumCleaner;
import lesson_7.manualTask26.floorCleaning.VacuumCleaner;

public class Runner {
    public static void main(String[] args) {
        VacuumCleaner vac = new VacuumCleaner();
        vac.cleaning();//Пытаемся пропылесосить
        vac.inTheSocet(); //Включаем пылесос в розетку
        vac.cleaning();//Пытаемся пропылесосить
        vac.turnOn();//Включаем пылесос
        vac.cleaning();//Пылесосим


        RobotVacuumCleaner rob = new RobotVacuumCleaner();
        rob.inTheSocet();//Включам робот пылесос(РП) в розетку и заряжаем его
        rob.turnOn();// Включаем РП
        rob.cleaning();//РП убирает
        rob.wetCleaning();//Включаем вкючаем влажную уборку
        rob.cleaning();//РП пытается убрать
        rob.inTheSocet();//Заряжаем РП
        rob.cleaning();//РП убирает с влажной уборкой

    }

}
