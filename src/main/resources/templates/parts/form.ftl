<#macro form isThread>
    <p class="mx-auto" style="width: 20%;">
        <a data-toggle="collapse" href="#messageForm" role="button" aria-expanded="false" aria-controls="messageForm">
            Create thread
        </a>
    </p>
    <div class="collapse mx-auto" style="width: 50%;" id="messageForm">
        <div class="card card-body">
            <div class="form-group">
                <input type="email" class="form-control" id="nameField" value="Anonymous">
            </div>
            <div class="form-group">
                <textarea class="form-control" id="messageField" rows="10" placeholder="Message here"></textarea>
            </div>
            <div class="custom-file">
                <input type="file" class="custom-file-input" id="inputFile" aria-describedby="inputGroupFileAddon01">
                <label class="custom-file-label" for="inputFile">Choose file</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="sageCheckbox" value="option1">
                <label class="form-check-label" for="sageCheckbox">SAGE</label>
            </div>
            <#if isThread>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="opCheckbox" value="option2">
                    <label class="form-check-label" for="opCheckbox">Thread OP</label>
                </div>
            </#if>
            <button style="width: 200px;" class="btn mx-auto btn-primary" type="submit">Submit</button>
        </div>
    </div>
</#macro>