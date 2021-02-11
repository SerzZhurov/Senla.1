package Port;
import java.util.*;
class Water {

    public static final int DENSITY_1000 = 1000;
    public static final int DENSITY_2000 = 2000;

    int MassOfUnitWater() {
        double CheckDensity;
        int Water;
        CheckDensity =  Math.random();
        if (CheckDensity>0.5) {Water = DENSITY_2000;
                    }
        else {Water = DENSITY_1000;
            }
        return Water;
    }



}
