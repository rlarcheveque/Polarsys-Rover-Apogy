/**
 *
 * $Id$
 */
package org.eclipse.polarsys.rover.client.validation;

import org.eclipse.polarsys.rover.client.Position;


/**
 * A sample validator interface for {@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PolarSysRoverPlatformClientValidator {
	boolean validate();

	boolean validateInitialized(boolean value);

	boolean validateDisposed(boolean value);

	boolean validatePositionError(double value);

	boolean validateLinearVelocity(double value);

	boolean validateAngularVelocity(double value);

	boolean validateFrontLeftWheelPosition(double value);

	boolean validateFrontRightWheelPosition(double value);

	boolean validateRearLeftWheelPosition(double value);

	boolean validateRearRightWheelPosition(double value);

	boolean validatePosition(Position value);

}
