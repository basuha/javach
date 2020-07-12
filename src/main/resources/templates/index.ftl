<#import "parts/common.ftl" as c>
<@c.page>
    <div class="card card-body">
        <h1><span class="badge badge-secondary">Джавач</span></h1>
        <h1>Добро пожаловать</h1>
        <#list boardList as b>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">b.id</li>
                <li class="list-group-item">b.description</li>
            </ul>
        <#else>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">No boards created</li>
            </ul>
        </#list>
    </div>
</@c.page>