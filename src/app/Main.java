import enums.WindingType;
import models.MechanicalWatch;
import models.QuartzWatch;
import models.Watch;
import models.WatchPrinter;

void main() {
    ArrayList<Watch> watches = new ArrayList<>();
    WatchPrinter wp1 = new WatchPrinter();

    watches.add(new QuartzWatch("Timex", "T44653", "4556-A432", 2002, "M929.17","CR2016",249.99, LocalDate.of(2025, 5, 29)));

    watches.add(new MechanicalWatch("Seiko", "11-7000", "76435", 1970, "11A", "48h", 17, WindingType.MANUAL,199.99,LocalDate.of(1985,1,31)));

    for (Watch w : watches)
    {
        System.out.println(w);
        wp1.printStatus(w);
    }

    watches.get(1).service();

    for (Watch w : watches)
    {
        if(w.getSerialNumber() == "76435")
        {
            wp1.printStatus(w);
        }
    }
}
