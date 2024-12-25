package OU_Exercise.MidTerm.Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    private List<LibraryCard> cards = new ArrayList<>();
    private List<Learner> learners = new ArrayList<>();

    public void addLearner(Learner learner) {
        if (learner != null) {
            learners.add(learner);
        }
    }

    public void registerCard(LibraryCard card) {
        if (card != null) {
            cards.add(card);
        }
    }

    public void displayAllLearners() {
        learners.forEach(System.out::println);
    }

    public void displayDecemberBirthdays() {
        List<Learner> decemberBirthdays = learners.stream()
                .filter(l -> l.getBirthDate().getMonthValue() == 12)
                .sorted(Comparator.comparing(Learner::getBirthDate))
                .collect(Collectors.toList());

        if (decemberBirthdays.isEmpty()) {
            System.out.println("Không có người học nào sinh trong tháng 12");
            return;
        }

        decemberBirthdays.forEach(System.out::println);
    }

    public void displayCardHistory(String learnerId) {
        List<LibraryCard> learnerCards = cards.stream()
                .filter(c -> c.getLearner().getId().equals(learnerId))
                .collect(Collectors.toList());

        if (learnerCards.isEmpty()) {
            System.out.println("Không tìm thấy lịch sử thẻ cho người học: " + learnerId);
            return;
        }

        learnerCards.forEach(card -> {
            System.out.println(card);
            System.out.println("Trạng thái: " + (card.hasExpired() ? "Đã hết hạn" : "Còn hiệu lực"));
        });
    }

    public void findLearner(String learnerId) {
        learners.stream()
                .filter(l -> l.getId().equals(learnerId))
                .findFirst()
                .ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Không tìm thấy người học: " + learnerId)
                );
    }

    public void display2024Registrations() {
        List<LibraryCard> cards2024 = cards.stream()
                .filter(LibraryCard::isRegisteredIn2024)
                .collect(Collectors.toList());

        if (cards2024.isEmpty()) {
            System.out.println("Không có thẻ nào được đăng ký trong năm 2024");
            return;
        }

        cards2024.forEach(System.out::println);
    }

    public void sortAndDisplayLearners() {
        learners.stream()
                .sorted(Comparator.comparing((Learner l) -> l.getBirthDate().getYear()).reversed()
                        .thenComparing(Learner::getName))
                .forEach(System.out::println);
    }
}
