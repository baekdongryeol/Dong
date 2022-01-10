<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** EL Scope & Attribute **</title>
<%
// 1) 동일 속성(Attribute)명을 모든 영역에 정의
// => 호출, 우선순위 
	pageContext.setAttribute("name", "pageContext Value");
	request.setAttribute("name", "request Value");
	session.setAttribute("name", "session Value");     
	application.setAttribute("name", "application Value");
// 2) 서로 다른 속성(Attribute)명을 모든 영역에 정의	
	pageContext.setAttribute("pname", "pageContext Value");
	request.setAttribute("rname", "request Value");
	session.setAttribute("sname", "session Value");     
	application.setAttribute("aname", "application Value");	
// 3) 연산자 Test
// => request 영역에 속성(Attribute) 2개 만들고 활용 Test 
	request.setAttribute("num1",123);
	request.setAttribute("num2",456);
%>
</head>
<body>
<pre><h3>
** EL Scope & Attribute **	
1) 동일 속성(Attribute)명 모든 영역에 정의
	=> 호출, 우선순위 
	=> el 내부에 변수명이 오면 속성(Attribute) 의 이름으로 인식
\${name} => ${name}
=> 좁은 범위부터 넓은 범위로 적용됨 
=> EL에 속성의 이름을 적용하면 해당 속성의 값이 출력됨 
=> 모두 구별하여 출력 하려면 해당되는 영역을 속성명 앞에 붙여서 적용
	(앞의 객체명이 생략 된것임) 

\${page_name} => ${pageScope.name}
\${request_name} => ${requestScope.name}
\${session_name} => ${sessionScope.name}
\${application_name} => ${applicationScope.name}
----------------------------------------------
2) 서로 다른 속성(Attribute)명을 모든 영역에 정의
=> 속성명만 사용해서 출력가능
\${pname} => ${pname}
\${rname} => ${rname}
\${sname} => ${sname}
\${aname} => ${aname}
----------------------------------------------
3) 연산자 Test
=> request 영역에 속성(Attribute) 2개 만들고 활용 Test	
3.1) Java 스크립트릿
<%	int num1 = (Integer)request.getAttribute("num1"); 
	// getAttribute(..) -> return Object -> 형변환가능
	int num2 = (Integer)request.getAttribute("num2"); 
%>
<%=num1%>+<%=num2%> = <%=num1+num2%>

3.2) EL
=> EL : 영역객체 생략하고 속성명 바로 사용가능, 형변환없이 연산가능.
=> 표현식의 {} 안에 변수명이 오면 이는 속성(setAttribute 로 정의된) 이름으로 인식 
${requestScope.num1}+${num2} = ${num1+num2} <br>

3.3) Parameter_Java
<% 	num1 = Integer.parseInt(request.getParameter("num1")); 
	// getParameter(..) -> return String -> Integer.parseInt...
	num2 = Integer.parseInt(request.getParameter("num2"));		
%>
<%=num1%>+<%=num2%> = <%=num1+num2%>

3.3) Parameter_EL
${param.num1}+${param.num2} = ${param.num1+param.num2} <br> 

</h3></pre>
</body>
</html>