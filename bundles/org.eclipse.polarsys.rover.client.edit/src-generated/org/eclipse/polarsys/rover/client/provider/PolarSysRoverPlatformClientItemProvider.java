/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package org.eclipse.polarsys.rover.client.provider;


import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.polarsys.rover.client.PolarSysRoverClientFactory;
import org.eclipse.polarsys.rover.client.PolarSysRoverClientPackage;
import org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient;

/**
 * This is the item provider adapter for a {@link org.eclipse.polarsys.rover.client.PolarSysRoverPlatformClient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarSysRoverPlatformClientItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarSysRoverPlatformClientItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitializedPropertyDescriptor(object);
			addDisposedPropertyDescriptor(object);
			addPositionErrorPropertyDescriptor(object);
			addLeftPowerLevelPropertyDescriptor(object);
			addRightPowerLevelPropertyDescriptor(object);
			addLeftWheelPositionPropertyDescriptor(object);
			addRightWheelPositionPropertyDescriptor(object);
			addFrontSonarPropertyDescriptor(object);
			addWheelRadiusPropertyDescriptor(object);
			addWheelTrackPropertyDescriptor(object);
			addMoveWaitPeriodPropertyDescriptor(object);
			addMoveToMinLinSpeedPropertyDescriptor(object);
			addErrorPerMeterPropertyDescriptor(object);
			addMaxPowerLevelPropertyDescriptor(object);
			addMaxCtrPowerLevelPropertyDescriptor(object);
			addMaxAngVelocityPropertyDescriptor(object);
			addMaxLinVelocityPropertyDescriptor(object);
			addDistanceBetweenWheelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	
	/**
	 * This adds a property descriptor for the Initialized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_initialized_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Disposed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisposedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_disposed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_disposed_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Position Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_positionError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_positionError_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Left Power Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftPowerLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_leftPowerLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_leftPowerLevel_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PowerLevelsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Power Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightPowerLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_rightPowerLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_rightPowerLevel_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PowerLevelsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftWheelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_leftWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_leftWheelPosition_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightWheelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_rightWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_rightWheelPosition_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Front Sonar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontSonarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_frontSonar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_frontSonar_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wheel Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWheelRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_wheelRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_wheelRadius_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wheel Track feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWheelTrackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_wheelTrack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_wheelTrack_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move Wait Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveWaitPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_moveWaitPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_moveWaitPeriod_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move To Min Lin Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveToMinLinSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_moveToMinLinSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_moveToMinLinSpeed_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Per Meter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorPerMeterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_ErrorPerMeter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_ErrorPerMeter_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Power Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPowerLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_maxPowerLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_maxPowerLevel_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Ctr Power Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCtrPowerLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_maxCtrPowerLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_maxCtrPowerLevel_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Ang Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAngVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_maxAngVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_maxAngVelocity_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Lin Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLinVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_maxLinVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_maxLinVelocity_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance Between Wheels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistanceBetweenWheelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_distanceBetweenWheels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_distanceBetweenWheels_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION);
			childrenFeatures.add(PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PolarSysRoverPlatformClient polarSysRoverPlatformClient = (PolarSysRoverPlatformClient)object;
		return getString("_UI_PolarSysRoverPlatformClient_type") + " " + polarSysRoverPlatformClient.isInitialized();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PolarSysRoverPlatformClient.class)) {
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__INITIALIZED:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISPOSED:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION_ERROR:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_POWER_LEVEL:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_POWER_LEVEL:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LEFT_WHEEL_POSITION:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__RIGHT_WHEEL_POSITION:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_SONAR:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_RADIUS:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__WHEEL_TRACK:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_WAIT_PERIOD:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MOVE_TO_MIN_LIN_SPEED:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ERROR_PER_METER:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_POWER_LEVEL:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_CTR_POWER_LEVEL:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_ANG_VELOCITY:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__MAX_LIN_VELOCITY:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__DISTANCE_BETWEEN_WHEELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_CAMERA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION,
				 PolarSysRoverClientFactory.eINSTANCE.createPosition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
