public class CAMM {
    public static void main(String[] args) {
	double RADIUS  = Double.parseDouble(args[0]);
	double START   = Double.parseDouble(args[1]);
	int ITERATIONS = Integer.parseInt(args[2]);
	
	double estimation = START;
	for(int n = 0; n <= ITERATIONS; n++) {
	    estimation = camm(estimation, RADIUS, n);
	}

	System.out.println(estimation);
    }

    private static double camm(double y, double r, int n) {
	double twopow = Math.pow(2, n+2);
	double rpow   = Math.pow(r, 2);
	double ydiv   = Math.pow(y / twopow, 2);
	double y_new =
	    twopow*Math.sqrt(
	        Math.pow(rpow - Math.sqrt(rpow - ydiv), 2) + ydiv
	    );
	return y_new;
    }
}
