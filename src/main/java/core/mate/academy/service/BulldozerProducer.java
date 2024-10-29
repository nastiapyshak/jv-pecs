package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(new Bulldozer(2.5, 1.2), new Bulldozer(3.0, 1.5));
    }
}
