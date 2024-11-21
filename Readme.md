Ticket booking


1. system should display/ maintain Screens info area (country, state, city, area) wise.
2. user should be able to select movie/Screen to check availability.
3. user should be able to view/ and select show times.
4. user should be able to see seating arrangements and select no of seats.
5. user should be able to do payment online for seleted seats.
6. user should get tkt booking confirmation.


who are the users of the application?
1. public users
2. application admin
3. application/system

User: application admin:
1. Application should maintain/store/display Screens Info ( screen name, location, city, state, country, seating capacity, layout)

User:  public users:
0. user should be able to self register/ create an account.(name, phno, email, address)
-->create a java code that takes User object as iinput and store in DB
1. user must authenticate with username and password to do any designated tasks.
-->create a java code that takes user_name and password as iinput and return success/fail
2. user should be able to reset password/change password.
-->
3. user can search Screens
-->
4. user can search movies

5. user can select movie/ screen then select show times.
6. user should be able to see seating arrangement and availability.
7. user should be able to select available seats for booking and see the total price for booking.
8. user shoud be able to select payment methods and complete the txn.
9. user should be able to recieve tkt booking confirmation via email.
10. user should be able to cancel the tkt.

movie_formate
movie_director
movie_zoner

database :

1. user-----(user_id,user_name, password, name, phno, email, address, created_by,create_date,modified_by,modified_date)
3. Screens--(screen_id, screen name, location, city, state, country, seating capacity,created_by,create_date,modified_by,modified_date)
4. movie----(movie_id,movie_title, duration,rating,release_date,audio_language,created_by,create_date,modified_by,modified_date)
5. showtime-(show_time_id, screen_id, show_time, is_active, current_movie_id,created_by,create_date,modified_by,modified_date)
6. seats----(,created_by,create_date,modified_by,modified_date)
8. txn------(,created_by,create_date,modified_by,modified_date)
9. bookings-(,created_by,create_date,modified_by,modified_date)


booking_id	booking_number 	user_id		movie_id	show_time_id	screen_id	seat_id		booking_staus_id
1			176543			101			1001		1				10			12			seats_selected, in-progress, cancelled, booking_success
2			176543			101			1001		1				10			13
3			176543			101			1001		1				10			14

ENUMS, lookup_tables

booking_statuses:
booking_staus_id	booking_staus_code	description					dispaly_name
1					SS					seats selected for booking	SELECTED	
2					C					booking cancelled			CANCELLED

txns:
txn_id		txn_date 	booking_number		txn_amt		txn_status	payment_method_id



100 seats
seat_id		screen_id	seat_number		
1
.
.
.100
	
	
	
1000 screens x 4 shows=> 4000
screen_show_times:

show_time_id	screen_id	show_time	is_active 	current_movie_id
1				1			10-1		Y			10
2				1			2-5			Y			14
3				1			6-9			Y			19
4				1			10-1		Y
5				1			6-9			N
6				1			9-1			Y
7				1			2-6			Y
8				1			7-11		Y
9				2			10-1		Y
10				2			2-5			Y
11				2			6-9			Y
12				2			10-1		Y






1. login
2. availability of seats
3. dates
4. confirmation of the payment
5. different time slots (show times)
6. movie ratings
7. movie theater locations
8. seating arrangements for tkt booking
9. checking up coming movies
10. same seat cannot be booked by multiple persons for same show.
11. classification of seats and prices.
12. tkt confirmation after tkt booking.
13. movie format.


