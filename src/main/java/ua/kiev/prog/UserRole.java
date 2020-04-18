package ua.kiev.prog;

public enum UserRole {
    ADMIN, USER, MODER;

    @Override
    public String toString() {
        return "ROLE_" + name();
    }
}
