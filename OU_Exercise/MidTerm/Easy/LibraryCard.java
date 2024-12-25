package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public abstract class LibraryCard {
    private static int count =0;
    private String id;
    private LocalDate registrationDate;
    private LocalDate expirationDate;
    private Learner learner;

    protected static final int EARLY_REGISTRATION_DAY = 7;

    public LibraryCard(LocalDate registrationDate, Learner learner) {
        if (registrationDate == null) {
            throw new IllegalArgumentException("Ngày đăng ký không được để trống");
        }
        if (learner == null) {
            throw new IllegalArgumentException("Thông tin người học không được để trống");
        }

        this.id = String.format("LIB-%05d", ++count);
        this.registrationDate = registrationDate;
        this.learner = learner;
        this.expirationDate = calculateExpirationDate();
    }

    protected abstract LocalDate calculateExpirationDate();
    protected abstract double calculatePrice();
    protected abstract boolean isEarlyRegistration();

    public boolean hasExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    public boolean isRegisteredIn2024() {
        return registrationDate.getYear() == 2024;
    }

    // Getters
    public String getId() { return id; }
    public LocalDate getRegistrationDate() { return registrationDate; }
    public LocalDate getExpirationDate() { return expirationDate; }
    public Learner getLearner() { return learner; }

    @Override
    public String toString() {
        return String.format("Thẻ thư viện: ID: %s, Ngày đăng ký: %s, Ngày hết hạn: %s, Giá: %.2f, %s",
                id, registrationDate, expirationDate, calculatePrice(), learner);
    }
}
