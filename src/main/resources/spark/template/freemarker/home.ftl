<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
    <title>${title} | Web Checkers</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="page">

    <h1>Web Checkers</h1>

    <div class="navigation">
        <a class="logoutLink" href="/logout">Logout</a>
    </div>

    <div class="body">
        <p>${welcomeMessage}</p>
        <span>Challenge Current Players:</span>
        <#list currentPlayers as player>
            <div class="challengePlayer">
                <form action="/challenge" method="POST">
                    <input type="submit" name="playerName" value="${player.userName}">
                </form>
            </div>
        </#list>
        <#if challengeError>
            <span class="errorMessage">${challengeMessage}</span>
        </#if>
    </div>

</div>
</body>
</html>
