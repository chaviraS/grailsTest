import mygym.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_myGym_member_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: memberInstance, field: 'noSocio', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("member.noSocio.label"),'default':("No Socio")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("noSocio"),'required':(""),'value':(memberInstance?.noSocio)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'nombre', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("member.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("nombre"),'required':(""),'value':(memberInstance?.nombre)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'apellidoP', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("member.apellidoP.label"),'default':("Apellido P")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("apellidoP"),'required':(""),'value':(memberInstance?.apellidoP)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'apellidoM', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("member.apellidoM.label"),'default':("Apellido M")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("apellidoM"),'required':(""),'value':(memberInstance?.apellidoM)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'sexo', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("member.sexo.label"),'default':("Sexo")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['name':("sexo"),'from':(memberInstance.constraints.sexo.inList),'required':(""),'value':(memberInstance?.sexo),'valueMessagePrefix':("member.sexo")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'telefono', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("member.telefono.label"),'default':("Telefono")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("telefono"),'required':(""),'value':(memberInstance?.telefono)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'celular', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("member.celular.label"),'default':("Celular")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("celular"),'required':(""),'value':(memberInstance?.celular)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'direccion', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("member.direccion.label"),'default':("Direccion")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("direccion"),'required':(""),'value':(memberInstance?.direccion)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'email', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("member.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("email"),'required':(""),'value':(memberInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberInstance, field: 'cumpleanos', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("member.cumpleanos.label"),'default':("Cumpleanos")],-1)
printHtmlPart(2)
invokeTag('textField','g',91,['name':("cumpleanos"),'required':(""),'value':(memberInstance?.cumpleanos)],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409088457059L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
