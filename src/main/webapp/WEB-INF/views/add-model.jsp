<%@ include file="/WEB-INF/taglib.jsp"%>

<frm:form
        modelAttribute="carModel"
        action="/add/model"
        method="post"
        cssClass="form-horizontal"
>
    <fieldset>
    <legend>Add Make</legend>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Model name</label>
        <div class="col-md-5">
            <frm:input path="name" name="textinput" cssClass="form-control input-md" />
        </div>
    </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="textinput">Model year</label>
            <div class="col-md-5">
                <frm:input path="year" name="textinput" cssClass="form-control input-md" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="selectbasic">Select make</label>
            <div class="col-md-5">
                <frm:select path="make" cssClass="form-control" >
                    <frm:options items="${makeList}" itemLabel="name"></frm:options>
                </frm:select>
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="selectbasic">Select fuel type</label>
            <div class="col-md-5">
                <frm:radiobuttons path="fuelType" items="${fuelTypeList}" cssClass="form-control" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="selectbasic">Select body type</label>
            <div class="col-md-5">
                <frm:select path="bodyType" cssClass="form-control" >
                    <frm:options items="${bodyTypeList}"></frm:options>
                </frm:select>
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
