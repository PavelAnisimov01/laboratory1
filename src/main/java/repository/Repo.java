package repository;

import contracts.Internet;
import contracts.Mobile;
import contracts.Tele;
import java.util.*;

/**
 * Класс репозиторий, который выполняет функцию базы данных и выполняет метод main.
 * @autor Анисимов Павел
 */
public class Repo {
    /**
     * Функция main, которая реализует примитивную работу базы данных.
     */
    public static void main(String[] args) {
        /* Создание списка объектов, который будет выполнять функцию хранения элементов базы данных */
        RepoMethods list=new RepoMethods();
        /* Создание объекта сканнер для ввода пользователем значений с клавиатуры*/
        Scanner scStr = new Scanner(System.in);
        Scanner scChislo = new Scanner(System.in);
        Scanner chislo = new Scanner(System.in);
        /* Создание счётчика для присваивания автоматически ID по контрактам*/
        Long count= 1L;
        /* Создание переменной для дальнейшего выхода из цикла по работе с базой данных*/
        int x = 1;
        /* Создание цикла, который позволяет повторять работу примитивной базы данных*/
        while (x != 0) {
            System.out.println("                    Введите нужную цифру:            ");
            System.out.println("1.Добавить контракт на мобильную связь в базу данных.");
            System.out.println("2.Добавить контракт на интернет в базу данных.");
            System.out.println("3.Добавить контракт на телевидение в базу данных.");
            System.out.println("4.Получить контракт из базы данных.");
            System.out.println("5.Удалить контракт из базу данных.");
            System.out.println("6.Закончить работу с репозиторием.");
            /* Вызов одного из методов для работы с базой данных */
            switch (chislo.nextInt()) {
                /* Вызов метода, который добавляет контракт на мобильную связь в базу данных*/
                case (1) -> {
                    Mobile mobile=new Mobile();
                    mobile.setCommon(count,scStr,scChislo);
                    System.out.println("Введите количество минут по контракту");
                    mobile.setMinut(scChislo.nextInt());
                    System.out.println("Введите количество смс по контракта");
                    mobile.setSms(scChislo.nextInt());
                    System.out.println("Введите количество гигабайтов по контракту");
                    mobile.setGb(scChislo.nextInt());
                    list.setList(list.addCommon(mobile));
                    count++;
                }
                /* Вызов метода, который добавляет контракт на проводной интернет в базу данных*/
                case (2) -> {
                    Internet internet=new Internet();
                    internet.setCommon(count,scStr,scChislo);
                    System.out.println("Введите скорость интернета по контракту");
                    internet.setSpeedOfConnection(scChislo.nextInt());
                    list.setList(list.addCommon(internet));
                    count++;
                }
                /* Вызов метода, который добавляет контракт на телевидение в базу данных */
                case (3) -> {
                    Tele tele=new Tele();
                    tele.setCommon(count,scStr,scChislo);
                    System.out.println("Введите пакет каналов по контракту");
                    tele.setPacket(scStr.nextLine());
                    list.setList(list.addCommon(tele));
                    count++;
                }
                /* Вызов метода, который получает контракт по ID из базы данных*/
                case (4) -> list.viewContract();

                /* Вызов метода, который удаляет контракт по ID из базы данных*/
                case (5) -> list.setList(list.deleteCommon());

                /* Вызов метода, который завершает работу базы данных*/
                case (6) -> {
                    x = 0;
                    System.out.println("Выход из базы данных произведен успешно");
                }
                default ->
                        System.out.println("Вы ввели значение, на которое у базы данных нет функционала, введите другое значение пожалуйста");
            }
        }
    }
}
