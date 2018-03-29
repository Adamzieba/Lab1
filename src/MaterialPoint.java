public class MaterialPoint {
    private double mass;

    public MaterialPoint() {
        this.mass = 1.0;
    }

    public MaterialPoint(double mass) {
        this.mass = mass;
    }

    public double getCentralMomentOfInertia() {
        return 0.0;
    }

    public double getParallelMomentOfInertia(double distance) {
        return this.getCentralMomentOfInertia() + this.mass * Math.pow(distance, 2);
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Punkt materialny";
    }
}
