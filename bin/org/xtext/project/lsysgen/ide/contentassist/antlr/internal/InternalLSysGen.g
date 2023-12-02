/*
 * generated by Xtext 2.32.0
 */
grammar InternalLSysGen;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.project.lsysgen.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.project.lsysgen.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.project.lsysgen.services.LSysGenGrammarAccess;

}
@parser::members {
	private LSysGenGrammarAccess grammarAccess;

	public void setGrammarAccess(LSysGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleCrop
entryRuleCrop
:
{ before(grammarAccess.getCropRule()); }
	 ruleCrop
{ after(grammarAccess.getCropRule()); } 
	 EOF 
;

// Rule Crop
ruleCrop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCropAccess().getGroup()); }
		(rule__Crop__Group__0)
		{ after(grammarAccess.getCropAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrgan
entryRuleOrgan
:
{ before(grammarAccess.getOrganRule()); }
	 ruleOrgan
{ after(grammarAccess.getOrganRule()); } 
	 EOF 
;

// Rule Organ
ruleOrgan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrganAccess().getAlternatives()); }
		(rule__Organ__Alternatives)
		{ after(grammarAccess.getOrganAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLeaves
entryRuleLeaves
:
{ before(grammarAccess.getLeavesRule()); }
	 ruleLeaves
{ after(grammarAccess.getLeavesRule()); } 
	 EOF 
;

// Rule Leaves
ruleLeaves 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLeavesAccess().getGroup()); }
		(rule__Leaves__Group__0)
		{ after(grammarAccess.getLeavesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStems
entryRuleStems
:
{ before(grammarAccess.getStemsRule()); }
	 ruleStems
{ after(grammarAccess.getStemsRule()); } 
	 EOF 
;

// Rule Stems
ruleStems 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStemsAccess().getGroup()); }
		(rule__Stems__Group__0)
		{ after(grammarAccess.getStemsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFruits
entryRuleFruits
:
{ before(grammarAccess.getFruitsRule()); }
	 ruleFruits
{ after(grammarAccess.getFruitsRule()); } 
	 EOF 
;

// Rule Fruits
ruleFruits 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFruitsAccess().getGroup()); }
		(rule__Fruits__Group__0)
		{ after(grammarAccess.getFruitsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMaxAge
entryRuleMaxAge
:
{ before(grammarAccess.getMaxAgeRule()); }
	 ruleMaxAge
{ after(grammarAccess.getMaxAgeRule()); } 
	 EOF 
;

// Rule MaxAge
ruleMaxAge 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMaxAgeAccess().getGroup()); }
		(rule__MaxAge__Group__0)
		{ after(grammarAccess.getMaxAgeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTriLobe_th
entryRuleTriLobe_th
:
{ before(grammarAccess.getTriLobe_thRule()); }
	 ruleTriLobe_th
{ after(grammarAccess.getTriLobe_thRule()); } 
	 EOF 
;

// Rule TriLobe_th
ruleTriLobe_th 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTriLobe_thAccess().getGroup()); }
		(rule__TriLobe_th__Group__0)
		{ after(grammarAccess.getTriLobe_thAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSingleLobe_th
entryRuleSingleLobe_th
:
{ before(grammarAccess.getSingleLobe_thRule()); }
	 ruleSingleLobe_th
{ after(grammarAccess.getSingleLobe_thRule()); } 
	 EOF 
;

// Rule SingleLobe_th
ruleSingleLobe_th 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSingleLobe_thAccess().getGroup()); }
		(rule__SingleLobe_th__Group__0)
		{ after(grammarAccess.getSingleLobe_thAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameter
entryRuleParameter
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterAccess().getAlternatives()); }
		(rule__Parameter__Alternatives)
		{ after(grammarAccess.getParameterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntValue
entryRuleIntValue
:
{ before(grammarAccess.getIntValueRule()); }
	 ruleIntValue
{ after(grammarAccess.getIntValueRule()); } 
	 EOF 
;

// Rule IntValue
ruleIntValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); }
		RULE_INT
		{ after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFloatValue
entryRuleFloatValue
:
{ before(grammarAccess.getFloatValueRule()); }
	 ruleFloatValue
{ after(grammarAccess.getFloatValueRule()); } 
	 EOF 
;

// Rule FloatValue
ruleFloatValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFloatValueAccess().getGroup()); }
		(rule__FloatValue__Group__0)
		{ after(grammarAccess.getFloatValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Organ__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrganAccess().getLeavesParserRuleCall_0()); }
		ruleLeaves
		{ after(grammarAccess.getOrganAccess().getLeavesParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOrganAccess().getStemsParserRuleCall_1()); }
		ruleStems
		{ after(grammarAccess.getOrganAccess().getStemsParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getOrganAccess().getFruitsParserRuleCall_2()); }
		ruleFruits
		{ after(grammarAccess.getOrganAccess().getFruitsParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getMaxAgeParserRuleCall_0()); }
		ruleMaxAge
		{ after(grammarAccess.getParameterAccess().getMaxAgeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getParameterAccess().getTriLobe_thParserRuleCall_1()); }
		ruleTriLobe_th
		{ after(grammarAccess.getParameterAccess().getTriLobe_thParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getParameterAccess().getSingleLobe_thParserRuleCall_2()); }
		ruleSingleLobe_th
		{ after(grammarAccess.getParameterAccess().getSingleLobe_thParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Crop__Group__0__Impl
	rule__Crop__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCropAccess().getNameAssignment_0()); }
	(rule__Crop__NameAssignment_0)
	{ after(grammarAccess.getCropAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Crop__Group__1__Impl
	rule__Crop__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCropAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getCropAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Crop__Group__2__Impl
	rule__Crop__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCropAccess().getOrgansAssignment_2()); }
		(rule__Crop__OrgansAssignment_2)
		{ after(grammarAccess.getCropAccess().getOrgansAssignment_2()); }
	)
	(
		{ before(grammarAccess.getCropAccess().getOrgansAssignment_2()); }
		(rule__Crop__OrgansAssignment_2)*
		{ after(grammarAccess.getCropAccess().getOrgansAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Crop__Group__3__Impl
	rule__Crop__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCropAccess().getParametersAssignment_3()); }
		(rule__Crop__ParametersAssignment_3)
		{ after(grammarAccess.getCropAccess().getParametersAssignment_3()); }
	)
	(
		{ before(grammarAccess.getCropAccess().getParametersAssignment_3()); }
		(rule__Crop__ParametersAssignment_3)*
		{ after(grammarAccess.getCropAccess().getParametersAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Crop__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCropAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getCropAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Leaves__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaves__Group__0__Impl
	rule__Leaves__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeavesAccess().getLeavesAction_0()); }
	()
	{ after(grammarAccess.getLeavesAccess().getLeavesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaves__Group__1__Impl
	rule__Leaves__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeavesAccess().getNameAssignment_1()); }
	(rule__Leaves__NameAssignment_1)
	{ after(grammarAccess.getLeavesAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaves__Group__2__Impl
	rule__Leaves__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeavesAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getLeavesAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Leaves__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeavesAccess().getValueAssignment_3()); }
	(rule__Leaves__ValueAssignment_3)
	{ after(grammarAccess.getLeavesAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stems__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stems__Group__0__Impl
	rule__Stems__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStemsAccess().getStemsAction_0()); }
	()
	{ after(grammarAccess.getStemsAccess().getStemsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stems__Group__1__Impl
	rule__Stems__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStemsAccess().getNameAssignment_1()); }
	(rule__Stems__NameAssignment_1)
	{ after(grammarAccess.getStemsAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stems__Group__2__Impl
	rule__Stems__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStemsAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getStemsAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stems__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStemsAccess().getValueAssignment_3()); }
	(rule__Stems__ValueAssignment_3)
	{ after(grammarAccess.getStemsAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Fruits__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fruits__Group__0__Impl
	rule__Fruits__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFruitsAccess().getFruitsAction_0()); }
	()
	{ after(grammarAccess.getFruitsAccess().getFruitsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fruits__Group__1__Impl
	rule__Fruits__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFruitsAccess().getNameAssignment_1()); }
	(rule__Fruits__NameAssignment_1)
	{ after(grammarAccess.getFruitsAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fruits__Group__2__Impl
	rule__Fruits__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFruitsAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFruitsAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fruits__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFruitsAccess().getValueAssignment_3()); }
	(rule__Fruits__ValueAssignment_3)
	{ after(grammarAccess.getFruitsAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MaxAge__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxAge__Group__0__Impl
	rule__MaxAge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxAgeAccess().getMaxAgeAction_0()); }
	()
	{ after(grammarAccess.getMaxAgeAccess().getMaxAgeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxAge__Group__1__Impl
	rule__MaxAge__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxAgeAccess().getNameAssignment_1()); }
	(rule__MaxAge__NameAssignment_1)
	{ after(grammarAccess.getMaxAgeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxAge__Group__2__Impl
	rule__MaxAge__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxAgeAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getMaxAgeAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxAge__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxAgeAccess().getValueAssignment_3()); }
	(rule__MaxAge__ValueAssignment_3)
	{ after(grammarAccess.getMaxAgeAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TriLobe_th__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriLobe_th__Group__0__Impl
	rule__TriLobe_th__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriLobe_thAccess().getTriLobe_thAction_0()); }
	()
	{ after(grammarAccess.getTriLobe_thAccess().getTriLobe_thAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriLobe_th__Group__1__Impl
	rule__TriLobe_th__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriLobe_thAccess().getNameAssignment_1()); }
	(rule__TriLobe_th__NameAssignment_1)
	{ after(grammarAccess.getTriLobe_thAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriLobe_th__Group__2__Impl
	rule__TriLobe_th__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriLobe_thAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getTriLobe_thAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriLobe_th__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriLobe_thAccess().getValueAssignment_3()); }
	(rule__TriLobe_th__ValueAssignment_3)
	{ after(grammarAccess.getTriLobe_thAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleLobe_th__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleLobe_th__Group__0__Impl
	rule__SingleLobe_th__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleLobe_thAccess().getSingleLobe_thAction_0()); }
	()
	{ after(grammarAccess.getSingleLobe_thAccess().getSingleLobe_thAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleLobe_th__Group__1__Impl
	rule__SingleLobe_th__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleLobe_thAccess().getNameAssignment_1()); }
	(rule__SingleLobe_th__NameAssignment_1)
	{ after(grammarAccess.getSingleLobe_thAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleLobe_th__Group__2__Impl
	rule__SingleLobe_th__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleLobe_thAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getSingleLobe_thAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleLobe_th__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleLobe_thAccess().getValueAssignment_3()); }
	(rule__SingleLobe_th__ValueAssignment_3)
	{ after(grammarAccess.getSingleLobe_thAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FloatValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatValue__Group__0__Impl
	rule__FloatValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatValue__Group__1__Impl
	rule__FloatValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatValueAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getFloatValueAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Crop__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); }
		(
			{ before(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); }
			'Strawberry'
			{ after(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); }
		)
		{ after(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__OrgansAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCropAccess().getOrgansOrganParserRuleCall_2_0()); }
		ruleOrgan
		{ after(grammarAccess.getCropAccess().getOrgansOrganParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Crop__ParametersAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCropAccess().getParametersParameterParserRuleCall_3_0()); }
		ruleParameter
		{ after(grammarAccess.getCropAccess().getParametersParameterParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); }
		(
			{ before(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); }
			'Leaves'
			{ after(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); }
		)
		{ after(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Leaves__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLeavesAccess().getValueIntValueParserRuleCall_3_0()); }
		ruleIntValue
		{ after(grammarAccess.getLeavesAccess().getValueIntValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); }
		(
			{ before(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); }
			'Stems'
			{ after(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); }
		)
		{ after(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stems__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStemsAccess().getValueIntValueParserRuleCall_3_0()); }
		ruleIntValue
		{ after(grammarAccess.getStemsAccess().getValueIntValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); }
		(
			{ before(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); }
			'Fruits'
			{ after(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); }
		)
		{ after(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fruits__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFruitsAccess().getValueIntValueParserRuleCall_3_0()); }
		ruleIntValue
		{ after(grammarAccess.getFruitsAccess().getValueIntValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); }
		(
			{ before(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); }
			'Age'
			{ after(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); }
		)
		{ after(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxAge__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxAgeAccess().getValueIntValueParserRuleCall_3_0()); }
		ruleIntValue
		{ after(grammarAccess.getMaxAgeAccess().getValueIntValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); }
		(
			{ before(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); }
			'TriLobe_th'
			{ after(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); }
		)
		{ after(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriLobe_th__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); }
		ruleFloatValue
		{ after(grammarAccess.getTriLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); }
		(
			{ before(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); }
			'SingleLobe_th'
			{ after(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); }
		)
		{ after(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleLobe_th__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); }
		ruleFloatValue
		{ after(grammarAccess.getSingleLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NEWLINE : '\r'? '\n';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;