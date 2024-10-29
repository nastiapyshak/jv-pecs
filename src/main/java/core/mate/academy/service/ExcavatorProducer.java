package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return Arrays.asList(new Excavator(1.2, 2.4), new Excavator(3.4, 5.1));
    }
}
