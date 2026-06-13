import enums.WindingType;
import models.MechanicalWatch;
import models.QuartzWatch;
import models.Watch;

void main() {
    ArrayList<Watch> watches = new ArrayList<>();

    watches.add(new QuartzWatch("Timex", "T44653", "4556-A432", 2002, "M929.17","CR2016",249.99, LocalDate.of(2022, 5, 29)));

    watches.add(new MechanicalWatch("Seiko", "11-7000", "76435", 1970, "11A", "48h", 17, WindingType.MANUAL,199.99,LocalDate.of(1985,1,31)));
}
