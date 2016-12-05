/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.generator;

import com.google.common.collect.Iterators;
import fr.paris10.miage.dslLogs.Utilisateur;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DslLogsGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Utilisateur> _filter = Iterators.<Utilisateur>filter(_allContents, Utilisateur.class);
    final Set<Utilisateur> users = IteratorExtensions.<Utilisateur>toSet(_filter);
    String _genererIndex = this.genererIndex(resource);
    CharSequence _genererHTML = this.genererHTML("Logs", _genererIndex);
    fsa.generateFile("index.html", _genererHTML);
    for (final Utilisateur user : users) {
      String _name = user.getName();
      String _plus = (_name + ".html");
      String _name_1 = user.getName();
      CharSequence _genererHTML_1 = this.genererHTML(_name_1, null);
      fsa.generateFile(_plus, _genererHTML_1);
    }
  }
  
  public CharSequence genererHTML(final String titre, final String contents) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HTML>");
    _builder.newLine();
    _builder.append("<HEAD>");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\" src=jquery.js\"></script>");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\" src=jquery_plantuml.js\"></script>");
    _builder.newLine();
    _builder.append("<TITLE>");
    _builder.append(titre, "");
    _builder.append("</TITLE>");
    _builder.newLineIfNotEmpty();
    _builder.append("</HEAD>");
    _builder.newLine();
    _builder.append("<BODY>");
    _builder.newLine();
    _builder.append(contents, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</BODY>");
    _builder.newLine();
    _builder.append("</HTML>");
    _builder.newLine();
    return _builder;
  }
  
  public String genererIndex(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t\t");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Utilisateur> _filter = Iterators.<Utilisateur>filter(_allContents, Utilisateur.class);
    final Function1<Utilisateur, String> _function = (Utilisateur it) -> {
      return it.getName();
    };
    Iterator<String> _map = IteratorExtensions.<Utilisateur, String>map(_filter, _function);
    Set<String> _set = IteratorExtensions.<String>toSet(_map);
    final Function1<String, String> _function_1 = (String it) -> {
      return this.genererListe(it);
    };
    Iterable<String> _map_1 = IterableExtensions.<String, String>map(_set, _function_1);
    String _join = IterableExtensions.join(_map_1, "\n");
    _builder.append(_join, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * def genererIndex(Set<String> users) {
   * '''
   * <ul>
   * �FOR user : users�
   * <li><a href="�user�.html">�user�</a></li>
   * �ENDFOR�
   * </ul>
   * '''
   * }
   */
  public String templateImage(final String content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<img uml=\"@startuml");
    _builder.newLine();
    _builder.append("skinparam sequence {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ArrowColor Black");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ActorBorderColor Black");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LifeLineBorderColor Black");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LifeLineBackgroundColor Black");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ParticipantBorderColor Black");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ParticipantBackgroundColor White");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ParticipantFontColor Black");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String genererListe(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    _builder.append(name, "");
    _builder.append(".html\">");
    _builder.append(name, "");
    _builder.append("</a></li> ");
    return _builder.toString();
  }
}
