package BusinessLogicLayer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static PersistenceLayer.mainScraper.getCourseList;

public class scheduleGenerator {

    static ArrayList<Course> firstYear;
    static ArrayList<Course> secondYear;
    static ArrayList<Course> thirdYear;
    static ArrayList<Course> fourthYear;

    static Major mechMajor = new Major("Mechanical Engineering");
    public static LinkedHashMap<Integer, ArrayList<Course>> mechCourses = mechMajor.getMajor();
    static Major compMajor = new Major("Computer Engineering");
    public static LinkedHashMap<Integer, ArrayList<Course>> compCourses = compMajor.getMajor();
    static Major civilMajor = new Major("Civil Engineering");
    public static LinkedHashMap<Integer, ArrayList<Course>> civilCourses = civilMajor.getMajor();
    static Major elecMajor = new Major("Electrical Engineering");
    public static LinkedHashMap<Integer, ArrayList<Course>> elecCourses = elecMajor.getMajor();

    public static void main(String[] args) {

        ArrayList<Course> courses = getCourseList();

        ArrayList<Course> taken = new ArrayList<>(courses);
        taken.add(courses.get(0));
        setMajor("civil", taken);

    }

    static void setMajor(String major, ArrayList<Course> coursesTaken) {

        LinkedHashMap<Integer,ArrayList<Course>> majorCourses = null;

            switch(major) {
                case "civil":
                    majorCourses = civilCourses;
                    break;
                case "mechanical":
                    majorCourses = mechCourses;
                    break;
                case "electrical":
                    majorCourses = elecCourses;
                    break;
                case "computer":
                    majorCourses = compCourses;
                    break;
                default:
                    break;
            }

        System.out.println("\nFirst Year Courses:");
        for(int i=0; i<majorCourses.get(1).size(); i++) {
            firstYear = new ArrayList<>(majorCourses.get(1).size());
            firstYear.add(majorCourses.get(1).get(i));
            System.out.println(firstYear);
        }
        System.out.println("\nSecond Year Courses:");
        for(int i=0; i<majorCourses.get(2).size(); i++) {
            secondYear = new ArrayList<>(majorCourses.get(2).size());
            secondYear.add(majorCourses.get(2).get(i));
            System.out.println(secondYear);
        }
        System.out.println("\nThird Year Courses:");
        for(int i=0; i<majorCourses.get(3).size(); i++) {
            thirdYear = new ArrayList<>(majorCourses.get(3).size());
            thirdYear.add(majorCourses.get(3).get(i));
            System.out.println(thirdYear);
        }
        System.out.println("\nFourth Year Courses:");
        for(int i=0; i<majorCourses.get(4).size(); i++) {
            fourthYear = new ArrayList<>(majorCourses.get(4).size());
            fourthYear.add(majorCourses.get(4).get(i));
            System.out.println(fourthYear);
        }
    }
}
