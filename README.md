# ToDoAppBackEnd

Created a RESTfull web api using Spring Boot, Data and Web.

This repository contains the code for the Back-End of a ToDo web application. The front-end of the applications was created using Angular,
and can be found in the ToDoAppFrontEnd repository.

The main requirements for the REST api were that is should be able to store, retrieve and update items in a postgreSQL database
Also it should be able to handle http requests from the front-end.

I have deployed a slightly modified version of the api on heroku, you can find it at:

https://todolist-back-end-sema.herokuapp.com/api 

the frond-end ToDo application I originally created to consume this REST api can be found at: 

https://sema-todolist.herokuapp.com/

The deployed api makes use of the PostgreSQL database on the Heroku servers. To connect to this database the database url, username, 
and password must be obtained at runtime, because they are not static. Because both front- and back-end handle traffic over the HTTP protocol, CrossOrigin requests must be permitted. This is simple in Spring, because all we have to do is annotate our repositories with the @CrossOrigin annotation, and declare the origins from which we will allow cross origin requests. Not doing so will result in CORS-errors.
