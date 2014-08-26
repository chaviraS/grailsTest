import mygym.MemberHealth
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_myGym_memberHealth_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/memberHealth/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'alergico', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("memberHealth.alergico.label"),'default':("Alergico")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("alergico"),'required':(""),'value':(memberHealthInstance?.alergico)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'cardiologia', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("memberHealth.cardiologia.label"),'default':("Cardiologia")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("cardiologia"),'required':(""),'value':(memberHealthInstance?.cardiologia)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'contactoEmergencia', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("memberHealth.contactoEmergencia.label"),'default':("Contacto Emergencia")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("contactoEmergencia"),'required':(""),'value':(memberHealthInstance?.contactoEmergencia)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'enfermedades', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("memberHealth.enfermedades.label"),'default':("Enfermedades")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("enfermedades"),'required':(""),'value':(memberHealthInstance?.enfermedades)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'medicado', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("memberHealth.medicado.label"),'default':("Medicado")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("medicado"),'required':(""),'value':(memberHealthInstance?.medicado)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'member', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("memberHealth.member.label"),'default':("Member")],-1)
printHtmlPart(2)
invokeTag('select','g',55,['id':("member"),'name':("member.id"),'from':(mygym.Member.list()),'optionKey':("id"),'optionValue':("apellidoP"),'required':(""),'value':(memberHealthInstance?.member?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'operaciones', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("memberHealth.operaciones.label"),'default':("Operaciones")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("operaciones"),'required':(""),'value':(memberHealthInstance?.operaciones)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'respiratorias', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("memberHealth.respiratorias.label"),'default':("Respiratorias")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("respiratorias"),'required':(""),'value':(memberHealthInstance?.respiratorias)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: memberHealthInstance, field: 'tipoSangre', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("memberHealth.tipoSangre.label"),'default':("Tipo Sangre")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("tipoSangre"),'required':(""),'value':(memberHealthInstance?.tipoSangre)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409082172479L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
