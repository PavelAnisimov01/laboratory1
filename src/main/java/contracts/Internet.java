package contracts;

import common.Common;


/**
 * Класс интернет со свойствами <b>speedOfConnection</b>, наследующий класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */
public class Internet extends Common {
    /** Поле speedOfConnection */
    private int speedOfConnection;

    /**
     * Конструктор - создание нового объекта без значений
     */
    public Internet(){

    }
    /**
     * Функция определения значения поля {@link Internet#speedOfConnection}
     *  @param speedOfConnection - скорость интернета
     */

    public void setSpeedOfConnection(int speedOfConnection) {
        this.speedOfConnection = speedOfConnection;
    }

    /**
     * Функция переопределения метода toString для вывода информации об объекте
     *  @return возвращает строку с полями объекта Internet
     */
    @Override
    public String toString() {

        return " Контракт на проводной интернет: " +
                " Id=" + ID
                + ", DateOfStartofContract=" + dateOfStartofContract

                + ", DateOfEndofContract=" + dateOfEndofContract

                + ",NumberOfContract=" + numberOfContract


                + ", SpeedOfConnection=" + speedOfConnection
                + ",   Man :" +
                "ID=" + man.getID()
                + ", FIO=" + man.getFio()
                + ", DateOfBirthday=" + man.getDateOfBirthday()
                + ", SeriyAndNumberOfPassport=" + man.getDateOfPassport()
                + ", Gender=" + man.getGender()
                + ", Age=" + man.getAge();

    }
}


