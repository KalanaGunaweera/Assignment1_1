import com.Exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateFinder {
    List<String> dublicate = new ArrayList<>();
    List<Student> student;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public DuplicateFinder(List<Student> student) {
        this.student = student;

    }

    public List<String> getDuplicates() {
        int x = 0;
        for (int i = 0; i < student.size(); i++) {
            x = x + 1;
            for (int j = x; j < student.size(); j++) {
                if (student.get(i).getName() == student.get(j).getName()) {
                    if (student.get(i).getAge() == student.get(j).getAge()) {
                        if (student.get(i).getSchool() == student.get(j).getSchool()) {
                            dublicate.add(student.get(i).getName());
                        }
                    }
                }
            }
        }
        return dublicate;
    }

    public List<String> getDistintList() {
        List<String> non_dublicate = new ArrayList<>();

        for (int i = 0; i < student.size(); i++) {
            if (dublicate.contains(student.get(i).getName())) {
                //   System.out.println("hi");
            } else {
                non_dublicate.add(student.get(i).getName());
            }
        }

        return non_dublicate;
    }

    public void getStudentByName(String name) throws StudentNotFoundException {
        this.name = name;
        List<String> name_List = new ArrayList<>();
        for (int i = 0; i < student.size(); i++) {
            name_List.add(student.get(i ).getName());
        }
        if (name_List.contains(name)) {
            System.out.println("Name is here");
        }else {
            throw new StudentNotFoundException("Name is not here");
            }
    }
}








