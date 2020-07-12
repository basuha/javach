<#import "parts/common.ftl" as c>
<#import "parts/form.ftl" as f>

<@c.page>
<div>
    ${boardId}
</div>
    <@f.form true/>
    <#include "parts/thread-list.ftl"/>
</@c.page>