<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
    <title>${title} | Web Checkers</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="page">

    <h1>Login to Web Checkers</h1>

    <div class="body">
        <form class="loginForm" action="/home" method="POST">
            <span>Enter a user name:</span>
            <input name="userName"/>
            <button class="loginButton" type="submit">Login</button>
        </form>
        <#if failedLogin>
           <span class="errorMessage">${failedLoginMessage}</span>
        </#if>
    </div>

</div>
</body>
</html>