package models;

public class WatchPrinter {
    public void printStatus(Watch watch){
        if(watch.needsService()){
            System.out.println("Watch " + watch.getManufacturer() + " need service (last service was in "+watch.getLastService()+")! Do it right now!");
        }
        else
        {
            System.out.println("Watch " + watch.getManufacturer() + " does not need to be serviced (last service was in "+watch.getLastService()+"), however if you want to you can do it!");
        }
    }
}
