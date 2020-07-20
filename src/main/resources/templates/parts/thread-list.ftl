<div class="card" xmlns="http://www.w3.org/1999/html">
    <#list threadList as t>
    <#--        <#if t.filename??>-->
    <#--            <img src="/img/${t.filename}" class="card-img-top">-->
    <#--        </#if>-->
    <div class="card card-body">
        <div class="card-footer text-muted">
            ${t.author}
        </div>
        <img class="card-img" src="https://www.imgonline.com.ua/examples/bee-on-daisy.jpg"  alt="234234">
        <div class="m-2">
            <span>${t.text}</span>
        </div>
    </div>

    <#else>
        No message
    </#list>
</div>