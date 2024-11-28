package com.sat.tktbooking;

public class Movie {
	private String screenName;
	private String movieTitle;
	private String showTime;
	private String location; 

	public Movie(String movie_title, String screen_name, String show_time, String location) {
		this.movieTitle = movie_title;
		this.screenName = screen_name;
		this.showTime = show_time;
		this.location = location;
	}
	
	public String getScreenName() {
		return screenName;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public String getShowTime() {
		return showTime;
	}

	public String getLocation() { 
        return location; 
    }
}