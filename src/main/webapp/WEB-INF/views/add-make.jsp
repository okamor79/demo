<%@ include file="/WEB-INF/taglib.jsp"%>

<frm:form
        modelAttribute="carMake"
        action="/add/make"
        method="post"
        cssClass="form-horizontal"
>

    <fieldset>
        <legend>Add Make</legend>
        <div class="form-group">
            <label class="col-md-4 control-label" for="textinput">Make name</label>
            <div class="col-md-5">
                <frm:input path="name" name="textinput" cssClass="form-control input-md" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for=""></label>
            <div class="col-md-4">
                <button id="" name="" class="btn btn-warning">Add Make</button>
            </div>
        </div>

    </fieldset>
</frm:form>