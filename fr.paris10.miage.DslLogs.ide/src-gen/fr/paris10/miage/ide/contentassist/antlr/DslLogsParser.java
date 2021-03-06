/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.paris10.miage.ide.contentassist.antlr.internal.InternalDslLogsParser;
import fr.paris10.miage.services.DslLogsGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DslLogsParser extends AbstractContentAssistParser {

	@Inject
	private DslLogsGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslLogsParser createParser() {
		InternalDslLogsParser result = new InternalDslLogsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getReponseAccess().getAlternatives(), "rule__Reponse__Alternatives");
					put(grammarAccess.getLogAccess().getGroup(), "rule__Log__Group__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getParametreAccess().getGroup(), "rule__Parametre__Group__0");
					put(grammarAccess.getDemandeAccess().getGroup(), "rule__Demande__Group__0");
					put(grammarAccess.getAppelAccess().getGroup(), "rule__Appel__Group__0");
					put(grammarAccess.getAppelAccess().getGroup_2(), "rule__Appel__Group_2__0");
					put(grammarAccess.getAppelAccess().getGroup_2_2(), "rule__Appel__Group_2_2__0");
					put(grammarAccess.getModelAccess().getLogsAssignment(), "rule__Model__LogsAssignment");
					put(grammarAccess.getLogAccess().getDateAssignment_1(), "rule__Log__DateAssignment_1");
					put(grammarAccess.getLogAccess().getUtilisateurAssignment_3(), "rule__Log__UtilisateurAssignment_3");
					put(grammarAccess.getLogAccess().getActionAssignment_4(), "rule__Log__ActionAssignment_4");
					put(grammarAccess.getLogAccess().getParametreAssignment_5(), "rule__Log__ParametreAssignment_5");
					put(grammarAccess.getLogAccess().getReponseAssignment_7(), "rule__Log__ReponseAssignment_7");
					put(grammarAccess.getDateAccess().getAnneeAssignment_0(), "rule__Date__AnneeAssignment_0");
					put(grammarAccess.getDateAccess().getMoisAssignment_2(), "rule__Date__MoisAssignment_2");
					put(grammarAccess.getDateAccess().getJourAssignment_4(), "rule__Date__JourAssignment_4");
					put(grammarAccess.getDateAccess().getHeureAssignment_6(), "rule__Date__HeureAssignment_6");
					put(grammarAccess.getDateAccess().getMinuteAssignment_8(), "rule__Date__MinuteAssignment_8");
					put(grammarAccess.getDateAccess().getSecondeAssignment_10(), "rule__Date__SecondeAssignment_10");
					put(grammarAccess.getParametreAccess().getNameAssignment_0(), "rule__Parametre__NameAssignment_0");
					put(grammarAccess.getParametreAccess().getValueAssignment_2(), "rule__Parametre__ValueAssignment_2");
					put(grammarAccess.getUtilisateurAccess().getNameAssignment(), "rule__Utilisateur__NameAssignment");
					put(grammarAccess.getDemandeAccess().getPageAssignment_1(), "rule__Demande__PageAssignment_1");
					put(grammarAccess.getAppelAccess().getPageAssignment_1(), "rule__Appel__PageAssignment_1");
					put(grammarAccess.getAppelAccess().getParametresAssignment_2_1(), "rule__Appel__ParametresAssignment_2_1");
					put(grammarAccess.getAppelAccess().getParametresAssignment_2_2_1(), "rule__Appel__ParametresAssignment_2_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDslLogsParser typedParser = (InternalDslLogsParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslLogsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslLogsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
