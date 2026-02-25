package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.addLast("Отправил задание");
        actions.addLast("Отписался от курса");
        actions.addLast("Зарегистрировался на курс");
        actions.addLast("Обновил профиль");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (actions.isEmpty()) {
            System.out.println("История действий пуста.");
            return;
    }
        String undone = actions.removeLast();
        System.out.println("Отменено действие: " + undone);
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.addLast("Запросил академическую справку");
        System.out.println("Добавлено действие: Запросил академическую справку");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (actions.isEmpty()) {
            System.out.println("История действий пуста.");
            return;
    }
        System.out.println("Первое действие: " + actions.getFirst());
        System.out.println("Последнее действие: " + actions.getLast());
    }

    public void printHistory() {
        // TODO: Iterate through history
        if (actions.isEmpty()) {
            System.out.println("История действий пуста.");
            return;
        }

        System.out.println("История действий:");
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
