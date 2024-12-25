package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public class CardYear extends LibraryCard{
    private static final double EARLY_PRICE = 350000;
    private static final double REGULAR_PRICE = 250000;
    private static final int EARLY_REGISTRATION_MONTH = 8;
    private static final int EARLY_REGISTRATION_DAY = 15;

    public CardYear(LocalDate registrationDate, Learner learner) {
        super(registrationDate, learner);
    }

    @Override
    protected LocalDate calculateExpirationDate() {
        return getRegistrationDate().plusYears(1);
    }

    @Override
    protected boolean isEarlyRegistration() {
        if (getRegistrationDate().getMonthValue() != EARLY_REGISTRATION_MONTH) {
            return false;
        }
        return getRegistrationDate().getDayOfMonth() < EARLY_REGISTRATION_DAY;
    }

    @Override
    protected double calculatePrice() {
        return isEarlyRegistration() ? EARLY_PRICE : REGULAR_PRICE;
    }

    
}
