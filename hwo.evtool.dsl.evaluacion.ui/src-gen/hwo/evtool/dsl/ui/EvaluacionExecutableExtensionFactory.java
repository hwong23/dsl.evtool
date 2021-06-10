/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.ui;

import com.google.inject.Injector;
import hwo.evtool.dsl.evaluacion.ui.internal.EvaluacionActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EvaluacionExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(EvaluacionActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		EvaluacionActivator activator = EvaluacionActivator.getInstance();
		return activator != null ? activator.getInjector(EvaluacionActivator.HWO_EVTOOL_DSL_EVALUACION) : null;
	}

}
