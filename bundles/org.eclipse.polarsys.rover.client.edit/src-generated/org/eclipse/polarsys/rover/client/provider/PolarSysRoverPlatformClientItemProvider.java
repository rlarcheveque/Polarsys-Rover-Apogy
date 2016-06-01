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
			addLinearVelocityPropertyDescriptor(object);
			addAngularVelocityPropertyDescriptor(object);
			addFrontLeftWheelPositionPropertyDescriptor(object);
			addFrontRightWheelPositionPropertyDescriptor(object);
			addRearLeftWheelPositionPropertyDescriptor(object);
			addRearRightWheelPositionPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Linear Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_linearVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_linearVelocity_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Angular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAngularVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_angularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_angularVelocity_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Front Left Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontLeftWheelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_frontLeftWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_frontLeftWheelPosition_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Front Right Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontRightWheelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_frontRightWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_frontRightWheelPosition_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Rear Left Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRearLeftWheelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_rearLeftWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_rearLeftWheelPosition_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Rear Right Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRearRightWheelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarSysRoverPlatformClient_rearRightWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarSysRoverPlatformClient_rearRightWheelPosition_feature", "_UI_PolarSysRoverPlatformClient_type"),
				 PolarSysRoverClientPackage.Literals.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
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
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__LINEAR_VELOCITY:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__ANGULAR_VELOCITY:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_LEFT_WHEEL_POSITION:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__FRONT_RIGHT_WHEEL_POSITION:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_LEFT_WHEEL_POSITION:
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__REAR_RIGHT_WHEEL_POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PolarSysRoverClientPackage.POLAR_SYS_ROVER_PLATFORM_CLIENT__POSITION:
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