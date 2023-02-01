# SpringMVC Contact Project
* REST API Project
* view 가 없는 API Project
* mysql, mybatis 를 연동한 DB Project

##
* ```jdbc:mysql://localhost:3306/mydb``` 와 연동하여 table에 저장된 데이터 가져오기
* ```tbl_contact```
```
	String uid // varchar()
	String name // varchar()
	String tel // varchar()
	String addr // varchar()
	String hobby // varchar()
```
* `ContactDto`, `ContactDao`, `ContactService`,`ContactController` 클래스 작성
* ```http://localhost:8080/contact/``` 로 요청하면 `tbl_contact` table 에 저장된 데이터를 JSON 으로 보여주기	
