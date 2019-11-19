package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;// = new ArrayList<>();

    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {

        for (Lab each : labs) {
            if (labName == each.getName()) return each;
        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        Lab lab = getLab(labName);
        if (lab == null){
            throw new UnsupportedOperationException();
        }
        lab.setStatus(labStatus);
//
//        for (Lab each : labs) {
//            if (labName == each.getName()) {
//                each.setStatus(labStatus);
//                break;
//            }
//        }

    }

    public void forkLab(Lab lab) {

//        for (Lab each : labs) {
//            if (each == lab) {
//                each.setStatus(LabStatus.PENDING);
//                break;
//            }
//        }

        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {
        for (Lab each : labs) {
            if (labName == each.getName()) return each.getStatus();
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = labs.size() - 1; i >= 0; i--){
            Lab each = labs.get(i);
            sb.append(each.getName()).append(" > ").append(each.getStatus()).append("\n");
        }

        return sb.toString().trim();
    }
}