package com.theironyard.davisUhlig;

import java.util.*;

/**
 * Created by duhlig on 7/27/17.
 */
public class EventLog {
    private List<Event> eventList;

//    public EventLog(List<Event> eventList) {
//        this.eventList = eventList;
//    }

    public EventLog (){
        eventList = new ArrayList<>();
    }

    public boolean addEvent(Event event){
        if (event == null || event.getAction() == null || event.getName() == null){
            throw new IllegalArgumentException("event is null");
        } else if (!event.getAction().equals("Face2Face") && !event.getAction().equals("PhoneCall") && !event.getAction().equals("TextMessaging") && !event.getAction().equals("Unknown")){
            throw new IllegalArgumentException("event action is not one of the options");
        }

        System.out.println(event.getAction());
        eventList.add(event);
        return true;
    }

    public int getNumEvents (){
        return eventList.size();
    }

}
