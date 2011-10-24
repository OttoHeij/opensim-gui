/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class GenericModelMaker extends OpenSimObject {
  private long swigCPtr;

  public GenericModelMaker(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.GenericModelMaker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(GenericModelMaker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_GenericModelMaker(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GenericModelMaker() {
    this(opensimModelJNI.new_GenericModelMaker__SWIG_0(), true);
  }

  public GenericModelMaker(GenericModelMaker aGenericModelMaker) {
    this(opensimModelJNI.new_GenericModelMaker__SWIG_1(GenericModelMaker.getCPtr(aGenericModelMaker), aGenericModelMaker), true);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.GenericModelMaker_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void copyData(GenericModelMaker aGenericModelMaker) {
    opensimModelJNI.GenericModelMaker_copyData(swigCPtr, this, GenericModelMaker.getCPtr(aGenericModelMaker), aGenericModelMaker);
  }

  public Model processModel(String aPathToSubject) {
    long cPtr = opensimModelJNI.GenericModelMaker_processModel__SWIG_0(swigCPtr, this, aPathToSubject);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public Model processModel() {
    long cPtr = opensimModelJNI.GenericModelMaker_processModel__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public static void registerTypes() {
    opensimModelJNI.GenericModelMaker_registerTypes();
  }

  public String getModelFileName() {
    return opensimModelJNI.GenericModelMaker_getModelFileName(swigCPtr, this);
  }

  public void setModelFileName(String aFileName) {
    opensimModelJNI.GenericModelMaker_setModelFileName(swigCPtr, this, aFileName);
  }

  public String getMarkerSetFileName() {
    return opensimModelJNI.GenericModelMaker_getMarkerSetFileName(swigCPtr, this);
  }

  public void setMarkerSetFileName(String aFileName) {
    opensimModelJNI.GenericModelMaker_setMarkerSetFileName(swigCPtr, this, aFileName);
  }

}