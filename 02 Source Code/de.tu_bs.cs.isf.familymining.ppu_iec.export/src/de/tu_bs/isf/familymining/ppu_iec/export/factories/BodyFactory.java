package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Body;

/**
 * {@code <body>..</body>} factory.
 */
@Creatable
@Singleton
public class BodyFactory {

	/**
	 * {@code <ST>..</ST>} factory.
	 */
	@Inject
	public STFactory stFactory;

	/**
	 * @return {@code <body>..</body>}.
	 */
	public Body createBody() {
		Body body = new Body();
		body.setST(stFactory.createST());
		return body;
	}

}
