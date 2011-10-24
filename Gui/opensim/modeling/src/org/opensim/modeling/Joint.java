/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Joint extends ModelComponent {
  private long swigCPtr;

  public Joint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Joint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setup(Model aModel) {
    opensimModelJNI.Joint_setup(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void copyData(Joint aJoint) {
    opensimModelJNI.Joint_copyData(swigCPtr, this, Joint.getCPtr(aJoint), aJoint);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.Joint_copy__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void setBody(Body aBody) {
    opensimModelJNI.Joint_setBody(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public Body getBody() {
    return new Body(opensimModelJNI.Joint_getBody(swigCPtr, this), false);
  }

  public void setLocation(SWIGTYPE_p_SimTK__Vec3 aLocation) {
    opensimModelJNI.Joint_setLocation(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aLocation));
  }

  public void getLocation(SWIGTYPE_p_SimTK__Vec3 rLocation) {
    opensimModelJNI.Joint_getLocation(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(rLocation));
  }

  public void setOrientation(SWIGTYPE_p_SimTK__Vec3 aOrientation) {
    opensimModelJNI.Joint_setOrientation(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aOrientation));
  }

  public void getOrientation(SWIGTYPE_p_SimTK__Vec3 rOrientation) {
    opensimModelJNI.Joint_getOrientation(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(rOrientation));
  }

  public void setParentName(String aName) {
    opensimModelJNI.Joint_setParentName(swigCPtr, this, aName);
  }

  public String getParentName() {
    return opensimModelJNI.Joint_getParentName(swigCPtr, this);
  }

  public void setParentBody(Body aBody) {
    opensimModelJNI.Joint_setParentBody(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public Body getParentBody() {
    return new Body(opensimModelJNI.Joint_getParentBody(swigCPtr, this), false);
  }

  public void setLocationInParent(SWIGTYPE_p_SimTK__Vec3 aLocation) {
    opensimModelJNI.Joint_setLocationInParent(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aLocation));
  }

  public void getLocationInParent(SWIGTYPE_p_SimTK__Vec3 rLocation) {
    opensimModelJNI.Joint_getLocationInParent__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(rLocation));
  }

  public void setOrientationInParent(SWIGTYPE_p_SimTK__Vec3 aOrientation) {
    opensimModelJNI.Joint_setOrientationInParent(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aOrientation));
  }

  public void getOrientationInParent(SWIGTYPE_p_SimTK__Vec3 rOrientation) {
    opensimModelJNI.Joint_getOrientationInParent__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(rOrientation));
  }

  public void getOrientationInChild(double[] rOrientation) {
    opensimModelJNI.Joint_getOrientationInChild(swigCPtr, this, rOrientation);
  }

  public void getOrientationInParent(double[] rOrientation) {
    opensimModelJNI.Joint_getOrientationInParent__SWIG_1(swigCPtr, this, rOrientation);
  }

  public void getLocationInChild(double[] rLocation) {
    opensimModelJNI.Joint_getLocationInChild__SWIG_0(swigCPtr, this, rLocation);
  }

  public void getLocationInParent(double[] rLocation) {
    opensimModelJNI.Joint_getLocationInParent__SWIG_1(swigCPtr, this, rLocation);
  }

  public void setLocationInChild(SWIGTYPE_p_SimTK__Vec3 aLocation) {
    opensimModelJNI.Joint_setLocationInChild(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aLocation));
  }

  public void getLocationInChild(SWIGTYPE_p_SimTK__Vec3 rLocation) {
    opensimModelJNI.Joint_getLocationInChild__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(rLocation));
  }

  public double getLocationInParent(int aXYZ) {
    return opensimModelJNI.Joint_getLocationInParent__SWIG_2(swigCPtr, this, aXYZ);
  }

  public double getLocationInChild(int aXYZ) {
    return opensimModelJNI.Joint_getLocationInChild__SWIG_2(swigCPtr, this, aXYZ);
  }

  public CoordinateSet getCoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_getCoordinateSet(swigCPtr, this), false);
  }

  public boolean getReverse() {
    return opensimModelJNI.Joint_getReverse(swigCPtr, this);
  }

  public int numCoordinates() {
    return opensimModelJNI.Joint_numCoordinates(swigCPtr, this);
  }

  public void checkParentBody() {
    opensimModelJNI.Joint_checkParentBody(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimModelJNI.Joint_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.Joint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public static boolean isKindOf(String type) {
    return opensimModelJNI.Joint_isKindOf(type);
  }

  public boolean isA(String type) {
    return opensimModelJNI.Joint_isA(swigCPtr, this, type);
  }

  public static Joint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Joint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void copy(OpenSimObject aObject) {
    opensimModelJNI.Joint_copy__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void updateName(String aName) {
    opensimModelJNI.Joint_updateName(swigCPtr, this, aName);
  }

}