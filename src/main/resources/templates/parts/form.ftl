<#macro form isNewThread>
<div class="input-group mb-3">
    <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroupFileAddon01">Upload</span>
    </div>
    <div class="custom-file">
        <input type="file" class="custom-file-input" id="inputGroupFile01" aria-describedby="inputGroupFileAddon01">
        <label class="custom-file-label" for="inputGroupFile01">Choose file</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
        <label class="form-check-label" for="inlineCheckbox1">SAGE</label>
    </div>
    <#if isNewThread>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
        <label class="form-check-label" for="inlineCheckbox2">Thread OP</label>
    </div>
    </#if>
</div>
</#macro>