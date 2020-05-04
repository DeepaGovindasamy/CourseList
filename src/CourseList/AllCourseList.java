package CourseList;

import java.util.*;

public class AllCourseList implements CourseList{


    List<String> regularCourseList = Arrays.asList("Java-1","Java-2","Data Science-1","Data Science-2");
    List<String> summerCourseList = Arrays.asList("Dev-Ops","Network Security");
    List<String> winterCourseList = Arrays.asList("HTML-Front End","Sales Force");
    List<String> oneoffCourseList = Arrays.asList("Machine Learning","BigData");

    @Override
    public List  courseFinalList(String semesterType) {
        semesterType = semesterType.toLowerCase();
        Map<String, List> reminderFinalList = new HashMap<>();
        reminderFinalList.put("regular", regularCourseList);
        reminderFinalList.put("summer", summerCourseList);
        reminderFinalList.put("winter", winterCourseList);
        reminderFinalList.put("crash", oneoffCourseList);
        List<List> finalCombination = new ArrayList<>();
        finalCombination.add(reminderFinalList.get("regular"));

        for (String name : reminderFinalList.keySet()) {
            if (name.contains(semesterType)) {
                finalCombination.add(reminderFinalList.get(semesterType));
            }
        }
        System.out.println(finalCombination);
        return finalCombination;
    }
}
