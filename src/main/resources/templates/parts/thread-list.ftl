<div class="card-columns">
    <#list threadList as t>
        <#if m.filename??>
            <img src="/img/${m.filename}" class="card-img-top">
        </#if>
        <div class="m-2">
            <span>${m.text}</span>
            <i>${m.tag}</i>
        </div>
        <div class="card-footer text-muted">
            ${m.authorName}
        </div>
    <#else>
        No message
    </#list>
</div>