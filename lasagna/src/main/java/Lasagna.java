public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int reduced) {
        int start = expectedMinutesInOven();
        return (start - reduced);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer) {
        return (layer * 2);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int ovenTime) {
        int layerPrep = layer * 2;
        return (layerPrep + ovenTime);
    }
}
