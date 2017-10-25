/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Curve extends Module {
  private transient long swigCPtr;

  protected Curve(long cPtr, boolean cMemoryOwn) {
    super(NoiseModuleJNI.Curve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModuleJNI.delete_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Curve() {
    this(NoiseModuleJNI.new_Curve(), true);
  }

  public void AddControlPoint(double inputValue, double outputValue) {
    NoiseModuleJNI.Curve_AddControlPoint(swigCPtr, this, inputValue, outputValue);
  }

  public void ClearAllControlPoints() {
    NoiseModuleJNI.Curve_ClearAllControlPoints(swigCPtr, this);
  }

  public ControlPoint GetControlPointArray() {
    long cPtr = NoiseModuleJNI.Curve_GetControlPointArray(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlPoint(cPtr, false);
  }

  public int GetControlPointCount() {
    return NoiseModuleJNI.Curve_GetControlPointCount(swigCPtr, this);
  }

  public int GetSourceModuleCount() {
    return NoiseModuleJNI.Curve_GetSourceModuleCount(swigCPtr, this);
  }

  public double GetValue(double x, double y, double z) {
    return NoiseModuleJNI.Curve_GetValue(swigCPtr, this, x, y, z);
  }

}
