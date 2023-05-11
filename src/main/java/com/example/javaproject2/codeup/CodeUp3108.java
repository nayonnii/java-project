package com.example.javaproject2.codeup;

import java.util.*;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() { return code; }

    public int getTestId() { return testId; }

    public String getName() { return name; }
}

public class CodeUp3108 {

    /* 1. 학생들을 저장할 List 생성
       Student 타입의 students라는 ArrayList 생성  */
    private List<Student> students = new ArrayList<>();


    /* 2. 학생을 한 명씩 입력(?)받음
      한 명의 학생의 code, testId, name를 입력받아 Student타입의 객체로 반환
      Student 타입의 students라는 ArrayList 생성  */
    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    /* 3. 매개변수로 받은 학생의 testId와 리스트 속 학생의 testId 비교 후 중복 체크
       매개변수로 받은 학생(pStudent객체)와 List의 학생정보(students)를 넣은 student객체가 같은지 중복 체크 후
       중복일 경우 true, 중복이 아닐 경우 false 반환  */
    private boolean isExist(Student pStudent) {  //pStudent: 파라미터 값으로 받은 student값
        //code 중복 여부 체크
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) {
                return true;
            }
        }
        return false;
    }

    /* 4. 매개변수로 받은 학생의 testId와 List 속 학생의 testId 비교 후 같으면 삭제
      매개변수로 받은 학생(pStudent객체)의 testId와 List의 학생정보(students)의 testId가 같은지 체크 후
      같으면 리스트에서 삭제 */
    private void deleteStudent(Student pStudent) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()) {
                students.remove(i);
            }
        }
    }

    /* 5. 학생정보를 문자열로 받아 Student객체로 생성 후 해당 객체의 code가 I인지 판별
       String타입의 문자열로 입력받은 매개변수를 split()을 통해 배열에 저장한 후 각각의 값을 makeALine()을 통해 Student객체로 생성함
       이 때 해당 Student의 code가 I이면 addAStudent()메소드를 타고, 아닐 경우 deleteStudent()메소드를 탐 */
    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);

        if ("I".equals(student.getCode())) {
            addAStudent(student);
        }else {
            deleteStudent(student);
        }
    }

    /* 6. 매개변수로 입력받은 student객체가 List에 저장되어 있지 않을 경우 students List에 추가
       매개변수 student객체의 isExist() 값이 false일 경우 student List에 추가 */
    private void addAStudent(Student student) {  //*참고) add를 했는지 안했는지 여부를 체크해야 한다면 void -> boolean으로 변경
        // 중복 체크를 한 후 데이터를 넣는다.
        if (!isExist(student)) {
            students.add(student);
        }
    }

//    /* 0. students List 값 출력(확인용)
//       students List의 학생정보를 student 객체에 넣고
//       student 객체의 code, TestId, name을 출력
//        +참고) getTestId는 int형이지만 %s로 받아도 에러가 나지 않음(type casting) */
//       private void printStudents() {
//        for (Student student : students) {
//            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
//        }
//    }


    /* 7. students List값을  testId의 오름차순으로 정렬 후 위치값(arr)에 맞는 데이터 출력
       Collections.sort() 메소드를 통해 오름차순으로 정렬 후
       for문을 통해 arr에 저장된 위치값에 맞는 List값 출력  */
    public void printSpecificStudents(int[] arr) {
        Collections.sort(students, new Comparator<Student>() {
        /*  students: 정렬대상이 되는 리스트
            new Comparator<Student>() : Comparator 인터페이스를 익명클래스로 구현한 객체를 생성하는 코드로, 학생들을 비교하고 정렬하는 데 사용됨
             +) Comparator 인터페이스는 두 객체를 비교하여 정렬 순서를 결정하는데 사용됨
         */
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
                /* Comparator 인터페이스를 재정의한 compare 메소드로, 두 개의 객체를 비교하여 정렬 순서를 결정함
                    반환값 < 0 : 첫번째 객체를 두번째 객체의 앞으로 이동
                    반환값 = 0 : 두 객체의 순서 유지
                    반환값 > 0 : 첫번째 객체를 두 번째 객체의 뒤로 이동
                */
            }
        });

        for(int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodeUp3108 codeup3108 = new CodeUp3108();
        int size = sc.nextInt();    // 입력받을 학생 수

        /* sc.nextInt()메소드는 정수값을 입력받은 후 개행문자('\n')을 입력 버퍼에 남겨둔다.
           이후 sc.nextLine()메소드를 호출하면 남아있던 개행문자를 읽어와서 빈 문자열을 반환하게 된다.
           그리하여 실제 문자열을 받아오기 전, sc.nextLine()메소드를 호출하여 빈 문자열을 읽어옴으로써
           개행 문자를 버리고 입력버퍼를 비워야 한다.
            +) 입력버퍼를 비우지 않는다면 이후 line 변수에는 개행문자만 들어가게 된다.
         */
        sc.nextLine();

        /* size만큼 입력받은 학생정보를 process() 메소드의 매개변수로 넘김 */
        for (int i = 0; i < size; i++) {
            String line = sc.nextLine();
            codeup3108.process(line);
        }

        /* arr2[] : 문자열로 입력받은 데이터의 위치값이 split()메소드를 통해 분리되어 저장   */
        String[] arr2 = sc.nextLine().split(" ");

        /* arr3[] :  arr2와 동일한 배열이나, 타입만 integer로 변환하여 저장 */
        int[] arr3 = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
        }

        /* 데이터의 위치값을 printSpecificStudents()메소드로 넘김 */
        codeup3108.printSpecificStudents(arr3);
    }
}
