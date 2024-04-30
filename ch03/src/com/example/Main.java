package com.example;

import java.util.*;


public class Main{
    public static void main(String[] args) {
        //타입캐스팅(type casting):묵시적(자동)으로 타입 캐스팅 double d =10;

        //arraylist 예제
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("arraylist : "+ arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        int i = arrayList2.get(0);
        int i1 = arrayList2.get(1);
        System.out.println(i);
        System.out.println(i1);

        String[] data = {"홍","길","동"}; //Strind data[] = {"홍","길","동"}; 같이 괄호 뒤에 넣어도 됨
        System.out.println(data);

        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(data));
        System.out.println(arrayList3);


        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("111","222","333"));
        System.out.println(pitches);
        String s1 = String.join(",",pitches);
        System.out.println(s1);
        String[] lectures = {"java","sql","spring"};
        //문자열배열lecture의 원소를 콤마로 결합
        String res = String.join(",",lectures);
        System.out.println(res);

        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); // "사람" 출력
        //
        HashMap<String, String> intro = new HashMap<>();
        intro.put("이름","추호연");
        intro.put("email","hoydi110@gmail.com");
        intro.put("취미","독서");


        System.out.println(intro.containsKey("주소"));
        //주소가없으면 intro에 주소 추가
        if (!intro.containsKey("주소")) {
            intro.put("주소","대구");
        }
        for (Map.Entry<String, String> entry : intro.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String,Integer> treeMap = new TreeMap<>();
        //treemap 에 요소추가
        treeMap.put("Apple",10);
        treeMap.put("Banana",20);
        treeMap.put("Orange",30);

        //키가 정렬된 순서로 순환
        for(Map.Entry<String,Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        //자료구조는 불변형,가변형,중복허용,중복불허,순서가짐,순서무관
        /*
        String : 불변
        StringBuffer : 가변
        Array : 순서o, 중복허용
        List : 순서o, 중복허용
        Map :  순서무관
        Set : 중복불허, 순서무관


         */

        //set 실습 : s1 집합원소 빛의 3원색(red, green, blue) 를
        // 출판에 사용되는 색상 cmyk(cyan,magent,yellow) color2
        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");

        Set<String> color2 = new HashSet<>();
        color2.add("Cyan");
        color2.add("Magenta");
        color2.add("Yellow");
        color2.add("Key");

        //교집합구하기
        Set<String> color3 = new HashSet<>(color);
        color3.retainAll(color2);
        System.out.println(color3);
        //합집합구하기
        Set<String> color4 = new HashSet<>(color);
        color4.addAll(color2);
        System.out.println(color4);

        //차집합구하기
        Set<String> color5 = new HashSet<>(color2);
        color5.removeAll(color);
        System.out.println(color5);

        //color2의 key 색상 제거
        color2.remove("Key");
        System.out.println(color2);




        enum CoffeType{
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        }


        for (CoffeType coffeType : CoffeType.values()) {
            System.out.println(coffeType);
        }

        int[] aa={1,2,3,4,5};
        for(int ii=0;ii<aa.length;ii++){
            System.out.println(aa[ii]);
        }
        for(int i2:aa){
            System.out.println(i2);
        }//iter

        //Generic 표기:기본자료형에래퍼클래스
        //final:변수메서드클래스
        //변수에사용되면:상수
        //메서드 : 하위클래스에서 재정의(overide)될수없다
        //클래스 : 자식을 만들 수 없다.
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(num);
        System.out.println(n+"");
        String s = ""+n;
        System.out.println(s.getClass().getName());

        String num3 ="123.456";
        double d = Double.parseDouble(num3);
        System.out.println(d);


        final ArrayList<String> a2 = new ArrayList<>(Arrays.asList("a","b"));
        a2.add("c");
        a2.add("d");
        final List<String> a3 = List.of("a","b"); //immutableCollection(불변형)
        try {
            a3.add("e");
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println(a3);



    }
}