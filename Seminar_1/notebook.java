package Seminar_1;
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД hd hdd
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих */

public class notebook {
    private int ramSizeGB;
    private int hddSizeGB;
    private String osType;
    private String color;
    private String vendor;

    public notebook(String vendor, Integer ramSizeGB,Integer hddSizeGB, String osType, String color) {
        this.ramSizeGB = ramSizeGB;
        this.hddSizeGB = hddSizeGB;
        this.osType = osType;
        this.color = color;
        this.vendor = vendor;
    }

    public String getColor() {
        return color;
    }
    public int getRamSizeGB() {
        return ramSizeGB;
    }
    public int getHddSizeGB() {
        return hddSizeGB;
    }
    public String getOsType() {
        return osType;
    }
    public String getVendor() {
        return vendor;
    }
    @Override
    public String toString() {
        return "Notebook: "+getVendor()+", OS:"+ getOsType() +", RAM:"+getRamSizeGB()+"GB, HDD:"+getHddSizeGB()+"GB, "+getColor();
    }
}
