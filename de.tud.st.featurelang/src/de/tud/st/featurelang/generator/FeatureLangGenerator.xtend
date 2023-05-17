/*
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.generator

import de.tud.st.featurelang.featureLang.AssociationAction
import de.tud.st.featurelang.featureLang.AttributeAction
import de.tud.st.featurelang.featureLang.InheritanceAction
import de.tud.st.featurelang.featureLang.PriorityValue
import de.tud.st.featurelang.featureLang.UpdateAction
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.tud.st.featurelang.featureLang.CreationStatement
import de.tud.st.featurelang.featureLang.ChangeStatement
import de.tud.st.featurelang.featureLang.Statement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
 // @author Karl Kegel 2023
 
class FeatureLangGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val result = resource.allContents
				.filter(Statement)
				.map[compileStatement]
				.join("&\n");
		System.out.println(">>>")
		System.out.println(result)
		System.out.println("<<<")
		fsa.generateFile("evolution.txt", result);
	}
	
	private def compileStatement(Statement s){
		switch s {
			ChangeStatement : s.compile
			CreationStatement : s.compile
			default : 'NOP'
		}
	}
	
	private def compile(ChangeStatement s) '''
		«val should = s.getPriority() !== null && s.getPriority().getPriority() === PriorityValue.SHOULD»
		«IF should»
				START OPTIONAL
		«ENDIF»
		OPEN CLASS «s.getTarget().name»
		«IF s.getAction() !== null »
			«s.getAction().getType().compileAction(s.isNegation())»
		«ELSEIF s.getUpdate() !== null»
			«s.getUpdate().compileUpdate()»
		«ENDIF»
		CLOSE CLASS «s.getTarget().name»
		«IF should»
				END OPTIONAL
		«ENDIF»
    '''
    
    private def compile(CreationStatement s)'''
		«val should = s.getPriority() !== null && s.getPriority().getPriority() === PriorityValue.SHOULD»
		«val name = s.getClassElement().getName()»
		«IF should»
			START OPTIONAL
		«ENDIF»
		«IF s.isNegation() »
			DELETE CLASS «name»
		«ELSE»
			CREATE CLASS «name»
		«ENDIF»
		«IF should»
			END OPTIONAL
		«ENDIF»
    '''
    
	private def compileAction(EObject a, boolean negation){
		switch a {
			AttributeAction : a.compileAttributeAction(negation)
			AssociationAction : a.compileAssociationAction(negation)
			InheritanceAction : a.compileInheritanceAction(negation)
			default : 'NOP'
		}
	}
	
	private def compileAttributeAction(AttributeAction a, boolean negation){
		val attr =  a.getAttribute()
		val attrName = attr.getName()
		'''
		«IF negation»
			DELETE ATTRIBUTE «attrName»
		«ELSE»
			ADD ATTRIBUTE «attrName»
			OPEN ATTRIBUTE «attrName»
			«IF a.getType() !== null»
				SET TYPE «a.getType()»
			«ELSE»
				SET TYPE DEFAULT
			«ENDIF»
			CLOSE ATTRIBUTE «attrName»
		«ENDIF»
		'''
	}
	
	private def compileAssociationAction(AssociationAction a, boolean negation){
		val targetClass = a.getTarget().getName()
		val relation = a.getRelation()
		'''
		«IF negation»
			DELETE ASSOCIATION «relation»
		«ELSE»
			ADD ASSOCIATION «relation» TARGET «targetClass»
		«ENDIF»
		'''
	}
	
	private def compileInheritanceAction(InheritanceAction a, boolean negation){
		val targetClass = a.getParent().getName()
		'''
		«IF negation»
			DELETE PARENT_RELATION «targetClass»
		«ELSE»
			ADD PARENT_RELATION «targetClass»
		«ENDIF»
		'''
	}
	
	private def compileUpdate(UpdateAction a) '''
		«val should = a.getPriority() !== null && a.getPriority().getPriority() === PriorityValue.SHOULD»
		«IF should»
		START OPTIONAL
		«ENDIF»
		OPEN ATTRIBUTE «a.getAttribute().getName()»
		SET TYPE «a.getType()»
		CLOSE ATTRIBUTE «a.getAttribute().getName()»
		«IF should»
		END OPTIONAL
		«ENDIF»
	'''
}
