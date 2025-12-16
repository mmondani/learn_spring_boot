<%@ taglib prefix="c" uri="jakarta.tags.core" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
            rel="stylesheet"
        />
        <title>Add ToDo Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Enter Todo details</h1>
            <form:form method="post" modelAttribute="todo">
                Description:
                <form:input
                    type="text"
                    name="description"
                    path="description"
                    required="required"
                />
                <form:errors path="description" cssClass="text-warning" />
                <form:input type="hidden" path="id" />
                <form:input type="hidden" path="done" />
                <input type="submit" class="btn btn-success" />
            </form:form>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>
