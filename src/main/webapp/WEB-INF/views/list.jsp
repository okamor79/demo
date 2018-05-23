<%@ include file="/WEB-INF/taglib.jsp"%>

<table class="table table-bordered table-sm">

    <thead>
    <th>ID</th>
    <th>Make</th>
    <th>Model</th>
    <th>Year</th>
    <th>Fuel Type</th>
    <th>Body Type</th>
    </thead>

    <tbody>

    <c:forEach items="${allData}" var="make">
        <tr >
            <td rowspan=""> ${make.id}</td>
            <td> ${make.name}</td>

            <c:forEach items="${make.models}" var="model" >
                <td>${model.name}</td>
                <td>${model.year}</td>
                <td>${model.fuelType}</td>
                <td>${model.bodyType}</td>

            </c:forEach>

        </tr>

    </c:forEach>

    </tbody>
</table>