package com.codewars.katas.kyu4;

import java.util.HashMap;
import java.util.Map;

/**
 * <strong>Kata</strong> <a href="https://www.codewars.com/kata/54acc128329e634e9a000362/train/java">A Simplistic TCP Finite State Machine (FSM)</a>
 * @author bruizv
 *
 */
public class TCP {
	
	public enum TCPState {
		CLOSED, LISTEN, SYN_SENT, SYN_RCVD, ESTABLISHED, CLOSE_WAIT, LAST_ACK, FIN_WAIT_1, FIN_WAIT_2, CLOSING, TIME_WAIT, ERROR;
	};
	
	public enum TCPEvent {
		APP_PASSIVE_OPEN, APP_ACTIVE_OPEN, APP_SEND, APP_CLOSE, APP_TIMEOUT, RCV_SYN, RCV_ACK, RCV_SYN_ACK, RCV_FIN, RCV_FIN_ACK;
	};
	
	private static final Map<String, TCPState> stateMachine = new HashMap<>();
	
	static {
		stateMachine.put(getStateEventKey(TCPState.CLOSED,		TCPEvent.APP_PASSIVE_OPEN),	TCPState.LISTEN);
		stateMachine.put(getStateEventKey(TCPState.CLOSED,		TCPEvent.APP_ACTIVE_OPEN),	TCPState.SYN_SENT);
		stateMachine.put(getStateEventKey(TCPState.LISTEN,		TCPEvent.RCV_SYN),			TCPState.SYN_RCVD);
		stateMachine.put(getStateEventKey(TCPState.LISTEN,		TCPEvent.APP_SEND),			TCPState.SYN_SENT);
		stateMachine.put(getStateEventKey(TCPState.LISTEN,		TCPEvent.APP_CLOSE),		TCPState.CLOSED);
		stateMachine.put(getStateEventKey(TCPState.SYN_RCVD,	TCPEvent.APP_CLOSE),		TCPState.FIN_WAIT_1);
		stateMachine.put(getStateEventKey(TCPState.SYN_RCVD,	TCPEvent.RCV_ACK),			TCPState.ESTABLISHED);
		stateMachine.put(getStateEventKey(TCPState.SYN_SENT,	TCPEvent.RCV_SYN),			TCPState.SYN_RCVD);
		stateMachine.put(getStateEventKey(TCPState.SYN_SENT,	TCPEvent.RCV_SYN_ACK),		TCPState.ESTABLISHED);
		stateMachine.put(getStateEventKey(TCPState.SYN_SENT,	TCPEvent.APP_CLOSE),		TCPState.CLOSED);
		stateMachine.put(getStateEventKey(TCPState.ESTABLISHED,	TCPEvent.APP_CLOSE),		TCPState.FIN_WAIT_1);
		stateMachine.put(getStateEventKey(TCPState.ESTABLISHED,	TCPEvent.RCV_FIN),			TCPState.CLOSE_WAIT);
		stateMachine.put(getStateEventKey(TCPState.FIN_WAIT_1,	TCPEvent.RCV_FIN),			TCPState.CLOSING);
		stateMachine.put(getStateEventKey(TCPState.FIN_WAIT_1,	TCPEvent.RCV_FIN_ACK),		TCPState.TIME_WAIT);
		stateMachine.put(getStateEventKey(TCPState.FIN_WAIT_1,	TCPEvent.RCV_ACK),			TCPState.FIN_WAIT_2);
		stateMachine.put(getStateEventKey(TCPState.CLOSING,		TCPEvent.RCV_ACK),			TCPState.TIME_WAIT);
		stateMachine.put(getStateEventKey(TCPState.FIN_WAIT_2,	TCPEvent.RCV_FIN),			TCPState.TIME_WAIT);
		stateMachine.put(getStateEventKey(TCPState.TIME_WAIT,	TCPEvent.APP_TIMEOUT),		TCPState.CLOSED);
		stateMachine.put(getStateEventKey(TCPState.CLOSE_WAIT,	TCPEvent.APP_CLOSE),		TCPState.LAST_ACK);
		stateMachine.put(getStateEventKey(TCPState.LAST_ACK,	TCPEvent.RCV_ACK),			TCPState.CLOSED);
	}
	
    public static String traverseStates(String[] events) {

        TCPState state = TCPState.CLOSED; // Initial state, always
        
        for(String eventStr : events) {
        	TCPEvent event = TCPEvent.valueOf(eventStr);
        	state = stateMachine.getOrDefault(getStateEventKey(state, event), TCPState.ERROR);
        	
        	if(state == TCPState.ERROR) {
        		return TCPState.ERROR.name();
        	}
        }
        
        return state.name();
    }
    
    private static String getStateEventKey(TCPState state, TCPEvent event) {
    	return state.name() + ":" + event.name();
    }
}
