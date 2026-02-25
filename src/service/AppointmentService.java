package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add("Консультация по математике");
        appointments.add("Консультация по программированию");
        appointments.add("Встреча с академическим советником");
        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("Апелляция по экзамену");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (appointments.isEmpty()) {
            System.out.println("Список записей пуст.");
            return;
        }
        String removed = appointments.removeLast();
        System.out.println("Отменена запись: " + removed);
    }

        public void showFirstAndLast () {
            // TODO: Print first and last appointment
            if (appointments.isEmpty()) {
                System.out.println("Список записей пуст.");
                return;
            }
            System.out.println("Первая запись: " + appointments.getFirst());
            System.out.println("Последняя запись: " + appointments.getLast());
        }

        public void printAppointments () {
            // TODO: Traverse using Iterator
            if (appointments.isEmpty()) {
                System.out.println("Список записей пуст.");
                return;
            }

            System.out.println("Все записи:");
            for (String appointment : appointments) {
                System.out.println(appointment);
            }
        }
}
