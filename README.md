# FINAL PROJECT AUTOMATION WEB UI and API TEST

1. Test API dan UI terdapat dalam satu repository. 
2. Test cases menggunakan gerhin format dan cucumber sebagai library implementasi. 
3. Folder terpisah untuk setiap step definition maupun features dalam masing" API maupun UI.
4. Report cucumber untuk HTML dan JSON Format.
5. Github action workflow untuk menjalankan test setiap terdapat pull request ataupun manual

1. Repository yang digunakan
2. TestImplementation junit 5.8.1
3. TestRunTimeOnly junit 5.8.1
4. TestImplementation github bonigarcia webdrivermanager 5.3.2
5. TestImplementation seleniumhq selenium java 4.9.1
6. TestImplementation cucumber java 7.11.1
7. TestImplementation cucumber junit 7.11.1
8. TestImplementation rest-assured 5.3.0
9. Implementation json version 20230227
10. TestImplementation json schema validator 5.3.0
11. TestImplementation testng 7.7.1

~ Test WebUI menggunakan website https://www.demoblaze.com/
~ Test API menggunakan website https://dummyapi.io/docs
~ Cara menjalankan testnya dengan di terminal ketik ./gradlew cucumber_api -Ptags="@api" untuk api
dan ./gradlew cucumber_web -Ptags="@web"
