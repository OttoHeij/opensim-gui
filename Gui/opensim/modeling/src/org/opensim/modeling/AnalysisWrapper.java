/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AnalysisWrapper extends Analysis {
  private transient long swigCPtr;

  public AnalysisWrapper(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AnalysisWrapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_AnalysisWrapper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_change_ownership(this, swigCPtr, true);
  }

  public static AnalysisWrapper safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AnalysisWrapper(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    if (getClass() == AnalysisWrapper.class) opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject); else opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_assignSwigExplicitAnalysisWrapper(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = (getClass() == AnalysisWrapper.class) ? opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_clone(swigCPtr, this) : opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_cloneSwigExplicitAnalysisWrapper(swigCPtr, this);
    return (cPtr == 0) ? null : new AnalysisWrapper(cPtr, true);
  }

  public String getConcreteClassName() {
    return (getClass() == AnalysisWrapper.class) ? opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_getConcreteClassName(swigCPtr, this) : opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_getConcreteClassNameSwigExplicitAnalysisWrapper(swigCPtr, this);
  }

  public AnalysisWrapper(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalysisWrapper__SWIG_0(Model.getCPtr(aModel), aModel), true);
    opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public AnalysisWrapper() {
    this(opensimActuatorsAnalysesToolsJNI.new_AnalysisWrapper__SWIG_1(), true);
    opensimActuatorsAnalysesToolsJNI.AnalysisWrapper_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
