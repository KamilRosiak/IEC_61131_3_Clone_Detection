import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage;

/**
 * 	This class represents the activator of the RCP E4 platform. You can use it to initialize classes that are needed in the current context.
 *  Its possible to Inject all provided services of the e4 platform like the IEclipseContext.    
 * @author {Kamil Rosiak}
 *
 */
public class Activator implements BundleActivator, BundleListener {
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	
	/**
	 * Initialize the EPackeges to use the meta structure 
	 */
	private void initEP() {
		ConfigurationPackage conf = ConfigurationPackage.eINSTANCE;
		StructuredTextPackage st = StructuredTextPackage.eINSTANCE;
		LanguageElementPackage le = LanguageElementPackage.eINSTANCE;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) {	
		// bundle management
		bundleContext.addBundleListener(this);
		
		// application management
		initialize(bundleContext);		
	}

	private void initialize(BundleContext bundleContext) {
		Activator.context = bundleContext;
		initEP();			
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
//		Activator.context.removeBundleListener(this);
		Activator.context = null;
	}

	@Override
	public void bundleChanged(BundleEvent event) {
	}

}

