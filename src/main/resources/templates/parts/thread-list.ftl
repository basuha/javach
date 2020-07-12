<div class="card-columns">
    <#list threadList as t>
        <#if t.filename??>
            <img src="/img/${t.filename}" class="card-img-top">
        </#if>
        <div class="m-2">
            <span>${t.text}</span>
            <i>${t.date}</i>
        </div>
        <div class="card-footer text-muted">
            ${t.author}
        </div>
    <#else>
        No message
    </#list>
</div>