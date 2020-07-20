<#import "parts/common.ftl" as c>
<@c.page>
    <div class="card card-body">
        <h1><span class="badge badge-secondary">Джавач</span></h1>
        <h1>Добро пожаловать. Снова.</h1>
        <#list boardList as b>
            <a href="/${b.id}">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">
                        <h4>
                    <span class="badge badge-secondary">
                        /${b.id}
                    </span>
                            ${b.description}
                        </h4>
                    </li>
                </ul>
            </a>
        <#else>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">No boards created</li>
            </ul>
        </#list>
    </div>
</@c.page>