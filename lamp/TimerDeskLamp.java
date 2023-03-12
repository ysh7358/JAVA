package dktlamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * 전원 끄기 예약이 가능한 책상 조명
 */
public class TimerDeskLamp extends DeskLamp {

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // 전원 끄기 예약 쓰레드

    // TODO - TimerDeskLamp 클래스의 나머지 코드를 구현해 주세요.

}
