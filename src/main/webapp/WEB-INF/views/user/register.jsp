<%@ include file="/WEB-INF/taglib.jsp"%>

<frm:form
        modelAttribute="userModel"
        action="/user/register"
        method="post"
        cssClass="form-horizontal"
>

    <fieldset>
        <legend>Reg Form</legend>
        <div class="form-group">
            <label class="col-md-4 control-label" for="textinput">Email</label>
            <div class="col-md-5">
                <frm:input path="email" name="textinput" cssClass="form-control input-md" />
            </div>
        </div>        <div class="form-group">
            <label class="col-md-4 control-label" for="textinput">Password</label>
            <div class="col-md-5">
                <frm:password path="password" name="textinput" cssClass="form-control input-md" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for=""></label>
            <div class="col-md-4">
                <button id="" name="" class="btn btn-warning">Register</button>
            </div>
        </div>

    </fieldset>
</frm:form>