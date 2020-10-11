public class Projectile {
    public static void main(String[] args) {

        double height = 5; // height from which ball is being projected
        double radius = 0.15; // radius of ball
        double rx = 0.0 + radius, ry = 0.0 + radius + height; // point of starting
        double vx = 0.050, vy = 0.250; // speed component of x and y direction
        final double G = -0.098;
        // gravitational pull (lowered it down to match with other values in graph)

        int boucingFactorDrop = 25; // boucingFactorDrop percent
        int xDirectionDrop = 10; // xDirectionDrop percent

        // These values can be changed if vx and vy are increased
        StdDraw.setXscale(0, +50.0);
        StdDraw.setYscale(-1.0, +50.0);

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledSquare(25, 25, 30);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(0, 0, 50, 0);
        StdDraw.line(radius, 0, radius, height);

        while (true) {
            // v = v0 + at (kinematics equation)
            vy = vy + (G * 0.02); // y component changing equation

            if (ry - radius - Math.abs(vy) <= 0 && vy < 0) {
                vy = -(vy * (100 - boucingFactorDrop)
                        / 100); // every point of touch reduces the x component of speed by 25%
                vx = vx * (100 - xDirectionDrop)
                        / 100; // every point of touch reduces the x component of speed by 10%
            }

            rx = rx + vx;
            ry = ry + vy;

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show(7);
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledCircle(rx, ry, radius);
        }
    }
}