![](http://i.imgur.com/0XE6SbI.png)
**f-boardpro** is a multiple facebook account management app, it helps you to login to multiple facebook accounts from your iOS or Android device and do various facebook activities like post, like, comment, managing pages, groups and much more.

Features:
===========

> **Multi accounts manager:** You can manage your multiple facebook accounts and easily switch between accounts without logging in again and again ![](http://i.imgur.com/g33IHgB.png)
> **Home feeds:** You can check your all home feeds in this section, click on particuler feed to to get the list of comments.
 ![](http://i.imgur.com/EGNHTdi.png)

>**comments view:** You can see all the comments of particuler feed and click on like image to like the feed and click on people liked text to see the list of people who liked this feed ![](http://i.imgur.com/9cjlPE6.png)

>**people liked:** In this section you can see the list of people who liked this particuler feed. ![](http://i.imgur.com/6MVmndT.png)

>**My feeds:** In this section you can  able to see your profile timeline post. ![](http://i.imgur.com/YbXjVg6.png)

>**My friends:** In this section you can see your friends list who are all using this app. ![](http://i.imgur.com/DwBDh07.png)

>**pages:** in this section you will get the list of pages which you liked, click on any page to see the feeds of that particuler page. ![](http://i.imgur.com/PWVnrIq.png)

>**pages feeds:** In this section you will get the list of feeds by selected page ![](http://i.imgur.com/WRRRUuN.png)

>**Schedule:** In this section you can schedule a post by selecting image with a caption text and scheduling time and date.
![](http://i.imgur.com/2hlfjso.png)

>**Profile view:** In this section you will get all the basic details of the user like profile pic,name, email, work details,location, gender,place where he/she is from and list of photos he/she uploaded.
![](http://i.imgur.com/Ae5fJbl.png)



Installation guide for android:
============================

The easiest way to build is to install Android IDE, Once installed, then you can import the project into Android Studio:
1.	Open File
2.	Import Project
3.	Select fboardpro, Facebook library and android support library.
4.	Click OK.
 ![](http://i.imgur.com/mJCRabE.png)

 ![](http://i.imgur.com/RSqSYvq.png)
 
 After building the project while running on your device ,you might find that your device doesn't let you install your build if you already have the version from Google Play installed. This is standard Android security as it it won't let you directly replace an app that's been signed with a different key. Manually uninstall fboardpro from your device and you will then be able to install your own built version.
 
 
 5. After that configure facebook app id , Visit this link to know how to configure app id in facebook developer console.
              https://github.com/socioboard/f-board/wiki

Guide to create app in FaceBook developer console:
==================================================
1. Go to https://developers.facebook.com/
2. Click on My Apps then Add a New App  ![](http://i.imgur.com/5k0kxXl.png)
3. Click on "Android or Ios" ![](http://i.imgur.com/RXQm4eF.png)
4. Write app name and click on Create New Facebook AppId ![](http://i.imgur.com/zmQboXB.png)
5. Select "No" for Is this a test version of another app.? And Choose "Category" for app. ![](http://i.imgur.com/yJ7m6ql.png)
6. Click "My Apps"  and Select "See All Apps"
7. Select Created App ![](http://i.imgur.com/CrAjc3w.png)
8. Click on "Settings",  select the platforms "Android or iOS" and fill required details ![](http://i.imgur.com/ZruuKTm.png)
9. Copy the "App Id" and "App Secret" and paste it inside the string.xml in android application
   ![](http://i.imgur.com/YFhwJeu.png)
   
