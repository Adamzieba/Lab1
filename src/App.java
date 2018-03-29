import java.util.ArrayList;

public class App {
    public static void presentInformation(MaterialPoint point, int label, double distance) {
        double mass = point.getMass();
        double centralMomentOfInertia = point.getCentralMomentOfInertia();
        double parallelMomentOfInertia = point.getParallelMomentOfInertia(distance);

        String information = point.toString() + ": " + label + "\n"
                + "Mass: " + mass + "\n"
                + "Moment of inertia (center of mass): " + centralMomentOfInertia + "\n"
                + "Moment of inertia (parallel axis): " + parallelMomentOfInertia + "\n";

        System.out.println(information);
    }

    public static void main(String[] args) {
        MaterialPoint point1 = new MaterialPoint();
        MaterialPoint point2 = new MaterialPoint(2.0);
        presentInformation(point1, 1, 1.0);
        presentInformation(point2, 2, 1.0);

        point1.setMass(3.0);
        presentInformation(point1, 1, 1.0);

        ArrayList<MaterialPoint> points = new ArrayList<>();
        double[] masses = {4.0, 2.0, 1.0, 3.0, 5.0};

        for(int i = 0; i < 5; i++) {
            MaterialPoint point = new MaterialPoint(masses[i]);
            points.add(point);
        }

        int counter = 3;
        for(MaterialPoint point : points) {
            presentInformation(point, counter, 3.0);
            counter++;
        }
    }
}
