package resolveKata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignEqual {
    public static boolean assignEq(String project, String bom) {
        String[] projectMas = project.split(", ");
        String[] bomMas = bom.split(", ");
        List<String> listP = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        Collections.addAll(listP, projectMas);
        Collections.addAll(listB, bomMas);
        Collections.sort(listP);
        Collections.sort(listB);
        System.out.println(listP);
        System.out.println(listP.size());
        System.out.println(listB);
        System.out.println(listB.size());

        return listB.containsAll(listP);
    }

    public static void main(String[] args) {
        String project = "Y1, Y5, Y4, Y3, Y2, Y1.A9, Y1.A8, Y1.A7, Y1.A6, Y1.A5, Y1.A4, Y1.A3, Y1.A28, Y1.A27, Y1.A26, Y1.A25, Y1.A24, Y1.A23, Y1.A22, Y1.A21, Y1.A20, Y1.A2, Y1.A19, Y1.A18, Y1.A17, Y1.A16, Y1.A15, Y1.A14, Y1.A13, Y1.A12, Y1.A11, Y1.A10, Y1.A1";
        String BOM = "Y1, Y2, Y1.A24, Y3, Y1.A17, Y1.A11, Y5, Y1.A25, Y1.A26, Y1.A23, Y1.A1, Y1.A27, Y1.A28, Y4, Y1.A4, Y1.A3, Y1.A2, Y1.A7, Y1.A6, Y1.A5, Y1.A18, Y1.A20, Y1.A15, Y1.A16, Y1.A21, Y1.A22, Y1.A19, Y1.A10, Y1.A9, Y1.A8, Y1.A12, Y1.A13, Y1.A14";
        System.out.println(assignEq(project, BOM));
    }
}
