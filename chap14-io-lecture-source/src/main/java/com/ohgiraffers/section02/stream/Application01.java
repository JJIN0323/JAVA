package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application01 { // InputStream
    public static void main(String[] args) {

        /* 수업목표. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 inputStream 에 대해 알 수 있다. */

        /* 필기.
        *   입출력 스트림 개요
        *   - 프로젝트를 생성하거나 프로그래밍을 할 때 많은 종류의 데이터를 다뤄야한다.
        *     하지만 데이터는 프로그램 내부에 있을 수도 있지만, 프로그램 외부에서 데이터를 가져와
        *     사용 할 때도 있다.
        *     또한, 프로그램에서 만든 데이터를 외부 파일로 출력할 경우도 존재한다. */

        /* 필기.
        *   외부 데이터란, 프로그램 외부에 존재하는 모든 데이터를 의미한다.
        *   하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존쟈ㅐ하는 자원이 될 수도 있다.
        *   따라서 해당하는 데이터를 가져오거나 내보낼 때 가장 먼저 해야 할 일은
        *   ★자바 프로그램과 외부 데이터를 연결하는 것이다.★ 중요X100
        *   연결하는 길을 스트림(Stream : 단반향)이라고 한다.
        *   스트림은 단방향 이다.
        *   즉, 데이터를 읽어오기 위한 통로는 입력 스트림
        *   데이터를 내보내기 위한 통로는 출력 스트림이라고 한다.
        *
        *   그 중 InputStream 과  Reader 는 데이터를 읽어오기 위한 스트림이고
        *   OutputStream 과 Writer 는 데이터를 출력하기 위한 스트림이다. */

        // 파일을 읽어오는 객체
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            // read() : 파일에 기록된 값을 순차적으로 읽어오고 더이상 읽을 데이터가 없으면
            //           -1 값을 반환한다.
            int value;

            // 한글 1글자는 3byte 이기 때문에 1byte 씩 읽어오면 글자가 깨진다.
            while((value = fis.read()) != -1) { // 읽을 데이터가 있으면 반복문 실행
                System.out.println("value = " + value);
                System.out.println("carValue = " + (char)value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            /* 필기.
            *   finally ->  try/catch 블럭에서 오류를 잡더라도
            *   무조건 실행되는 영역
            *   finally 블럭에서, 그동안 사용한 자원을 닫아준다. */

            // 통로가 만들어 졌다면?
            if (fis != null){
                /* 필기.
                *   사용한 연결 통로를 닫아주는 메서드
                *   close();
                *   1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우
                *      리소스에서 메모리 누수(leak)가 발생하게 된다.
                *   2. close()는 반드시 마지막에 작성해야 한다.
                *   3. close()도 throw 를 하기 때문에 try/catch 가 필요하다. */
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
