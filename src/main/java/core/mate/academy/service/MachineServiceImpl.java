package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();

        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            machines.addAll(bulldozers);
        } else if (type == Excavator.class) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            machines.addAll(excavators);
        } else if (type == Truck.class) {
            List<Truck> trucks = new TruckProducer().get();
            machines.addAll(trucks);
        }

        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) { // змінено <= на <
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) { // змінено <= на <
            machines.get(i).doWork();
        }
    }
}
