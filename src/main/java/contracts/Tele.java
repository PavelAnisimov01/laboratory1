package contracts;

import common.Common;

/**
 Класс телевидение со свойствами <b>packet</b>, наследующий класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */


public class Tele extends Common {

    /** Поле packet */
    private String packet;


    /**
     * Конструктор - создание нового объекта без значений
     */
    public  Tele(){

    }
    /**
     * Функция определения значения поля {@link Tele#packet}
     *  @param packet - пакет каналов
     */
    public void setPacket(String packet) {
        this.packet = packet;
    }

    /**
     * Функция переопределения метода toString для вывода информации об объекте
     *  @return возвращает строку с полями объекта Tele
     */
    @Override
    public String toString() {

        return  " Контракт на цифровое телевидение: "+
                " Id=" + ID
                + ", DateOfStartofContract=" + dateOfStartofContract

                + ", DateOfEndofContract=" + dateOfEndofContract

                + ",NumberOfContract=" + numberOfContract


                + ", Packet=" + packet
                + ",   Man :" +
                "ID=" + man.getID()
                + ", FIO="+ man.getFio()
                + ", DateOfBirthday="+ man.getDateOfBirthday()
                + ", SeriyAndNumberOfPassport="+ man.getDateOfPassport()
                + ", Gender="+ man.getGender()
                + ", Age="+ man.getAge();

    }}
