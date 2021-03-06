/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.paris10.miage.dslLogs.Utilisateur
import fr.paris10.miage.dslLogs.Log
import java.util.List
import fr.paris10.miage.dslLogs.Demande
import fr.paris10.miage.dslLogs.Appel
import fr.paris10.miage.dslLogs.Action
import fr.paris10.miage.dslLogs.Parametre

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslLogsGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))

		//Permet de r�cup�rer notre model
		//val model = resource.allContents.filter(typeof(Model)).toList.get(0);
		
		//Permet de r�cup�rer nos utilisateurs
		val users = resource.allContents.filter(typeof(Utilisateur)).toSet;
		
		//Permet de r�cup�rer tout nos logs
		val logs = resource.allContents.filter(typeof(Log)).toList;
		
		fsa.generateFile("index.html", genererHTML("Logs", genererIndex(resource)))
		
		for(Utilisateur user : users) {
			fsa.generateFile(user.name + ".html", genererHTML(user.name, templateImage(genererLogs(user, logs))));
		}
	}
	
	//Template de nos pages html
	def genererHTML(String titre, String contents) '''
	<HTML>
	<HEAD>
	<script type="text/javascript" src=jquery.js"></script>
	<script type="text/javascript" src=jquery_plantuml.js"></script>
	<TITLE>�titre�</TITLE>
	</HEAD>
	<BODY>
	�contents�
	</BODY>
	</HTML>
	'''
	
	// Si on fait un toSet il faut s'assurer que la m�thodes equals est bien d�finie pour 
	// le type d'objet que l'on veut r�cup�rer (ici c'est un String donc c'est ok).
	// On aurait pu utiliser distinct().
	def genererIndex(Resource resource) {
		return ''' <ul>
		�resource.allContents
			.filter(typeof(Utilisateur))
			.map[name].toSet //sinon on recupere plusieurs fois les m�mes utilisateurs
			.map[genererListe]
			.join('\n')
		�
		</ul>
		'''
	}
	
	/*def genererIndex(Set<String> users) {
		'''
			<ul>
			�FOR user : users�
			<li><a href="�user�.html">�user�</a></li>
			�ENDFOR�
			</ul>
		'''
	}*/
	
	def templateImage(String content) {
		return '''
		<img uml="@startuml
		skinparam sequence {
			ArrowColor Black
			ActorBorderColor Black
			LifeLineBorderColor Black
			LifeLineBackgroundColor Black
			ParticipantBorderColor Black
			ParticipantBackgroundColor White
			ParticipantFontColor Black
		}
		�content�
		'''
	}
	
	def genererListe(String name) {
		return '''<li><a href="�name�.html">�name�</a></li> '''
	}
	
	def genererLogs(Utilisateur user, List<Log> logs) {
	return '''
		�FOR log : logs�
			�genererAction(log.action, user, true)�
			hello
		�ENDFOR�
		'''
		}
		
		/*�IF user.name.equals(log.utilisateur.name)�
		  �ENDIF�*/
	
	//En fonction du type d'action on va appeler demande ou appel
	def genererAction(Action action, Utilisateur user, boolean ok) {
		if(action instanceof Demande) {
			return genererAction(action as Demande, user, ok); // Le as correspond � un cast
		} else if (action instanceof Appel) {
			return genererAction(action as Appel, user, ok);
		}
	}
	
	def genererAction(Demande demande, Utilisateur user, boolean ok) '''
		�user.name� -> SYSTEM : GET �demande.page�
		�IF ok�
		SYSTEM -[#00AA00] -> �user.name� : page
		�ELSE�
		SYSTEM -[#AA0000] -> �user.name� : erreur
		�ENDIF�
		'''
		
	def genererParametre(Parametre param) '''
		�param.name�=�param.value�
	'''
		
	def genererAction(Appel appel, Utilisateur user, boolean ok) '''
		�user.name� -> SYSTEM : POST �appel.page�(�appel.parametres.map[genererParametre].join(', ')�)
		�IF ok�
		SYSTEM -[#00AA00] -> �user.name� : page
		�ELSE�
		SYSTEM -[#AA0000] -> �user.name� : erreur
		�ENDIF�
		'''
}
