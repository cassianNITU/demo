The app uses Amazon Corretto\jdk17.0.5_8 you can download it from here
https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html

I have also added swagger dependency so you can use http://localhost:8080/swagger-ui/index.html as a client 

The app has to roles ADMIN and USER (only the Admin can use delete product endpoint)

I have created 2 users with the fallowing credentials
user: user
password: password 
role: USER

and 

user: admin
password: password
role: ADMIN

I have used chrome in incognito mode to test the application 
I hope the code is intuitive because I did not add many comments or documentation 
