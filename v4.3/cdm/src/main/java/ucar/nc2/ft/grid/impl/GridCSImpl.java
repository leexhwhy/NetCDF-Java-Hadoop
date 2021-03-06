package ucar.nc2.ft.grid.impl;

import ucar.nc2.dataset.CoordinateAxis1D;
import ucar.nc2.dataset.CoordinateSystem;
import ucar.nc2.dataset.NetcdfDataset;
import ucar.nc2.ft.grid.GridCS;

/**
 * A Grid has a 1D x and y coordinate.
 *
 * @author John
 * @since 12/25/12
 */
public class GridCSImpl extends CoverageCSImpl implements GridCS {

  GridCSImpl(NetcdfDataset ds, CoordinateSystem cs, CoverageCSFactory fac) {
    super(ds, cs, fac);
  }

  @Override
  public boolean isRegularSpatial() {
    return getXHorizAxis().isRegular() && getYHorizAxis().isRegular();
  }

  public CoordinateAxis1D getXHorizAxis() {
    return (CoordinateAxis1D) super.getXHorizAxis();
  }

  public CoordinateAxis1D getYHorizAxis() {
    return (CoordinateAxis1D) super.getYHorizAxis();
  }

  public CoordinateAxis1D getVerticalAxis() {
    return (CoordinateAxis1D) super.getVerticalAxis();
  }

  public CoordinateAxis1D getTimeAxis() {
    return (CoordinateAxis1D) super.getTimeAxis();
  }

}
