<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>S2I Tomcat JDK17 OM</title>
    <link rel="stylesheet" href="resource/styles.css">
</head>
<body>
    
    <div class="container">
        <h1>Hello, OM! 👋</h1>
        <p>이 페이지는 Tomcat JDK17 S2I 빌드를 통해 생성되었습니다.</p>
        <h2>이름을 입력하세요</h2>
        <form action="api" method="post">
            <input type="text" name="name" placeholder="이름">
            <button type="submit">인사하기</button>
        </form>
    </div>
</body>
</html>
