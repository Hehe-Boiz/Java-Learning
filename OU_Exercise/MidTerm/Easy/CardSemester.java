package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public class CardSemester extends LibraryCard{
    private static final double EARLY_PRICE = 100000;
    private static final double REGULAR_PRICE = 75000;

    public CardSemester(LocalDate registrationDate, Learner learner) {
        super(registrationDate, learner);
    }

    @Override
    protected LocalDate calculateExpirationDate() {
        return getRegistrationDate().plusMonths(6);
    }

    @Override
    protected boolean isEarlyRegistration() {
        int dayOfMonth = getRegistrationDate().getDayOfMonth();
        return dayOfMonth <= EARLY_REGISTRATION_DAY;
    }

    @Override
    protected double calculatePrice() {
        return isEarlyRegistration() ? EARLY_PRICE : REGULAR_PRICE;
    }
   
}
