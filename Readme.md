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
3. application

User: application admin:
1. Application should maintain/store/display Screens Info ( screen name, location, city, state, country, seating capacity, layout)

User:  public users:
0. user should be able to self register/ create an account.(name, phno, email, address)
1. user must authenticate with username and password to do any designated tasks.
2. user should be able to reset password.
3. user can search screens
4. user can search movies
5. user can select movie/ screen then select show times.
6. user should be able to see seating arrangement and availability.
7. user should be able to select available seats for booking and see the total price for booking.
8. user shoud be able to select payment methods and complete the txn.
9. user should be able to recieve tkt booking confirmation via email.
10. user should be able to cancel the tkt.

database :

1. user-----(user_id, name, phno, email, address, created_by,create_date,modified_by,modified_date)
3. Screens--(screen_id, screen name, location, city, state, country, seating capacity,created_by,create_date,modified_by,modified_date)
4. movie----(movie_id,movie_title, duration,rating,release_date,audio_language,created_by,create_date,modified_by,modified_date)
5. showtime-(showtime_id,created_by,create_date,modified_by,modified_date)
6. seats----(,created_by,create_date,modified_by,modified_date)
7. payments-(,created_by,create_date,modified_by,modified_date)
8. txn------(,created_by,create_date,modified_by,modified_date)
9. bookings-(,created_by,create_date,modified_by,modified_date)
