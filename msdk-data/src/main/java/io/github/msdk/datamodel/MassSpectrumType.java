/* 
 * (C) Copyright 2015 by MSDK Development Team
 *
 * This software is dual-licensed under either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */

package io.github.msdk.datamodel;

/**
 * Defines a type of the mass spectrum. For exact definition of the different
 * spectra types, see Deutsch, E. W. (2012). File Formats Commonly Used in Mass
 * Spectrometry Proteomics. Molecular & Cellular Proteomics, 11(12), 1612–1621.
 * doi:10.1074/mcp.R112.019695
 */
public enum MassSpectrumType {

    /**
     * Continuous (profile) mass spectrum. Continuous stream of connected data
     * points forms a spectrum consisting of individual peaks. Peaks represent
     * detected ions. Each peak consists of multiple data points.
     */
    PROFILE,

    /**
     * Thresholded mass spectrum = same as profile, but data points below
     * certain intensity threshold are removed.
     */
    THRESHOLDED,

    /**
     * Centroided mass spectrum = discrete data points, one for each detected
     * ion.
     */
    CENTROIDED;

}
