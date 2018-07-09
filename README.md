# NYTimesPopularArticles
This app is small demo of mvp and retrofit. This app calls web api of New York Times Most
popular articles and display them in list. You will need a security key to call api. For this 
sign up account at their website and request them to generate key. App is using third party libray retrofit. 
You will need to add dependensies if you want to make this app functional.

compile'com.squareup.retrofit2:retrofit:2.3.0'
compile 'com.squareup.retrofit2:converter-gson:2.1.0'

It is an open source library which simplifies HTTP communication by turning remote APIs into declarative, type-safe interfaces. 
It makes it relatively easy to retrieve and upload JSON (or other structured data) via a REST based webservices.

MVP is inherited from MVC which allows low coupling between presentor and view. We can perform unit testing easily by implementing mvp.

