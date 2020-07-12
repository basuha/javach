<#import "parts/common.ftl" as c>
<#import "parts/form.ftl" as f>
<#import "parts/javach-thread.ftl" as t>

<@c.page>
<div>
    Hello world
</div>
    <@f.form true/>
    <#include "parts/thread-list.ftl"/>
</@c.page>