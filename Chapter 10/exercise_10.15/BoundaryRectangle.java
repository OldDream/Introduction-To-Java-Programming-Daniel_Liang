public class BoundaryRectangle {
	public static MyRectangle2D getRectangle(double[][] points) {
		double max_X = points[0][0];
		double max_Y = points[0][1];
		double min_X = points[0][0];
		double min_Y = points[0][1];

		for(int i = 0; i < points.length; i++) {
			if (points[i][0] > max_X)
				max_X = points[i][0];
			if (points[i][0] < min_X)
				min_X = points[i][0];
			if (points[i][1] > max_Y)
				max_Y = points[i][1];
			if (points[i][1] < min_Y)
				min_Y = points[i][1];
		}

		double x = (min_X + max_X) / 2;
		double y = (min_Y + max_Y) / 2;
		double width = max_X - min_X;
		double height = max_Y - min_Y;
		return new MyRectangle2D(x, y, height, width);
	} 
}