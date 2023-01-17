package com.codewars.katas.kyu4;

import java.util.Stack;

public class TimeFormatter {
	
	private static final String NOW = "now";
	private static final String SEPARATOR_AND = " and ";
	private static final String SEPARATOR_COMMA = ", ";
	private static final String ONE_SECOND = "1 second";
	private static final String SECONDS_FORMAT = "%d seconds";
	private static final String ONE_MINUTE = "1 minute";
	private static final String MINUTES_FORMAT = "%d minutes";
	private static final String ONE_HOUR = "1 hour";
	private static final String HOURS_FORMAT = "%d hours";
	private static final String ONE_DAY = "1 day";
	private static final String DAYS_FORMAT = "%d days";
	private static final String ONE_YEAR = "1 year";
	private static final String YEARS_FORMAT = "%d years";
	
    public static String formatDuration(int seconds) {
        
    	if(seconds == 0) {
        	return NOW;
        }
    	
    	Stack<String> humanReadableValues = new Stack<>();
    	
    	// SECONDS EVALUATION
    	int minutes = seconds / 60;
    	int remainingSeconds = seconds % 60;
    	
	    if(remainingSeconds == 1) {
	    	humanReadableValues.add(ONE_SECOND);
	    } else if(remainingSeconds > 1) {
	    	humanReadableValues.add(String.format(SECONDS_FORMAT, remainingSeconds));
	    }

    	if(minutes == 0) {
    		return TimeFormatter.format(humanReadableValues);
    	}
    	
    	// MINUTES EVALUATION
    	int hours = minutes / 60;
    	int remainingMinutes = minutes % 60;
    	
    	if(remainingMinutes == 1) {
    		humanReadableValues.add(ONE_MINUTE);
    	} else if(remainingMinutes > 1) {
    		humanReadableValues.add(String.format(MINUTES_FORMAT, remainingMinutes));
    	}
    	
    	if(hours == 0) {
    		return TimeFormatter.format(humanReadableValues);
    	}
    	
    	// HOURS EVALUATION
    	int days = hours / 24;
    	int remainingHours = hours % 24;
    	
    	if(remainingHours == 1) {
    		humanReadableValues.add(ONE_HOUR);
    	} else if(remainingHours > 1) {
    		humanReadableValues.add(String.format(HOURS_FORMAT, remainingHours));
    	}
    	
    	if(days == 0) {
    		return TimeFormatter.format(humanReadableValues);
    	}

    	// YEARS EVALUATION
    	int years = days / 365;
    	int remainingDays = days % 365;
    	
    	if(remainingDays == 1) {
    		humanReadableValues.add(ONE_DAY);
    	} else if(remainingDays > 1) {
    		humanReadableValues.add(String.format(DAYS_FORMAT, remainingDays));
    	}
    	
    	if(years == 0) {
    		return TimeFormatter.format(humanReadableValues);
    	}
    	
    	if(years == 1) {
    		humanReadableValues.add(ONE_YEAR);
    	} else if(years > 1) {
    		humanReadableValues.add(String.format(YEARS_FORMAT, years));
    	}
    	
    	return TimeFormatter.format(humanReadableValues);
    }

    
    private static String format(Stack<String> parts) {
    	
    	StringBuilder formatBuilder = new StringBuilder();

    	while(!parts.isEmpty()) {
    		
    		formatBuilder.append(parts.pop());
    		
    		if(parts.size() == 1) {
    			formatBuilder.append(SEPARATOR_AND);
    		} else if(parts.size() > 1) {
    			formatBuilder.append(SEPARATOR_COMMA);
    		}
    		
    	}
    	
    	return formatBuilder.toString();
    	
    }
}
