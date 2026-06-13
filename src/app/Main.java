import models.QuartzWatch;

void main() {
    QuartzWatch timexExpedition = new QuartzWatch("Timex", "T44653", "4556-A432", 2002, "M929.17","CR2016",249.99, LocalDate.of(2026, 5, 29));

    System.out.println(timexExpedition.needsService(24));
}
