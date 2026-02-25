package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Апелляция по экзамену", 1));
        issues.add(new Issue("Не выставлена оценка", 2));
        issues.add(new Issue("Проблема с регистрацией на курс", 3));
        issues.add(new Issue("Не работает доступ к LMS", 2));
        issues.add(new Issue("Конфликт расписания", 4));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.isEmpty()) {
            System.out.println("Список проблем пуст.");
            return;
        }

        System.out.println("Самая срочная проблема: " + issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (issues.isEmpty()) {
            System.out.println("Список проблем пуст. Нечего решать.");
            return;
        }

        // удалить 2 проблемы (если есть)
        for (int i = 0; i < 2; i++) {
            Issue resolved = issues.poll(); // удаляет самую срочную
            if (resolved == null) {
                break;
            }
            System.out.println("Решена проблема: " + resolved);
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        if (issues.isEmpty()) {
            System.out.println("Список проблем пуст.");
            return;
        }

        System.out.println("Оставшиеся проблемы:");
        for (Issue issue : issues) {
            System.out.println(issue);
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Описание проблемы не может быть пустым.");
            return;
        }
        if (urgency < 1) {
            System.out.println("Уровень срочности должен быть >= 1.");
            return;
        }

        issues.add(new Issue(description.trim(), urgency));
        System.out.println("Добавлена новая проблема: " + description.trim() + " (срочность " + urgency + ")");
    }
}
