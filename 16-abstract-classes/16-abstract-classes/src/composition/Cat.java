package composition;

public interface Cat {
    default String hunt() {
        return "That was a good meal";
    }

    default String scratch() {
        return "Feels good on my claws";
    }

     default String makeNoise() {
        return "Roar!";
    }

    default String purr() {
        return "purrrr";
    }

    default String cleanSelf() {
        return "I feel clean!";
    }

    default String cleanOthers() {
        return "I cleaned my family.";
    }
}
