import java.util.*;

public abstract class Sort extends ComparatorForNumber{
	public static void sort(ArrayList<Number> list) {
		ComparatorForNumber cfn = new ComparatorForNumber();
        Collections.sort(list, cfn);
	}
}

allprojects {
    gradle.projectsEvaluated {
        tasks.withType(JavaCompile) {
            options.compilerArgs << "-Xlint:unchecked" << "-Xlint:deprecation"
        }
    }
}