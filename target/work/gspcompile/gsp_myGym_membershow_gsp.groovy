import mygym.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_myGym_membershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'member.label', default: 'Member'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (memberInstance?.noSocio)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("member.noSocio.label"),'default':("No Socio")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(memberInstance),'field':("noSocio")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.nombre)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("member.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(memberInstance),'field':("nombre")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.apellidoP)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("member.apellidoP.label"),'default':("Apellido P")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(memberInstance),'field':("apellidoP")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.apellidoM)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("member.apellidoM.label"),'default':("Apellido M")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(memberInstance),'field':("apellidoM")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.sexo)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("member.sexo.label"),'default':("Sexo")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(memberInstance),'field':("sexo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.telefono)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("member.telefono.label"),'default':("Telefono")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(memberInstance),'field':("telefono")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.celular)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("member.celular.label"),'default':("Celular")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(memberInstance),'field':("celular")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.direccion)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("member.direccion.label"),'default':("Direccion")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(memberInstance),'field':("direccion")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.email)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("member.email.label"),'default':("Email")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(memberInstance),'field':("email")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (memberInstance?.cumpleanos)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("member.cumpleanos.label"),'default':("Cumpleanos")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(memberInstance),'field':("cumpleanos")],-1)
printHtmlPart(16)
}
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
createTagBody(3, {->
invokeTag('message','g',119,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',119,['class':("edit"),'action':("edit"),'resource':(memberInstance)],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',120,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',122,['url':([resource:memberInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',124,[:],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409088450637L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
